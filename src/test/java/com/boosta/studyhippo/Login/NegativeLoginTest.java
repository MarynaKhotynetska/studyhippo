package com.boosta.studyhippo.Login;

import com.boosta.studyhippo.TestRunner;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import static com.studyhippo.pages.LoginPage.*;

public class NegativeLoginTest extends TestRunner {

    public static final String STUDYHIPPO_URL= "https://studyhippo.com/sign-in/";
    private static final String EXPEXTED_RESULT="https://studyhippo.com/sign-in/?login=failed";

    @Test
    public void loginNegativeTest(){
        driver.get(STUDYHIPPO_URL);
        WebElement emailInput = driver.findElement(By.xpath(EMAIL_LOCATOR));
        emailInput.clear();
        emailInput.sendKeys("testt");
        WebElement passwordInput = driver.findElement(By.xpath(PASSWORD_LOCATOR));
        passwordInput.clear();
        passwordInput.sendKeys("123456");
        WebElement signIn=driver.findElement(By.id(SIGN_IN_BUTTON));
        signIn.click();

        String actualUrl=driver.getCurrentUrl();
        Assert.assertEquals(actualUrl,EXPEXTED_RESULT);
    }


}
