<#include "/include/template.ftl" />

<@template title="Profile" enableBreadcrumbs=false>

<div class="container">
    <div class="col-lg-3 col-md-3 hidden-sm hidden-xs">
        <div class="panel panel-default">
            <div class="panel-body">
                <div class="media">
                    <div align="center">
                        <img class="thumbnail img-responsive" src="https://lut.im/7JCpw12uUT/mY0Mb78SvSIcjvkf.png"
                             width="300px" height="300px">
                    </div>
                    <div class="media-body">
                        <hr>
                        <h3><strong>Bio</strong></h3>
                        <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Curabitur vel gravida metus, non
                            ultrices sapien. Morbi odio metus, dapibus non nibh id amet.</p>
                        <hr>
                        <h3><strong>Location</strong></h3>
                        <p>${userDetail.country}, ${userDetail.city}, ${userDetail.address}</p>
                        <hr>
                        <h3><strong>Gender</strong></h3>
                        <p>${userDetail.gender}</p>
                        <hr>
                        <h3><strong>Birthday</strong></h3>
                        <p>${userDetail.dayOfBirth}</p>
                    </div>
                </div>
            </div>
        </div>
    </div>
    <div class="col-lg-9 col-md-9 col-sm-12 col-xs-12">
        <div class="panel panel-default">
            <div class="panel-body">
                    <span>
                        <h1 class="profile-title panel-title pull-left">${user.firstName} ${user.lastName}
                            <small>${user.email}</small> <i
                                    class="fa fa-check text-success" aria-hidden="true" data-toggle="tooltip"
                                    data-placement="bottom" title="John Doe is sharing with you"></i></h1>
                        <div class="dropdown pull-right">
                            <button class="btn btn-success dropdown-toggle" type="button" id="dropdownMenu1"
                                    data-toggle="dropdown" aria-haspopup="true" aria-expanded="true">
                                Friends
                                <span class="caret"></span>
                            </button>
                            <ul class="dropdown-menu" aria-labelledby="dropdownMenu1">
                                <li><a href="#">Familly</a></li>
                                <li><a href="#"><i class="fa fa-fw fa-check" aria-hidden="true"></i> Friends</a></li>
                                <li><a href="#">Work</a></li>
                                <li role="separator" class="divider"></li>
                                <li><a href="#"><i class="fa fa-fw fa-plus" aria-hidden="true"></i> Add a new aspect</a></li>
                            </ul>
                        </div>
                    </span>
                <br><br>
                <i class="fa fa-tags" aria-hidden="true"></i> <a href="/tags/diaspora" class="tag">#diaspora</a> <a
                    href="/tags/hashtag" class="tag">#hashtag</a> <a href="/tags/caturday" class="tag">#caturday</a>
                <br><br>
                <hr>
                <span class="pull-left">
                        <a href="#" class="btn-profile btn btn-link"><i class="fa fa-fw fa-files-o"
                                                                        aria-hidden="true"></i> Posts</a>
                        <a href="#" class="btn-profile btn btn-link"><i class="fa fa-fw fa-picture-o"
                                                                        aria-hidden="true"></i> Photos <span
                                class="badge">42</span></a>
                        <a href="#" class="btn-profile btn btn-link"><i class="fa fa-fw fa-users"
                                                                        aria-hidden="true"></i> Contacts <span
                                class="badge">42</span></a>
                    </span>
                <span class="pull-right">
                        <a href="#" class="btn-profile btn btn-link""><i class="fa fa-lg fa-at"
                                                                         aria-hidden="true"
                                                                         data-toggle="tooltip"
                                                                         data-placement="bottom"
                                                                         title="Mention"></i></a>
                    <a href="#" class="btn-profile btn btn-link"><i class="fa fa-lg fa-envelope-o"
                                                                    aria-hidden="true"
                                                                    data-toggle="tooltip"
                                                                    data-placement="bottom"
                                                                    title="Message"></i></a>
                        <a href="#" class="btn-profile btn btn-link"><i class="fa fa-lg fa-ban"
                                                                        aria-hidden="true"
                                                                        data-toggle="tooltip"
                                                                        data-placement="bottom"
                                                                        title="Ignore"></i></a>
                    </span>
            </div>
        </div>
        <hr>
        <!-- Simple post content example. -->
        <div class="panel panel-default">
            <div class="panel-body">
                <div class="pull-left">
                    <a href="#">
                        <img class="profile-media media-object img-circle"
                             src="https://lut.im/7JCpw12uUT/mY0Mb78SvSIcjvkf.png"
                             width="50px" height="50px">
                    </a>
                </div>
                <h4><a class="profile-media" href="#"><strong>${user.firstName} ${user.lastName}</strong></a> –
                    <small>
                        <small><a class="profile-media" href="#"><i><i class="fa fa-clock-o"
                                                                       aria-hidden="true"></i>
                            42 minutes ago</i></a></small>
                    </small>
                </h4>
                <hr>
                <div class="post-content">
                    <p>Simple post content example.</p>
                    <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Curabitur vel gravida metus, non
                        ultrices sapien. Morbi odio metus, dapibus non nibh id amet.</p>
                </div>
                <hr>
                <div>
                    <div class="pull-right btn-group-xs">
                        <a class="btn btn-default btn-xs"><i class="fa fa-heart" aria-hidden="true"></i> Like</a>
                        <a class="btn btn-default btn-xs"><i class="fa fa-retweet" aria-hidden="true"></i>
                            Reshare</a>
                        <a class="btn btn-default btn-xs"><i class="fa fa-comment" aria-hidden="true"></i>
                            Comment</a>
                    </div>
                    <div class="pull-left">
                        <p class="text-muted""><i class="fa fa-globe"
                                                  aria-hidden="true"></i> Public</p>
                    </div>
                    <br>
                </div>
                <hr>

            </div>
        </div>
    </div>
</div>
</@template>