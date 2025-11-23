package com.rohach.test;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CreateAccountTest extends TestBase{

    @Test
    public void newUserRegisterPositiveTest(){
        int i =(int)((System.currentTimeMillis()/1000)%3600);

        clickOnRegisterLink();
        fillRegistrationForm(i, "Alex", "Rohach", "Qwerty123456!");
        clickOnRegistrationButton();

        //assert SigOut button present
        Assert.assertTrue(isElementPresent(By.xpath("//*[@class='result']")));
    }

}
