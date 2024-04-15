package com.demowebshop.tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.demowebshop.models.User;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

import static org.testng.Assert.assertTrue;

public class AddItemToCartTests extends TestBase{
    @BeforeMethod
    public void ensurePrecondition(){
        if (!app.getUser().isLoginLinkPresent()){
            app.getUser().clickOnLogOutButton();
        }
        app.getUser().clickOnLoginLink();
        app.getUser().fillLoginAndPassword(new User()
                .setEmail("olesia123@yahoo.com")
                .setPassword("Olesia$2024"));
        app.getUser().clickOnLogInButton();
    }
    @Test
    public void addItemToCart(){
        app.getItem().clickOnButtonAddToCart();
        app.getItem().clickOnButtonShopingCart();
        Assert.assertTrue(app.getItem().isElementPresent(By.cssSelector("[href='/141-inch-laptop']")));
    }
    @AfterMethod
    public void postCondition(){
        app.getItem().removeItem();
    }

    @DataProvider
    public Iterator<Object[]> addNewUser(){
        List<Object[]> list = new ArrayList<>();
        list.add(new Object[]{"Olga", "LastName", "olga1234@gmail.com", "Qwertz1234", "Qwertz1234"})
    }

}
