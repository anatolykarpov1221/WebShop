package com.demowebshop.tests;

import com.demowebshop.data.UserData;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.demowebshop.models.NewUserAccount;
import java.util.Random;

public class CreateNewAccountTests extends TestBase {
    @BeforeMethod
    public void ensurePrecondition(){
        if (!app.getUser().isLoginLinkPresent()){
            app.getUser().clickOnLogOutButton();
        }
    }
    @Test
    public void createNewAccount(){
        app.getUser().clickOnRegisterLink();
        app.getUser().fillNameAndLastname();
        app.getUser().createLoginAndPasswordNewCustomer(new NewUserAccount()
                .setEmail(UserData.CREATE_EMAIL)
                .setPassword(UserData.PASSWORD)
                .setConfirmPassword(UserData.PASSWORD));
        app.getUser().clickOnRegistrationButton();
        Assert.assertTrue(app.getUser().isCustomerPresent());

    }

}
