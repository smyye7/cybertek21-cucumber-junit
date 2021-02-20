package com.cybertek.step_definitions;

import com.cybertek.pages.SmartBearLoginPage;
import com.cybertek.utilities.BrowserUtils;
import com.cybertek.utilities.ConfigurationReader;
import com.cybertek.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;

public class DataTables_StepDefinitions {

    SmartBearLoginPage smartBearLoginPage=new SmartBearLoginPage();

    @Then("User should see below words displayed")
    public void user_should_see_below_words_displayed(List<String>fruitList) {

        System.out.println("fruitList.size() = "+fruitList.size());
        System.out.println("fruitList = " + fruitList);


        for(String eachFruit: fruitList){
            System.out.println("eachFruit = "+eachFruit);
        }

    }


    @Given("User is on the login pge of SmartBear")
    public void user_is_on_the_login_pge_of_smart_bear() {
        String url= ConfigurationReader.getProperty("smartBearUrl");
        Driver.getDriver().get(url);
    }


    @When("User enters below info")
    public void user_enters_below_info(io.cucumber.datatable.DataTable dataTable) {

        /*
        Map loginInfo
        username=Tester
        password=test
         */
        String username=loginInfo.get("username");//-->will return Tester
        String password=loginInfo.get("password");//-->will return test

        smartBearLoginPage.loginToSmartBear(username,password);


    }
    @Then("User should see title changed to Web Orders")
    public void user_should_see_title_changed_to_web_orders() {
        BrowserUtils.titleVerification("Web Orders");

    }









}
