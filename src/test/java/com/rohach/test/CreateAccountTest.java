package com.rohach.test;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CreateAccountTest extends TestBase{

    @Test
    public void newUserRegisterPositiveTest(){
        int i =(int)((System.currentTimeMillis()/1000)%3600);

        //click on Register Link
        click(By.cssSelector("[href='/register']"));
        //click on Male gender button
        click(By.cssSelector("#gender-male"));
        //enter First name
        type(By.cssSelector("#FirstName"),"Alex");
        //enter Last name
        type(By.cssSelector("#LastName"),"Rohach");
        //enter email
        type(By.cssSelector("#Email"),"rohach" + i + "@gmail.com");
        //enter password
        type(By.cssSelector("#Password"), "Qwerty123456!");
        //confirm password
        type(By.cssSelector("#ConfirmPassword"), "Qwerty123456!");

        //click on Registration button
        click(By.cssSelector("#register-button"));

        //assert SigOut button present
        Assert.assertTrue(isElementPresent(By.xpath("//*[@class='result']")));
    }

}
