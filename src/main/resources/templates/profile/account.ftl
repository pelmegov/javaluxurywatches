<#include "/profile/setting.ftl" />

<@template title="Profile settings">
<form class="form-horizontal" name="userDetail" method="post" action="">
    <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>

    <fieldset>

        <!-- Form Name -->
        <legend>Address Details</legend>

        <input type="hidden" name="id" value="${userDetail.id}"/>

        <!-- Text input-->
        <div class="form-group">
            <label class="col-sm-2 control-label" for="textinput">Address</label>
            <div class="col-sm-10">
                <input name="address" type="text" placeholder="Address" class="profile-input"
                       value="<#if (userDetail)?? && (userDetail.address)??>${userDetail.address}</#if>">
            </div>
        </div>

        <!-- Text input-->
        <div class="form-group">
            <label class="col-sm-2 control-label" for="textinput">City</label>
            <div class="col-sm-10">
                <input name="city" type="text" placeholder="City" class="profile-input"
                       value="<#if (userDetail)?? && (userDetail.city)??>${userDetail.city}</#if>">
            </div>
        </div>


        <!-- Text input-->
        <div class="form-group">
            <label class="col-sm-2 control-label" for="textinput">Country</label>
            <div class="col-sm-10">
                <input name="country" type="text" placeholder="Country" class="profile-input"
                       value="<#if (userDetail)?? && (userDetail.country)??>${userDetail.country}</#if>">
            </div>
        </div>

        <!-- Text input-->
        <div class="form-group">
            <label class="col-sm-2 control-label" for="textinput">Postcode</label>
            <div class="col-sm-4">
                <input name="postcode" type="text" placeholder="Post Code" class="profile-input"
                       value="<#if (userDetail)?? && (userDetail.postcode)??>${userDetail.postcode?c}</#if>">
            </div>
        </div>


        <div class="form-group">
            <div class="col-sm-offset-2 col-sm-10">
                <div class="pull-right">
                    <button type="submit" class="profile-button">Save
                    </button>
                </div>
            </div>
        </div>

    </fieldset>
</form>
</@template>