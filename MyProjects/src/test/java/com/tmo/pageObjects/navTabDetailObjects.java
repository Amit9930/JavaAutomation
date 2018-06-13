package com.tmo.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class navTabDetailObjects {

    // Getting 3 element by using this XPath - Need more undestanding on how to get only one
    @FindBy(how=How.XPATH, using="//a[text()=\"Overview\"]/ancestor::li[1]")
    @CacheLookup
    WebElement pricingTab_Overview;

    // Getting 2 element by using this XPath - Need more undestanding on how to get only one
    @FindBy(how=How.XPATH, using="//a[text()=\"Free Trial\"]")
    @CacheLookup
    WebElement freeTrialButtonOnTop;

    @FindBy(how=How.XPATH, using="//*[@id='searchField']")
    @CacheLookup
    WebElement clickOnSearchBarOnTop;
}
