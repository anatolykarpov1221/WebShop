package com.demowebshop.fw;

import com.demowebshop.models.NewUserAccount;
import com.demowebshop.models.User;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.Random;

public class UserHelper extends BaseHelper {
    public UserHelper(WebDriver driver) {
        super(driver);
    }

    public void clickOnRegistrationButton() {
        click(By.id("register-button"));
    }

    public void fillNameAndLastname() {
        type(By.id("FirstName"), "Oly");
        type(By.id("LastName"), "Mayer");
    }

    public void fillLoginAndPassword(User user) {
        type(By.id("Email"), user.getEmail());
        type(By.id("Password"), user.getPassword());

    }

    public void clickOnRegisterLink() {
        click(By.cssSelector("[href='/register']"));
    }

    public void clickOnLogInButton() {
        click(By.xpath("//div[@class='buttons']/input[@class='button-1 login-button']"));
    }

    public void clickOnLoginLink() {
        click(By.cssSelector("[href='/login']"));
    }

    public void createLoginAndPasswordNewCustomer(NewUserAccount newUserAccount) {
        Random random = new Random();
        int i = random.nextInt(1000)+1000;
        type(By.id("Email"), "olesia" + i + "@yahoo.com");
        type(By.id("Password"), "Olesia$12345");
        type(By.id("ConfirmPassword"), "Olesia$12345" );
    }

    public void clickOnLogOutButton() {
        click(By.cssSelector("[href='/logout']"));
    }

    public boolean isLoginLinkPresent() {
        return isElementPresent(By.cssSelector("[href='/login']"));
    }
}
