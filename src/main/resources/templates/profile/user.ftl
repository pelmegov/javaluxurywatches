<#include "/include/template.ftl" />

<@template title="Profile" enableBreadcrumbs=false>

<div class="container">
    <div class="col-lg-3 col-md-3 hidden-sm hidden-xs">
        <div class="panel panel-default">
            <div class="panel-body">
                <div class="media">
                    <div align="center">
                        <img class="thumbnail img-responsive" src="/images/avatar.jpg"
                             width="300px" height="300px">
                        <h3>
                            <strong>${user.firstName} ${user.lastName}
                                <a href="/users/profile/setting">
                                    <small>
                                        <span class="glyphicon glyphicon-pencil" aria-hidden="true"></span>
                                    </small>
                                </a>
                            </strong>
                        </h3>
                    </div>
                    <div class="media-body">
                        <hr>
                        <h3><strong>Bio</strong></h3>
                        <p><span class="glyphicon glyphicon-list-alt" aria-hidden="true"></span> Email: ${user.email}
                        </p>
                        <p><span class="glyphicon glyphicon-earphone" aria-hidden="true"></span> Phone: ${user.phone}
                        </p>
                        <hr>
                        <h3><strong>Location</strong></h3>
                        <p>Country: ${userDetail.country}</p>
                        <p>City: ${userDetail.city}</p>
                        <p>Address: ${userDetail.address}</p>
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
                <span class="pull-left">
                        <a href="#" class="btn-profile btn btn-link"><i class="fa fa-fw fa-files-o"
                                                                        aria-hidden="true"></i> Archive
                        <span
                                class="badge">15</span></a>
                        <a href="#" class="btn-profile btn btn-link"><i class="fa fa-fw fa-picture-o"
                                                                        aria-hidden="true"></i> Like <span
                                class="badge">42</span></a>
                        <a href="#" class="btn-profile btn btn-link"><i class="fa fa-fw fa-users"
                                                                        aria-hidden="true"></i> Desires</a>
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
                             src="/images/avatar.jpg"
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
                    <table class="table">
                        <thead class="">
                        <tr>
                            <th>Order</th>
                            <th>Order Date</th>
                            <th>Delivery address</th>
                            <th>Recipient</th>
                            <th>Payment</th>
                        </tr>
                        </thead>
                        <tbody>
                        <tr>
                            <td>
                                <div align="center">
                                    <img src="/images/p-2.png" width="50,25px" height="80px">
                                </div>
                            </td>
                            <td>September 14, 2017</td>
                            <td>${userDetail.country}, ${userDetail.city}, ${userDetail.address}</td>
                            <td>${user.firstName} ${user.lastName}</td>
                            <td>MasterCard</td>
                        </tr>
                        <tr>
                            <td>
                                <div align="center">
                                    <img src="/images/p-3.png" width="50,25px" height="80px">
                                </div>
                            </td>
                            <td>September 14, 2017</td>
                            <td>${userDetail.country}, ${userDetail.city}, ${userDetail.address}</td>
                            <td>${user.firstName} ${user.lastName}</td>
                            <td>VISA</td>
                        </tr>
                        <tr>
                            <td>
                                <div align="center">
                                    <img src="/images/p-4.png" width="50,25px" height="80px">
                                </div>
                            </td>
                            <td>September 14, 2017</td>
                            <td>${userDetail.country}, ${userDetail.city}, ${userDetail.address}</td>
                            <td>${user.firstName} ${user.lastName}</td>
                            <td>C.O.D.</td>
                        </tr>
                        </tbody>
                    </table>
                </div>
                <hr>
                <div>
                    <div class=" pull-right btn-group-xs">
                        <a class="btn btn-default btn-xs"><i class="fa fa-heart" aria-hidden="true"></i>
                            Like</a>
                        <a class="btn btn-default btn-xs"><i class="fa fa-retweet" aria-hidden="true"></i>
                            Reshare</a>
                        <a class="btn btn-default btn-xs"><i class="fa fa-comment" aria-hidden="true"></i>
                            Comment</a>
                    </div>
                    <br>
                </div>
            </div>
        </div>
    </div>
</div>
</@template>