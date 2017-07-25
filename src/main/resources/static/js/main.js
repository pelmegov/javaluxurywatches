// simple cart

// after add item in cart
simpleCart.bind('afterAdd', function (item) {
    console.log(item.get("id") + ") " + item.get("name") + " - successfully added in cart!");
});

// cart columns
simpleCart({
    cartColumns: [
        {
            view: function(item, column){
                // html content include in <div class="simpleCart_items"></div>
                var html =
                    "<ul class='cartitem" + item.get('id') + " cart-header'>\n" +
                    "<div class='closebutton" + item.get('id') + " simpleCart_remove close'> </div>\n" +
                    "<li class='ring-in'>\n" +
                    "<a href='" + item.get('item-link') + "'>\n" +
                    "<img src='" + item.get('image-link') + "' class='img-responsive cart-img' alt='" + item.get('image-alt') + "'>\n" +
                    "</a>\n" +
                    "</li>" +
                    "<li><span class='name'>" + item.get('name') + "</span></li>" +
                    "<li><span class='cost'>" + item.get('price') + "</span></li>" +
                    "<li><span>Free</span><p>Delivered in 2-3 business days</p></li>\n" +
                    "<div class='clearfix'> </div>\n" +
                    "</ul>";

                // javascript content include in <div class="simpleCart_items"></div>
                var javascript =
                    "<script>" +
                    "$('.closebutton" + item.get('id') + "').on('click', function (c) {" +
                    "$('.cartitem" + item.get('id') + "').fadeOut('slow', function (c) {" +
                    "$('.cartitem" + item.get('id') + "').remove();" +
                    "});" +
                    "});" +
                    "<\/script>";

                return html + javascript;
            },
            attr: "cart"
        }
    ]
});