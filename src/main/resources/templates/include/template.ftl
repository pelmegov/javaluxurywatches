<#macro template title="Welcome in Java Luxury Watches Shop!" enableBreadcrumbs=true>
<!DOCTYPE html>
<html>
<head>
    <title>${title}</title>
    <link href="/css/bootstrap.css" rel="stylesheet" type="text/css" media="all"/>
    <script src="/js/jquery-1.11.0.min.js"></script>
    <link href="/css/style.css" rel="stylesheet" type="text/css" media="all"/>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <script type="application/x-javascript">
        addEventListener("load", function () {
            setTimeout(hideURLbar, 0);
        }, false);
        function hideURLbar() {
            window.scrollTo(0, 1);
        } </script>
    <script src="/js/simpleCart.min.js"></script>
    <script src="/js/main.js"></script>
    <link href="/css/memenu.css" rel="stylesheet" type="text/css" media="all"/>
    <script type="text/javascript" src="/js/memenu.js"></script>
    <script>$(document).ready(function () {
        $(".memenu").memenu();
    });</script>
    <script src="/js/jquery.easydropdown.js"></script>
</head>
<body>
    <#include "header.ftl">
    <#if enableBreadcrumbs><#include "breadcrumbs.ftl"></#if>
    <#nested/>
    <#include "footer.ftl">
</body>
</html>
</#macro>