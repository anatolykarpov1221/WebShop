package com.demowebshop.fw;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ItemHelper extends BaseHelper {
    public ItemHelper(WebDriver driver) {
        super(driver);
    }

    public void clickOnButtonAddToCart() {
        click(By.xpath("(//input[@value='Add to cart'])[2]"));
    }

    public int sizeOfItems() {
        if(isElementPresent(By.name("removefromcart"))){
            return ApplicationManager.driver.findElements(By.cssSelector("[name='removefromcart']")).size();
        }
        return 0;
    }

    public void removeItem() {
        click(By.name("removefromcart"));
        click(By.cssSelector(".button-2.update-cart-button"));
    }
    public void clickOnButtonShopingCart() {
        click(By.cssSelector("[href^='/cart'] .cart-label"));
    }
}

