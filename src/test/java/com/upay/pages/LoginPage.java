package com.upay.pages;

import static  com.upay.utilities.ConfigurationReader.*;
import com.upay.utilities.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public LoginPage(){
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(name = "email")
    public WebElement username;
    @FindBy(name = "password")
    public WebElement password;
    @FindBy(xpath = "//[.='LOGIN']")
    public WebElement loginBtn;

    public void navigateToLoginPage(){
        Driver.get().get(get("url"));
    }
    public void setUsername(String userName){
        username.sendKeys(userName);
    }
    public void setPassword(String passWord){
        password.sendKeys(passWord);
    }
    public void clickLoginBtn(){
        loginBtn.click();
    }

}
