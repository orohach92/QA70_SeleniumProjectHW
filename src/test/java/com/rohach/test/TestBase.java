package com.rohach.test;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

public class TestBase {

    WebDriver driver;
    @BeforeMethod
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://demowebshop.tricentis.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    }

    @AfterMethod (enabled = false)
    public void tearDown(){
        driver.quit();
    }

    public boolean isElementPresent(By locator){
        return driver.findElements(locator).size() > 0;
    }

    public void click(By locator) {
        driver.findElement(locator).click();
    }

    public void type(By locator, String text) {
        click(locator);
        driver.findElement(locator).clear();
        driver.findElement(locator).sendKeys(text);
    }

    public boolean isAlertPresent() {
        Alert alert = new WebDriverWait(driver, Duration.ofSeconds(20))
                .until(ExpectedConditions.alertIsPresent());
        if (alert == null) {
            return false;
        } else {
            return true;
        }
    }

    public void clickOnRegistrationButton() {
        //click on Registration button
        click(By.cssSelector("#register-button"));
    }

    public void fillRegistrationForm(int i, String firstName, String lastName, String password) {
        //click on Male gender button
        click(By.cssSelector("#gender-male"));
        //enter First name
        type(By.cssSelector("#FirstName"), firstName);
        //enter Last name
        type(By.cssSelector("#LastName"), lastName);
        //enter email
        type(By.cssSelector("#Email"),"rohach" + i + "@gmail.com");
        //enter password
        type(By.cssSelector("#Password"), password);
        //confirm password
        type(By.cssSelector("#ConfirmPassword"), password);
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

    public void pause(int millis){
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }

    public void clickOnCartLink() {
        click(By.xpath("//*[@id='topcartlink']"));
    }

    public void clickOnAddToCartButton() {
        click(By.xpath("(//input[@value='Add to cart'])[2]"));
    }
}
