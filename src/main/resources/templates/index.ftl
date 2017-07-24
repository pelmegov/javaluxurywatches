<#include "include/template.ftl" />

<@template title="Java Luxury Watches Shop!" enableBreadcrumbs=false>
<!--banner-starts-->
<div class="bnr" id="home">
    <div id="top" class="callbacks_container">
        <ul class="rslides" id="slider4">
            <#list posts as post>
                <li>
                    <a href="/blog/${post.link}"><img src="${post.imageLink}" alt=""/></a>
                </li>
            </#list>
        </ul>
    </div>
    <div class="clearfix"></div>
</div>
<!--banner-ends-->
<!--Slider-Starts-Here-->
<script src="js/responsiveslides.min.js"></script>
<script>
    // You can also use "$(window).load(function() {"
    $(function () {
        // Slideshow 4
        $("#slider4").responsiveSlides({
            auto: true,
            pager: true,
            nav: true,
            speed: 500,
            namespace: "callbacks",
            before: function () {
                $('.events').append("<li>before event fired.</li>");
            },
            after: function () {
                $('.events').append("<li>after event fired.</li>");
            }
        });

    });
</script>
<!--End-slider-script-->
<!--about-starts-->
<div class="about">
    <div class="container">
        <div class="about-top grid-1">
            <div class="col-md-4 about-left">
                <figure class="effect-bubba">
                    <img class="img-responsive" src="images/abt-1.jpg" alt=""/>
                    <figcaption>
                        <h2>Nulla maximus nunc</h2>
                        <p>In sit amet sapien eros Integer dolore magna aliqua</p>
                    </figcaption>
                </figure>
            </div>
            <div class="col-md-4 about-left">
                <figure class="effect-bubba">
                    <img class="img-responsive" src="images/abt-2.jpg" alt=""/>
                    <figcaption>
                        <h4>Mauris erat augue</h4>
                        <p>In sit amet sapien eros Integer dolore magna aliqua</p>
                    </figcaption>
                </figure>
            </div>
            <div class="col-md-4 about-left">
                <figure class="effect-bubba">
                    <img class="img-responsive" src="images/abt-3.jpg" alt=""/>
                    <figcaption>
                        <h4>Cras elit mauris</h4>
                        <p>In sit amet sapien eros Integer dolore magna aliqua</p>
                    </figcaption>
                </figure>
            </div>
            <div class="clearfix"></div>
        </div>
    </div>
</div>
<!--about-end-->

<!--hits-starts-->
<div class="product">
    <div class="container">
        <h1 class="product-block-title">HITS</h1>
        <div class="product-top">
            <#list indexHits?chunk(4) as row>
                <div class="product-one">
                    <#list row as product>
                        <div class="col-md-3 product-left">
                            <div class="product-main simpleCart_shelfItem">
                                <a href="/category/${product.categories?first.link}/${product.id}" class="mask">
                                    <img class="img-responsive zoom-img"
                                         src="${product.images?first.link}" alt="${product.images?first.alt}"/></a>
                                <div class="product-bottom">
                                    <span class="hidden item_id">${product.id}</span>
                                    <h3 class="item_name">${product.title}</h3>
                                    <p>Explore Now</p>
                                    <h4><a class="item_add" href="#"><i></i></a>
                                        <#if (product.discount > 0) >
                                            <span class="product_discount">$${product.price}</span>
                                            <span class=" item_price">
                                                $ ${(product.price - (product.price * product.discount / 100))?floor}
                                            </span>
                                        <#else>
                                            <span class=" item_price">
                                                $ ${product.price}
                                            </span>
                                        </#if>
                                    </h4>
                                </div>
                                <#if (product.discount > 0) >
                                    <div class="srch">
                                        <span>-${product.discount}%</span>
                                    </div>
                                </#if>
                            </div>
                        </div>
                    </#list>
                    <div class="clearfix"></div>
                </div>
            </#list>
        </div>
    </div>
</div>
<!--hits-starts-->

<!--product-starts-->
<div class="product">
    <div class="container">
        <h1 class="product-block-title">PRODUCTS</h1>
        <div class="product-top">
            <#list indexProducts?chunk(4) as row>
                <div class="product-one">
                    <#list row as product>
                        <div class="col-md-3 product-left">
                            <div class="product-main simpleCart_shelfItem">
                                <a href="/category/${product.categories?first.link}/${product.id}" class="mask">
                                    <img class="img-responsive zoom-img"
                                         src="${product.images?first.link}" alt="${product.images?first.alt}"/></a>
                                <div class="product-bottom">
                                    <span class="hidden item_id">${product.id}</span>
                                    <h3 class="item_name">${product.title}</h3>
                                    <p>Explore Now</p>
                                    <h4><a class="item_add" href="#"><i></i></a>
                                        <#if (product.discount > 0) >
                                            <span class="product_discount">$${product.price}</span>
                                            <span class=" item_price">
                                                $ ${(product.price - (product.price * product.discount / 100))?floor}
                                            </span>
                                        <#else>
                                            <span class=" item_price">
                                                $ ${product.price}
                                            </span>
                                        </#if>
                                    </h4>
                                </div>
                                <#if (product.discount > 0) >
                                    <div class="srch">
                                        <span>-${product.discount}%</span>
                                    </div>
                                </#if>
                            </div>
                        </div>
                    </#list>
                    <div class="clearfix"></div>
                </div>
            </#list>
        </div>
    </div>
</div>
<!--product-end-->
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