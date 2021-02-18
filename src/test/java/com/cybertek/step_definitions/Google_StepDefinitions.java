package com.cybertek.step_definitions;

import com.cybertek.pages.GoogleSearchPage;
import com.cybertek.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import java.util.List;

public class Google_StepDefinitions {

    GoogleSearchPage googleSearchPage=new GoogleSearchPage();

    @Then("User should see title is Google")
    public void user_should_title_is_google(){
        String actual=Driver.getDriver().getTitle();
        String expected="Google";

        Assert.assertTrue(actual.equals(expected));

        // all of the above done in one line.
        //Assert.assertTrue

    }


    @Given("User is on Google home page")
    public void user_is_on_google_home_page() {





        Driver.getDriver().get("https://www.google.com");

    }

    @When("User searches for apple")
    public void user_searches_for_apple() {
        GoogleSearchPage googleSearchPage=new GoogleSearchPage();
        googleSearchPage.searchBar.sendKeys("apple"+ Keys.ENTER);

    }

    @Then("User should see apple in the title")
    public void user_should_see_apple_in_the_title() {
        String actualTitle=Driver.getDriver().getTitle();
        String expectedInTitle="apple";

        Assert.assertTrue(actualTitle.contains(expectedInTitle));

        Driver.closeDriver();
    }


    @When("User searches for {string}")
    public void userSearchesFor(String string) {
        GoogleSearchPage googleSearchPage=new GoogleSearchPage();
        googleSearchPage.searchBar.sendKeys(string+Keys.ENTER);
    }

    @Then("User should see {string} in the title")
    public void user_should_see_in_the_title(String string){
        String actualTitle=Driver.getDriver().getTitle();
        String expectedInTitle=string;
        Assert.assertTrue(actualTitle.contains(expectedInTitle));

      //  Driver.closeDriver();

    }
    @Then("User should see following links")
    public void user_should_see_following_links(List<String> expectedfooterLinks) {
        System.out.println("footerLinks = " + expectedfooterLinks);

        for(WebElement eachLink: googleSearchPage.footerLinks){
            System.out.println("eachLink = " + eachLink.getText());
        }

        //create a list of strings(as a place holder
        //loop through List of WebElements
        //

    }













}
