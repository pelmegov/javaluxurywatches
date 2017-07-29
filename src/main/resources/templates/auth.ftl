<#include "/include/template.ftl" />

<@template title="Authorization page">
<!--account-starts-->
<div class="account">
    <div class="container">
        <div class="account-top heading">
            <h2>ACCOUNT</h2>
        </div>
        <div class="account-main">
            <div class="col-md-6 account-left">
                <h3>Existing User</h3>
                <div class="account-bottom">
                    <form action="/authorization" method="post">
                        <input placeholder="Login" type="text" name="username" tabindex="3" required>
                        <input placeholder="Password" type="password" name="password" tabindex="4" required>
                        <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
                        <div class="address">
                            <a class="forgot" href="#">Forgot Your Password?</a>
                            <input type="submit" value="Login">
                        </div>
                    </form>
                </div>
            </div>
            <div class="col-md-6 account-right account-left">
                <h3>New User? Create an Account</h3>
                <p>By creating an account with our store, you will be able to move through the checkout process faster, store multiple shipping addresses, view and track your orders in your account and more.</p>
                <a href="/registration">Create an Account</a>
            </div>
            <div class="clearfix"></div>
        </div>
    </div>
</div>
<!--account-end-->
</@template>