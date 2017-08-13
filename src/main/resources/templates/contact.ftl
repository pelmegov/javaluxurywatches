<#include "/include/template.ftl" />
<#import "/spring.ftl" as spring/>

<@template title="Contact">
<!--contact-start-->
<div class="contact">
    <div class="container">

        <#if isSended??>
            <#if isSended>
                <script>
                    messageSendSuccess();
                </script>
            <#else>
                <script>
                    messageSendError();
                </script>
            </#if>
        </#if>

        <div class="contact-top heading">
            <h2>CONTACT</h2>
        </div>
        <div class="contact-text">
            <div class="col-md-3 contact-left">
                <div class="address">
                    <h5>Address</h5>
                    <p>The company name,
                        <span>Lorem ipsum dolor,</span>
                        Glasglow Dr 40 Fe 72.</p>
                </div>
                <div class="address">
                    <h5>Address1</h5>
                    <p>Tel:1115550001,
                        <span>Fax:190-4509-494</span>
                        Email: <a href="mailto:example@email.com">contact@example.com</a></p>
                </div>
            </div>
            <div class="col-md-9 contact-right">
                <form action="/contact" method="post">

                    <div class="control-group control-group-small">
                        <@spring.bind "contactForm.name"/>
                        <input type="text" placeholder="Name *" name="name" required=""
                               value="<#if (user)?? && (user.firstName)??>${user.firstName}</#if>">
                        <div class="controls">
                            <#list spring.status.errorMessages as error>
                                <span class="help-inline">${error}</span><br>
                            </#list>
                        </div>
                    </div>

                    <div class="control-group control-group-small">
                        <@spring.bind "contactForm.phone"/>
                        <input type="text" placeholder="Phone" name="phone">
                        <div class="controls">
                            <#list spring.status.errorMessages as error>
                                <span class="help-inline">${error}</span><br>
                            </#list>
                        </div>
                    </div>

                    <div class="control-group control-group-small">
                        <@spring.bind "contactForm.email"/>
                        <input type="text" placeholder="Email *" name="email" required=""
                               value="<#if (user)?? && (user.email)??>${user.email}</#if>">
                        <div class="controls">
                            <#list spring.status.errorMessages as error>
                                <span class="help-inline">${error}</span><br>
                            </#list>
                        </div>
                    </div>

                    <div class="control-group">
                        <@spring.bind "contactForm.message"/>
                        <textarea placeholder="Message *" name="message" required=""></textarea>
                        <div class="controls">
                            <#list spring.status.errorMessages as error>
                                <span class="help-inline">${error}</span><br>
                            </#list>
                        </div>
                    </div>

                    <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
                    <div class="submit-btn">
                        <input type="submit" value="SUBMIT">
                    </div>
                </form>
            </div>
            <div class="clearfix"></div>
        </div>
    </div>
</div>
<!--contact-end-->
<!--map-start-->
<div class="map">
    <iframe src="https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d33871.023527102014!2d30.32549950204633!3d59.94667194097548!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x0%3A0x3e676f3bea7153b7!2sSavior+on+the+Spilled+Blood!5e0!3m2!1sen!2sru!4v1495052099043"
            style="border:0"></iframe>
</div>
<!--map-end-->
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