package com.demowebshop.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class homeWork16FindByXpath {
    WebDriver driver;

    @BeforeMethod
    public void setUp(){
        driver = new ChromeDriver();
        driver.get("https://demowebshop.tricentis.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @AfterMethod()
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void findElementByXpath(){
        //key value
        driver.findElement(By.xpath("//*[@class='product-grid home-page-product-grid']"));
        //contains
        driver.findElement(By.xpath("//*[contains(@class, 'product-grid')]"));
        //start with
        driver.findElement(By.xpath("//*[starts-with(@class, 'product-grid')]"));
        //id
        driver.findElement(By.xpath("//*[@id='bar-notification']"));
        //by tag
        WebElement h2 = driver.findElement(By.xpath("//h2"));
        //by class
        driver.findElement(By.xpath("//*[@class='header-menu']"));
        //equals text
        driver.findElement(By.xpath("//*[text()='Welcome to the new Tricentis store!']"));
        //contains text
        driver.findElement(By.xpath("//*[contains(text(), 'Welcome to the ')]"));
        //by tag and class
        driver.findElement(By.xpath("//*[@href='/register'][@class='ico-register']"));
        driver.findElement(By.xpath("//*[@href='/register' and @class='ico-register']"));
        //two steps below
        driver.findElement(By.xpath("//*[@class='header-logo']//img"));
        //one step below
        driver.findElement(By.xpath("//*[@class='block block-category-navigation']/*[@class='title']"));
        //by position
        driver.findElement(By.xpath("//*[@class='list']/li[2]"));
        driver.findElement(By.xpath("//*[@class='block block-category-navigation']//li[last()]"));
        //siblings
        driver.findElement(By.xpath("//*[@class='topic-html-content-title']/following-sibling::*[@class='topic-html-content-body']"));
        //parent
        driver.findElement(By.xpath("//*[@class='title']/parent::*[@class='product-grid home-page-product-grid']"));
        //ancestor
        driver.findElement(By.xpath("//img/ancestor::*[@class='header-logo']"));



    }
}
