package com.rohach.test;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ItemTest extends TestBase{

    @BeforeMethod
    public void precondition(){
        clickOnLoginLink();
        fillLoginInfo(new User()
                .setEmail("rohach@gmail.com")
                .setPassword("s@X228u9HzX@sT"));
        clickOnLoginButton();
        //assert LogOut button present
        Assert.assertTrue(isElementPresent(By.cssSelector(".ico-logout")));
    }

    @Test
    public void addItemToCart(){
        clickOnAddToCartButton();
        clickOnCartLink();
        Assert.assertTrue(isElementPresent(By.xpath("//*[@href='/141-inch-laptop'][@class='product-name']")));
    }

}
