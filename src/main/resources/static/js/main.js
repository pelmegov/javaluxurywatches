// simple cart

// after add item in cart
simpleCart.bind('afterAdd', function (item) {
    console.log(item.get("id") + ") " + item.get("name") + " - successfully added in cart!");
});