package com.rohach.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class homeWork12 {

    WebDriver driver;

    //before test
    @BeforeMethod
    public void setUp(){
        driver = new ChromeDriver();
        driver.get("https://demowebshop.tricentis.com/");
    }
    //test
    @Test
    public void openBrowser(){
        System.out.println("Demo Web Shop was opened");
    }

    //after test
    @AfterMethod(enabled = false)
    public void tearDown(){
        driver.close();
    }
}
