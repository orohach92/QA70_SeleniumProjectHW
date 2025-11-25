package com.demowebshop.test;

import com.demowebshop.core.TestBase;
import com.demowebshop.data.UserData;
import com.demowebshop.models.User;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginInToAccountTest extends TestBase {

    @Test
    public void loginInToAccountPositiveTest(){
        app.getUser().clickOnLoginLink();
        app.getUser().fillLoginInfo(new User()
                .setEmail(UserData.email)
                .setPassword(UserData.password));
        app.getUser().clickOnLoginButton();
        Assert.assertTrue(app.getUser().isLogoutButtonPresent());
    }

}
