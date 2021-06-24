package com.bridgelabz.linkedin.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {
    @FindBy(id = "username")
    WebElement username;

    @FindBy(id = "password")
    WebElement password;

    @FindBy(xpath = "//*[@id='organic-div']/form/div[3]/button")
    WebElement signIn;

    public Login(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public Boolean loginIntoAccount() {
        try {
            username.sendKeys("shende.samiksha@rediffmail.com");
            password.sendKeys("Welcome@01");
            signIn.click();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}
