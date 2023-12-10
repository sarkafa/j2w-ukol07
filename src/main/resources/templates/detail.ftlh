[#ftl]
<html lang="cs">
[@c.page title="Příspěvek"]
[/@c.page]
<body>
    <div class="container mt-5">
        <h2>${post.title}</h2>
        <p>Publikováno: ${post.published}</p>
        <p>Autor: ${post.author}</p>
        <div>${post.body?no_esc}</div>

        <a href="/" class="btn btn-primary">Zpět na blog</a>
    </div>
</body>
</html>