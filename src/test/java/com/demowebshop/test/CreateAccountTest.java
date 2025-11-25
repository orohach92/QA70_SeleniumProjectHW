package com.demowebshop.test;

import com.demowebshop.core.TestBase;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CreateAccountTest extends TestBase {

    @Test
    public void newUserRegisterPositiveTest(){

        app.getUser().clickOnRegisterLink();
        app.getUser().fillRegistrationForm("Alex", "Rohach", "Qwerty123456!");
        app.getUser().clickOnRegistrationButton();
        Assert.assertTrue(app.getUser().isSuccessRegistrationMassagePresent());
    }

}
