[#ftl]
<html lang="cs">
[@c.page title="Můj blog"]
[/@c.page]
<body>
    <div class="container mt-5">
        <h1>Můj Blog</h1>
        [#list posts.content]
        <ul class="list-group">
            [#items as post]
            <li class="list-group-item">
                <h4>${post.title}</h4>
                <p>${post.published?date?string('yyyy-MM-dd')}</p>
                <p>Autor: ${post.author}</p>
                <a href="/post/${post.slug}" class="btn btn-primary">Přečíst</a>
            </li>
            [/#items]
        </ul>
        [/#list]
</body>
</html>
