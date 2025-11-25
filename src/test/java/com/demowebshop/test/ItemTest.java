package com.demowebshop.test;

import com.demowebshop.core.TestBase;
import com.demowebshop.data.UserData;
import com.demowebshop.models.User;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ItemTest extends TestBase {

    @BeforeMethod
    public void precondition(){
        app.getUser().clickOnLoginLink();
        app.getUser().fillLoginInfo(new User()
                .setEmail(UserData.email)
                .setPassword(UserData.password));
        app.getUser().clickOnLoginButton();
        Assert.assertTrue(app.getUser().isLogoutButtonPresent());
    }

    @Test
    public void addItemToCart(){
        app.getItem().clickOnAddToCartButton();
        app.getItem().clickOnCartLink();
        Assert.assertTrue(app.getItem().isItemInCart());
    }


}
