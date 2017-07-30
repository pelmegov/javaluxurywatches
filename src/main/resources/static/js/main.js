// simple cart

// after add item in cart
simpleCart.bind('afterAdd', function (item) {
    console.log(item.get("id") + ") " + item.get("name") + " - successfully added in cart!");

    // popup after add item in cart
    $.notify({
        // options
        icon: 'glyphicon glyphicon-shopping-cart',
        title: 'Success!',
        message: 'Successfully added '+ item.get("name") +' in your cart.',
        target: '_blank'
    },{
        type: "success"
    });

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
                    "<li><span class='cost'>" + item.get('quantity') + "</span></li>" +
                    "<li><span class='cost'>" + item.get('price') + " $</span></li>" +
                    "<li><span class='cost'>" + (item.get('price') * item.get('quantity')) + " $</span></li>" +
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

// message popups
function messageSendSuccess() {
    $.notify({
        // options
        icon: 'glyphicon glyphicon-envelope',
        title: 'Thank You!',
        message: 'Email succesfully sended.',
        target: '_blank'
    },{
        type: "success"
    })
}
function messageSendError() {
    $.notify({
        // options
        icon: 'glyphicon glyphicon-envelope',
        title: 'Error!',
        message: 'Email not sended, sorry. Please, try again later...',
        target: '_blank'
    },{
        type: "danger"
    })
}
