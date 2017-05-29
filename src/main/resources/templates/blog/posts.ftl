<#include "/include/template.ftl" />

<@template title="Blog pages">

<div class="blog">
    <div class="container">

        <!-- Blog Entries Column -->
        <div class="col-md-12">

            <#list posts as post>

            <h2>
                <a href="/blog/${post.link}">${post.title}</a>
            </h2>
            <hr>
            <img class="img-responsive" src="/${post.imageLink}" alt="">
            <hr>
            <p>${post.text}</p>
            <a class="btn btn-default" href="/blog/${post.link}">Read More <span class="glyphicon glyphicon-chevron-right"></span></a>

            <hr>

            </#list>

            <!-- Pager -->
            <ul class="pager">
                <li class="previous">
                    <a href="#">&larr; Older</a>
                </li>
                <li class="next">
                    <a href="#">Newer &rarr;</a>
                </li>
            </ul>

        </div>

    </div>
</div>
</@template>