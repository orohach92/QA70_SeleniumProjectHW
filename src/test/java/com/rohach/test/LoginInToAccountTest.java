package com.rohach.test;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginInToAccountTest extends TestBase{

    @Test
    public void loginInToAccountPositiveTest(){
        clickOnLoginLink();
        fillLoginInfo(new User()
                .setEmail("rohach@gmail.com")
                .setPassword("s@X228u9HzX@sT"));
        clickOnLoginButton();
        //assert LogOut button present
        Assert.assertTrue(isElementPresent(By.cssSelector(".ico-logout")));
    }

}
