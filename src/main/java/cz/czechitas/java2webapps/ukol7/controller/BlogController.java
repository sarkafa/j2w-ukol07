package cz.czechitas.java2webapps.ukol7.controller;

import cz.czechitas.java2webapps.ukol7.service.BlogService;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping
public class BlogController {

    private final BlogService blogService;
    public BlogController(BlogService blogService) {
        this.blogService = blogService;
    }

    @GetMapping("")
    public ModelAndView seznam() {
        System.out.println("DEBDEB");
        System.out.println(blogService.list());
        return new ModelAndView("index")
            .addObject("posts", blogService.list());
    }

    @GetMapping("/post/{slug}")
    public ModelAndView post(@PathVariable String slug) {
        return new ModelAndView("detail").addObject("post", blogService.singlePost(slug));
    }




}
