<#include "include/template.ftl" />

<@template title="Blog">

<div class="blog">
    <div class="container">

        <!-- Blog Entries Column -->
        <div class="col-md-12">

            <#list posts as post>

            <h2>
                <a href="${post.link}">${post.title}</a>
            </h2>
            <p class="lead">
                Author: ${post.author.firstName} ${post.author.lastName}
            </p>
            <p><span class="glyphicon glyphicon-time"></span> Posted on ${post.createdDate?date}</p>
            <hr>
            <img class="img-responsive" src="${post.imageLink}" alt="">
            <hr>
            <p>${post.text}</p>
            <a class="btn btn-default" href="#">Read More <span class="glyphicon glyphicon-chevron-right"></span></a>

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