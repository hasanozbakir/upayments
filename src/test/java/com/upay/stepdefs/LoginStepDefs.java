package com.upay.stepdefs;

import com.upay.pages.LoginPage;
import static  com.upay.utilities.ConfigurationReader.*;

import com.upay.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LoginStepDefs {

    LoginPage loginPage = new LoginPage();
    @Given("the user is on the login page")
    public void the_user_is_on_the_login_page() {
        loginPage.navigateToLoginPage();
    }

    @When("the user enters the valid credentials")
    public void the_user_enters_the_valid_credentials() {
        loginPage.setUsername(get("username"));
        loginPage.setPassword(get("password"));
        loginPage.clickLoginBtn();
    }
    @Then("the user should be able to login")
    public void the_user_should_be_able_to_login() {
        Assert.assertEquals("https://upay.upayments.com/", Driver.get().getCurrentUrl());
    }
}
