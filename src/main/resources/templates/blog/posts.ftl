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
                <#if !isFirstPage>
                    <li class="previous">
                        <a href="/blog?size=${blogPageSize}&page=${currentPage - 1}">&larr; Older</a>
                    </li>
                </#if>
                <#if !isLastPage>
                    <li class="next">
                        <a href="/blog?size=${blogPageSize}&page=${currentPage + 1}">Newer &rarr;</a>
                    </li>
                </#if>
            </ul>

        </div>

    </div>
</div>
</@template>