package com.tmo.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class navigationTabObjects {

    @FindBy(how=How.XPATH, using="//a[text()=\"PRICING \"]")
    @CacheLookup
    WebElement pricingTab;

    @FindBy(how=How.XPATH, using="//a[text()=\"PRODUCTS \"]")
    @CacheLookup
    WebElement productTab;

    @FindBy(how=How.XPATH, using="//a[text()=\"TECHNOLOGY \"]")
    @CacheLookup
    WebElement technologyTab;

    @FindBy(how=How.XPATH, using="//a[text()=\"EDUCATION \"]")
    @CacheLookup
    WebElement educationTab;

    @FindBy(how=How.XPATH, using="//a[text()=\"ABOUT IBKR \"]")
    @CacheLookup
    WebElement aboutIBKRTab;

    @FindBy(how=How.XPATH, using="//a[text()=\"CONTACT US \"]")
    @CacheLookup
    WebElement contactUsTab;

    public void navTab_pricingTabClicked() { pricingTab.click(); }
    public void navTab_productTabClicked() { productTab.click(); }
    public void navTab_technologyTabClicked() { technologyTab.click(); }
    public void navTab_educationTabClicked() { educationTab.click(); }
    public void navTab_aboutIBKRTabClicked() { aboutIBKRTab.click(); }
    public void navTab_contactUsTabClicked() { contactUsTab.click(); }
}