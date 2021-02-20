package com.cybertek.step_definitions;

import com.cybertek.pages.SmartBearLoginPage;
import com.cybertek.utilities.ConfigurationReader;
import com.cybertek.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class SmartBear_StepDefinitions {

    SmartBearLoginPage smartBearLoginPage=new SmartBearLoginPage();

    @Given("User on the SmartBear login page")
    public void user_on_the_smart_bear_login_page() {
        String url= ConfigurationReader.getProperty("url");
        Driver.getDriver().get(url);

    }

    @When("User enter {string} and {string}")
    public void user_enter_and(String username, String password) {
//        smartBearLoginPage.username.sendKeys(ConfigurationReader.getProperty("username"));
//        smartBearLoginPage.password.sendKeys(ConfigurationReader.getProperty("password"));
//        smartBearLoginPage.submitButton.click();

    }
    @Then("User should be on Web order Page")
    public void user_should_be_on_web_order_page() {

        String expectedLoginTitle = "Web Orders";
        String actualLoginTitle = Driver.getDriver().getTitle();
        Assert.assertTrue("Login Not Successful. Test Failed",actualLoginTitle.contains(expectedLoginTitle));

    }
    @Given("tester login using {string} and {string} and click login button")
    public void tester_login_using_and_and_click_login_button(String string, String string2) {

    }


    @When("tester click order button")
    public void tester_click_order_button() {

    }
    @When("tester select {string} from product dropDown")
    public void tester_select_from_product_drop_down(String string) {

    }
    @When("tester enters {string} to quantity")
    public void tester_enters_to_quantity(String string) {

    }
    @When("tester enters {string} to costumer name")
    public void tester_enters_to_costumer_name(String string) {

    }
    @When("tester enters {string} to street")
    public void tester_enters_to_street(String string) {

    }
    @When("tester enters {string} to city")
    public void tester_enters_to_city(String string) {

    }
    @When("tester enters {string} to state")
    public void tester_enters_to_state(String string) {

    }
    @When("tester enters {string} to zip")
    public void tester_enters_to_zip(String string) {

    }
    @When("tester select {string} as card type")
    public void tester_select_as_card_type(String string) {

    }
    @When("tester enters {string} to card number")
    public void tester_enters_to_card_number(String string) {

    }
    @When("tester enters {string} to expiration date")
    public void tester_enters_to_expiration_date(String string) {

    }
    @When("tester click process button")
    public void tester_click_process_button() {


    }
    @Then("tester verify {string} is in the list")
    public void tester_verify_is_in_the_list(String string) {

    }











}
