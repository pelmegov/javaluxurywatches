<#include "/include/template.ftl" />

<@template title="Shop Product Checkout">

<!--start-ckeckout-->
<div class="ckeckout">
    <div class="container">
        <div class="ckeck-top heading">
            <h2>CHECKOUT</h2>
        </div>
        <div class="ckeckout-top">
            <div class="cart-items">
                <h3>My Shopping Bag (<span class="simpleCart_quantity"></span>)</h3>
                <div class="in-check" >
                    <ul class="unit">
                        <li><span>Item</span></li>
                        <li><span>Product Name</span></li>
                        <li><span>Quantity</span></li>
                        <li><span>Unit Price</span></li>
                        <div class="clearfix"></div>
                    </ul>
                    <#-- This is a cart items. See main.js file for more information. -->
                    <div class="simpleCart_items"></div>
                </div>
            </div>
        </div>
    </div>
</div>
<!--end-ckeckout-->

</@template>