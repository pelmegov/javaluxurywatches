<#include "/profile/setting.ftl" />

<@template title="Profile settings">
<form class="form-horizontal" name="user" method="post" action="">
    <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
    <fieldset>
        <!-- Form Name -->
        <legend>Profile Details</legend>

        <input type="hidden" name="id" value="${user.id}"/>

        <!-- Text input-->
        <div class="form-group">
            <label class="col-sm-2 control-label" for="textinput">Login</label>
            <div class="col-sm-10">
                <input name="login" type="text" readonly placeholder="Enter your login" class="profile-input"
                       value="<#if (user)?? && (user.login)??>${user.login}</#if>">
            </div>
        </div>

        <!-- Text input-->
        <div class="form-group">
            <label class="col-sm-2 control-label" for="textinput">First Name</label>
            <div class="col-sm-10">
                <input name="firstName" type="text" placeholder="Enter your name" class="profile-input"
                       value="<#if (user)?? && (user.firstName)??>${user.firstName}</#if>">
            </div>
        </div>

        <!-- Text input-->
        <div class="form-group">
            <label class="col-sm-2 control-label" for="textinput">Last Name</label>
            <div class="col-sm-10">
                <input name="lastName" type="text" placeholder="Enter your last name" class="profile-input"
                       value="<#if (user)?? && (user.lastName)??>${user.lastName}</#if>">
            </div>
        </div>

        <!-- Text input-->
        <div class="form-group">
            <label class="col-sm-2 control-label" for="textinput">Email </label>
            <div class="col-sm-10">
                <input name="email" type="text" placeholder="Enter your email" class="profile-input"
                       value="<#if (user)?? && (user.email)??>${user.email}</#if>">
            </div>
        </div>

        <!-- Text input-->
        <div class="form-group">
            <label class="col-sm-2 control-label" for="textinput">Password</label>
            <div class="col-sm-4">
                <input name="password" type="password" placeholder="Password" class="profile-input">
            </div>
        </div>

        <!-- Text input-->
        <div class="form-group">
            <label class="col-sm-2 control-label" for="textinput">Confirm</label>
            <div class="col-sm-4">
                <input type="text" placeholder="Confirm your password" class="profile-input">
            </div>
        </div>

        <div class="form-group">
            <div class="col-sm-offset-2 col-sm-10">
                <div class="pull-right">
                    <button type="submit" class="profile-button">Save</button>
                </div>
            </div>
        </div>

    </fieldset>
</form>
</@template>