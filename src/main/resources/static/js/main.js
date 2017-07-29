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
        // settings
        element: 'body',
        position: null,
        type: "success",
        allow_dismiss: true,
        newest_on_top: false,
        showProgressbar: false,
        placement: {
            from: "top",
            align: "right"
        },
        offset: 20,
        spacing: 10,
        z_index: 1031,
        delay: 5000,
        timer: 1000,
        url_target: '_blank',
        mouse_over: null,
        animate: {
            enter: 'animated fadeInDown',
            exit: 'animated fadeOutUp'
        },
        onShow: null,
        onShown: null,
        onClose: null,
        onClosed: null,
        icon_type: 'class',
        template: '<div data-notify="container" class="col-xs-11 col-sm-3 alert alert-{0}" role="alert">' +
        '<button type="button" aria-hidden="true" class="close" data-notify="dismiss">×</button>' +
        '<span data-notify="icon"></span> ' +
        '<span data-notify="title">{1}</span><br> ' +
        '<span data-notify="message">{2}</span>' +
        '<div class="progress" data-notify="progressbar">' +
        '<div class="progress-bar progress-bar-{0}" role="progressbar" aria-valuenow="0" aria-valuemin="0" aria-valuemax="100" style="width: 0%;"></div>' +
        '</div>' +
        '<a href="{3}" target="{4}" data-notify="url"></a>' +
        '</div>'
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