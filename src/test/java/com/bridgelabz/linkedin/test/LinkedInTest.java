package com.bridgelabz.linkedin.test;

import com.bridgelabz.linkedin.base.Base;
import com.bridgelabz.linkedin.pages.Login;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LinkedInTest extends Base {
    public Login login;

    @Test(priority = 1)
    public void linkedIn_Login() {
        login = new Login(driver);
        Boolean check = login.loginIntoAccount();
        Assert.assertTrue(check);
    }
}