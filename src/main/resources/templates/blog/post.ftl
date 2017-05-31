<#include "/include/template.ftl" />

<@template title="Detail Blog Post">

<div class="blog">
    <div class="container">

        <div class="col-md-12">

            <h2>
                ${post.title}
            </h2>
            <p class="lead">
                Author: ${post.author.firstName} ${post.author.lastName}
            </p>
            <p><span class="glyphicon glyphicon-time"></span> Posted on ${post.createdDate?date}</p>
            <hr>
            <img class="img-responsive" src="/${post.imageLink}" alt="">
            <hr>
            <p>${post.text}</p>

            <hr>

        </div>

    </div>
</div>
</@template>