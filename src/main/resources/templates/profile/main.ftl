<#include "/profile/setting.ftl" />

<@template title="Profile settings">
<form class="form-horizontal" role="form">
    <fieldset>

        <!-- Form Name -->
        <legend>Profile Details</legend>

        <!-- Text input-->
        <div class="form-group">
            <label class="col-sm-2 control-label" for="textinput">First Name</label>
            <div class="col-sm-10">
                <input type="text" placeholder="Enter your name" class="profile-input">
            </div>
        </div>

        <!-- Text input-->
        <div class="form-group">
            <label class="col-sm-2 control-label" for="textinput">Last Name</label>
            <div class="col-sm-10">
                <input type="text" placeholder="Enter your last name" class="profile-input">
            </div>
        </div>

        <!-- Text input-->
        <div class="form-group">
            <label class="col-sm-2 control-label" for="textinput">Email </label>
            <div class="col-sm-10">
                <input type="text" placeholder="Enter your email" class="profile-input">
            </div>
        </div>

        <!-- Text input-->
        <div class="form-group">
            <label class="col-sm-2 control-label" for="textinput">Password</label>
            <div class="col-sm-4">
                <input type="password" placeholder="Password" class="profile-input">
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
                    <button type="submit" class="profile-button">Cancel</button>
                    <button type="submit" class="profile-button">Save</button>
                </div>
            </div>
        </div>

    </fieldset>
</form>
</@template>