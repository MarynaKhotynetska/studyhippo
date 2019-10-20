package com.boosta.studyhippo.Login;

import com.boosta.studyhippo.TestRunner;
import com.studyhippo.pages.LoginPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static com.studyhippo.pages.LoginPage.*;

public class LoginTest extends TestRunner {

private static final String STUDYHIPPO_URL= "https://studyhippo.com/sign-in/";
private static final String EXPEXTED_RESULT="https://studyhippo.com/sign-in/";

//@BeforeMethod
//private void before (){
//    LoginPage loginPage = new LoginPage(driver);
//}

@Test
    public void loginPositiveTest(){
    driver.get(STUDYHIPPO_URL);
    WebElement emailInput = driver.findElement(By.xpath(EMAIL_LOCATOR));
    emailInput.clear();
    emailInput.sendKeys("testt@boosta.co");
    WebElement passwordInput = driver.findElement(By.xpath(PASSWORD_LOCATOR));
    passwordInput.clear();
    passwordInput.sendKeys("123456");
    WebElement signIn=driver.findElement(By.id(SIGN_IN_BUTTON));
    signIn.click();

    String actualUrl=driver.getCurrentUrl();
    Assert.assertEquals(actualUrl,EXPEXTED_RESULT);




}



}
