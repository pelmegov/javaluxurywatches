<!--top-header-->
<div class="top-header">
    <div class="container">
        <div class="top-header-main">
            <div class="col-md-6 top-header-left">
                <div class="drop">
                    <div class="box">
                        <select tabindex="4" class="dropdown drop">
                            <option value="" class="label">Dollar :</option>
                            <option value="1">Dollars</option>
                            <option value="2">Rubles</option>
                        </select>
                    </div>
                    <div class="box1">
                        <select tabindex="4" class="dropdown">
                            <option value="" class="label">English :</option>
                            <option value="1">English</option>
                            <option value="2">Russian</option>
                        </select>
                    </div>
                    <div class="clearfix"></div>
                </div>
            </div>
            <div class="col-md-offset-2 col-md-2 top-header-left">
            <#if (user)??>
                <div class="drop">
                             <span class="user-avatar pull-left" style="margin-right:8px; margin-top:-5px;">
                                        <img src="https://lut.im/7JCpw12uUT/mY0Mb78SvSIcjvkf.png"
                                             class="img-responsive img-circle" title="John Doe" alt="John Doe"
                                             width="30px" height="30px">
                                    </span>
                    <div class="box">
                        <select tabindex="4" class="dropdown drop"
                                onchange="if (this.value) window.location.href=this.value">
                            <option value="" class="label">${user.firstName}</option>
                            <option value="/users/profile">Profile</option>
                            <option value="/users/profile/setting">Setting</option>
                            <option value="/logout">Logout</option>
                        </select>
                    </div>
                <#--<div class="clearfix"></div>-->
                </div>

            </#if>
            <#if !(user)??>
                <div class="auth_reg">
                    <a href="/authorization">Authorization</a>
                </div>
                <div class="auth_reg">
                    <a href="/registration">Registration</a>
                </div>
            </#if>
            </div>
            <div class="col-md-2 top-header-left">
                <div class="cart box_1">
                    <a class="simpleCart_checkout" href="/checkout">
                        <div class="total">
                            <span class="simpleCart_total"></span></div>
                        <img src="/images/cart-1.png" alt="Cart"/>
                    </a>
                    <p><a href="javascript:;" class="simpleCart_empty">Empty Cart</a></p>
                    <div class="clearfix"></div>
                </div>
            </div>
            <div class="clearfix"></div>
        </div>
    </div>
</div>
<!--top-header-->
<!--start-logo-->
<div class="logo">
    <a href="/"><h1>Luxury Watches</h1></a>
</div>
<!--start-logo-->
<!--bottom-header-->
<div class="header-bottom">
    <div class="container">
        <div class="header">
            <div class="col-md-9 header-left">
                <div class="top-nav">
                    <ul class="memenu skyblue">
                        <li class="active"><a href="/">Home</a></li>
                    <#list categories as category>
                        <li class="grid"><a
                                href="/category/${category.link}?size=${categoryPageSize}">${category.title}</a></li>
                    </#list>
                        <li class="grid"><a href="/blog?size=${blogPageSize}">Blog</a></li>
                        <li class="grid"><a href="/contact">Contact</a></li>
                    </ul>
                </div>
                <div class="clearfix"></div>
            </div>
            <div class="col-md-3 header-right">
                <div class="search-bar">
                    <input value="Search" onfocus="this.value = '';"
                           onblur="if (this.value == '') {this.value = 'Search';}">
                    <input type="submit" value="">
                </div>
            </div>
            <div class="clearfix"></div>
        </div>
    </div>
</div>
<!--bottom-header-->