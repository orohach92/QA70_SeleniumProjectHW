package com.demowebshop.fw;

import com.demowebshop.core.BaseHelper;
import com.demowebshop.models.User;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class UserHelper extends BaseHelper {
    public UserHelper(WebDriver driver) {
        super(driver);
    }

    public void clickOnRegistrationButton() {
        //click on Registration button
        click(By.cssSelector("#register-button"));
    }

    public void fillRegistrationForm(String firstName, String lastName, String password) {
        int i =(int)((System.currentTimeMillis()/1000)%3600);
        String email = "rohach" + i + "@gmail.com";
        //click on Male gender button
        click(By.cssSelector("#gender-male"));
        //enter First name
        type(By.cssSelector("#FirstName"), firstName);
        //enter Last name
        type(By.cssSelector("#LastName"), lastName);
        //enter email
        type(By.cssSelector("#Email"), email);
        //enter password
        type(By.cssSelector("#Password"), password);
        //confirm password
        type(By.cssSelector("#ConfirmPassword"), password);
    }

    public void fillRegistrationFormFromCsv(User user) {
        //click on Male gender button
        click(By.cssSelector("#gender-male"));
        //enter First name
        type(By.cssSelector("#FirstName"), user.getName());
        //enter Last name
        type(By.cssSelector("#LastName"), user.getLastname());
        //enter email
        type(By.cssSelector("#Email"), user.getEmail());
        //enter password
        type(By.cssSelector("#Password"), user.getPassword());
        //confirm password
        type(By.cssSelector("#ConfirmPassword"), user.getPassword());
    }

    public void clickOnRegisterLink() {
        click(By.cssSelector("[href='/register']"));
    }

    public void clickOnLoginButton() {
        //click on login button
        driver.findElement(By.cssSelector("input[value='Log in']")).click();
    }

    public void fillLoginInfo(User user) {
        //enter email
        type(By.cssSelector("#Email"), user.getEmail());
        //enter password
        type(By.cssSelector("#Password"), user.getPassword());
    }

    public void clickOnLoginLink() {
        //click on login link
        driver.findElement(By.cssSelector(".ico-login")).click();
    }

    public boolean isLogoutButtonPresent() {
        return isElementPresent(By.cssSelector(".ico-logout"));
    }

    public boolean isSuccessRegistrationMassagePresent() {
        return isElementPresent(By.xpath("//*[@class='result']"));
    }

    public void clickOnLogoutButton() {
        driver.findElement(By.cssSelector(".ico-logout")).click();
    }
}
