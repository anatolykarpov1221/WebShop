package com.demowebshop.tests;

import com.demowebshop.data.UserData;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.demowebshop.models.User;

public class LoginTests extends TestBase{
    @BeforeMethod
    public void ensurePrecondition(){
        if (!app.getUser().isLoginLinkPresent()){
            app.getUser().clickOnLogOutButton();
        }
    }

    @Test
    public void loginPositiveTest(){
        app.getUser().clickOnLoginLink();

        app.getUser().fillLoginAndPassword(new User()
                .setEmail(UserData.EMAIL)
                .setPassword(UserData.PASSWORD));
        app.getUser().clickOnLogInButton();
        Assert.assertTrue(app.getUser().isCustomerPresent());
    }
    @Test
    public void loginNegativeTest(){
        app.getUser().clickOnLoginLink();
        app.getUser().fillLoginAndPassword(new User().setPassword("Olesia$2024"));
        app.getUser().clickOnLogInButton();
        Assert.assertTrue(app.getUser().isCustomerPresent());

    }
}
