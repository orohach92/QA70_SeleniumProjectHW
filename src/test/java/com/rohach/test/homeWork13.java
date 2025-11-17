package com.rohach.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class homeWork13 {
    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
        driver.get("https://demowebshop.tricentis.com/");
        driver.manage().window().maximize();
    }

    @Test
    public void findElementByCssSelector() {
        //by attribute
        driver.findElement(By.cssSelector("[title]"));
        //key value
        driver.findElement(By.cssSelector("[class='product-grid home-page-product-grid']"));
        //contains
        driver.findElement(By.cssSelector("[class*='product-grid']"));
        //start with
        driver.findElement(By.cssSelector("[class^='product-grid']"));
        //end with
        driver.findElement(By.cssSelector("[class$='product-grid']"));
        //by tag
        WebElement h2 = driver.findElement(By.cssSelector("h2"));
        //by class
        driver.findElement(By.cssSelector(".header-menu"));
        //by tag and class
        driver.findElement(By.cssSelector("div.center-3"));
        //by tag and two classes
        driver.findElement(By.cssSelector("div.block.block-manufacturer-navigation"));
        //by tag, class and an attribute
        driver.findElement(By.cssSelector("div.newsletter-result-block[id=newsletter-result-block]"));




//        driver.findElement(By.cssSelector("[for='dates']"));
//        driver.findElement(By.cssSelector("[href='/let-car-work']"));
//
//        //composite cssSelector
//        //tag+class+pare
//        driver.findElement(By.cssSelector("a.navigation-link[href='/search']"));
//

    }

    @AfterMethod()
    public void tearDown() {
        driver.quit();
    }
}
