<#macro template title="Profile setting">

    <#include "/include/template.ftl" />

    <@template title="Settings" enableBreadcrumbs=false>
    <div class="container">
        <div class="col-lg-3 col-md-3 hidden-sm hidden-xs">
            <div class="panel panel-default">
                <div class="panel-body">
                    <div class="media">
                        <div align="center">
                            <img class="thumbnail img-responsive" src="/images/avatar.jpg"
                                 width="300px" height="300px">
                        </div>
                        <div class="media-body">
                            <div class="list-group">
                                <a href="/users/profile" class="list-group-item">Profile</a>
                                <a href="#" class="list-group-item disabled">
                                    Setting
                                </a>
                                <a href="/users/profile/setting" class="list-group-item">Profile Details</a>
                                <a href="/users/profile/account" class="list-group-item">Account</a>
                                <a href="#" class="list-group-item">
                                    <span class="badge">3</span>
                                    Support</a>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <div class="col-lg-9 col-md-9 col-sm-12 col-xs-12">
            <div class="panel panel-default">
                <div class="panel-body">
                    <#nested/>
                </div>
            </div>
        </div>
    </div>

    </@template>
</#macro>