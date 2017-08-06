<#include "/profile/setting.ftl" />

<@template title="Profile settings">
<form class="form-horizontal" role="form">
    <fieldset>

        <!-- Form Name -->
        <legend>Address Details</legend>

        <!-- Text input-->
        <div class="form-group">
            <label class="col-sm-2 control-label" for="textinput">Line 1</label>
            <div class="col-sm-10">
                <input type="text" placeholder="Address Line 1" class="profile-input">
            </div>
        </div>

        <!-- Text input-->
        <div class="form-group">
            <label class="col-sm-2 control-label" for="textinput">Line 2</label>
            <div class="col-sm-10">
                <input type="text" placeholder="Address Line 2" class="profile-input">
            </div>
        </div>

        <!-- Text input-->
        <div class="form-group">
            <label class="col-sm-2 control-label" for="textinput">City</label>
            <div class="col-sm-10">
                <input type="text" placeholder="City" class="profile-input">
            </div>
        </div>

        <!-- Text input-->
        <div class="form-group">
            <label class="col-sm-2 control-label" for="textinput">State</label>
            <div class="col-sm-4">
                <input type="text" placeholder="State" class="profile-input">
            </div>
        </div>

        <!-- Text input-->
        <div class="form-group">
            <label class="col-sm-2 control-label" for="textinput">Postcode</label>
            <div class="col-sm-4">
                <input type="text" placeholder="Post Code" class="profile-input">
            </div>
        </div>

        <!-- Text input-->
        <div class="form-group">
            <label class="col-sm-2 control-label" for="textinput">Country</label>
            <div class="col-sm-10">
                <input type="text" placeholder="Country" class="profile-input">
            </div>
        </div>

        <div class="form-group">
            <div class="col-sm-offset-2 col-sm-10">
                <div class="pull-right">
                    <button type="submit" class="profile-button">Cancel</button>
                    <button type="submit" class="profile-button">Save
                    </button>
                </div>
            </div>
        </div>

    </fieldset>
</form>
</@template>