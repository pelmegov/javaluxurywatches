<#include "include/template.ftl" />

<@template title="Register page">
<!--register-starts-->
<div class="register">
    <div class="container">
        <div class="register-top heading">
            <h2>REGISTER</h2>
        </div>
        <div class="register-main">
            <div class="col-md-6 account-left">
                <input placeholder="First name" type="text" tabindex="1" required>
                <input placeholder="Last name" type="text" tabindex="2" required>
                <input placeholder="Email address" type="text" tabindex="3" required>
                <input placeholder="Mobile" type="text" tabindex="3" required>
                <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
                <ul>
                    <li><label class="radio left"><input type="radio" name="radio" checked=""><i></i>Male</label></li>
                    <li><label class="radio"><input type="radio" name="radio"><i></i>Female</label></li>
                    <div class="clearfix"></div>
                </ul>
            </div>
            <div class="col-md-6 account-left">
                <input placeholder="Password" type="password" tabindex="4" required>
                <input placeholder="Retype password" type="password" tabindex="4" required>
            </div>
            <div class="clearfix"></div>
        </div>
        <div class="address submit">
            <input type="submit" value="Submit">
        </div>
    </div>
</div>
<!--register-end-->
<!--information-starts-->
<div class="information">
    <div class="container">
        <div class="infor-top">
            <div class="col-md-3 infor-left">
                <h3>Follow Us</h3>
                <ul>
                    <li><a href="#"><span class="fb"></span><h6>Facebook</h6></a></li>
                    <li><a href="#"><span class="twit"></span><h6>Twitter</h6></a></li>
                    <li><a href="#"><span class="google"></span><h6>Google+</h6></a></li>
                </ul>
            </div>
            <div class="col-md-3 infor-left">
                <h3>Information</h3>
                <ul>
                    <li><a href="#"><p>Specials</p></a></li>
                    <li><a href="#"><p>New Products</p></a></li>
                    <li><a href="#"><p>Our Stores</p></a></li>
                    <li><a href="contact.html"><p>Contact Us</p></a></li>
                    <li><a href="#"><p>Top Sellers</p></a></li>
                </ul>
            </div>
            <div class="col-md-3 infor-left">
                <h3>My Account</h3>
                <ul>
                    <li><a href="account.html"><p>My Account</p></a></li>
                    <li><a href="#"><p>My Credit slips</p></a></li>
                    <li><a href="#"><p>My Merchandise returns</p></a></li>
                    <li><a href="#"><p>My Personal info</p></a></li>
                    <li><a href="#"><p>My Addresses</p></a></li>
                </ul>
            </div>
            <div class="col-md-3 infor-left">
                <h3>Store Information</h3>
                <h4>The company name,
                    <span>Lorem ipsum dolor,</span>
                    Glasglow Dr 40 Fe 72.</h4>
                <h5>+955 123 4567</h5>
                <p><a href="mailto:example@email.com">contact@example.com</a></p>
            </div>
            <div class="clearfix"></div>
        </div>
    </div>
</div>
<!--information-end-->
</@template>