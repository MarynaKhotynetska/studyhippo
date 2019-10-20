package com.boosta.studyhippo.RedirectPricing;

import com.boosta.studyhippo.TestRunner;
import com.studyhippo.pages.BecomeAMemberPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BecomeAMemberHeaderTest extends TestRunner {

    public static final String STUDYHIPPO_URL_MAIN="https://studyhippo.com/";


    @BeforeMethod
    public void before(){
        BecomeAMemberPage becomeamemberpage = new BecomeAMemberPage();
    }

    @Test
    public void becomeMember (){
        driver.get(STUDYHIPPO_URL_MAIN);
        WebElement becomeAHeader = driver.findElement(By.xpath(BECOME_A_MEMBER_HEADER));
    }

}
