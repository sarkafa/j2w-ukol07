package cz.czechitas.java2webapps.ukol7.repository;

import cz.czechitas.java2webapps.ukol7.entity.Post;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface BlogRepository extends JpaRepository<Post, Long> {

    @Query("SELECT e FROM Post e WHERE e.slug = :slugVAlue")
    Post findBySlug(@Param("slugVAlue") String slug);

    @Query("SELECT p FROM Post p WHERE p.published IS NOT NULL AND p.published <= current_date ORDER BY p.published DESC")
    Page<Post> findPublishedPostsOrderBy(Pageable pageable);

}
