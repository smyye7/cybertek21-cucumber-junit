package com.cybertek.pages;

import com.cybertek.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class GoogleSearchPage {

    public GoogleSearchPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(name="q")
    public WebElement searchBar;


    //instead of using findElements method, we can directly use 2FindBy
    //and if locator

    @FindBy(xpath = "//a[@class='pHiOh']")
    public List<WebElement> footerLinks;


}
