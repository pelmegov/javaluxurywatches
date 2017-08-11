<#include "/profile/setting.ftl" />

<@template title="Profile settings">
<form class="form-horizontal" name="user" method="post" action="">
    <fieldset>
        <!-- Form Name -->
        <legend>Support</legend>
        <div class="media">
        <#--<label for="message" class="control-label">Введите сообщение:</label>-->
            <div class="media-body">
                <textarea id="item" class="form-control" rows="1" placeholder="Введите тему от 20 до 40 символов"
                          minlength="20" maxlength="500" required="required"></textarea>
                <textarea id="message" class="form-control" rows="4"
                          placeholder="Введите сообщение от 20 до 500 символов"
                          minlength="20" maxlength="500" required="required"></textarea>
            </div>
        </div>
        <div class="form-group">
            <div class="col-sm-offset-2 col-sm-10">
                <div class="pull-right">
                    <button type="submit" class="profile-button">Submit
                    </button>
                </div>
            </div>
        </div>
    </fieldset>
</form>
</@template>