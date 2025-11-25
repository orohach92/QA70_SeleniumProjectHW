package com.demowebshop.fw;

import com.demowebshop.core.BaseHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ItemHelper extends BaseHelper {
    public ItemHelper(WebDriver driver) {
        super(driver);
    }

    public void clickOnCartLink() {
        click(By.xpath("//*[@id='topcartlink']"));
    }

    public void clickOnAddToCartButton() {
        click(By.xpath("(//input[@value='Add to cart'])[2]"));
    }
    public boolean isItemInCart() {
        return isElementPresent(By.xpath("//*[@href='/141-inch-laptop'][@class='product-name']"));
    }
}
