package com.cybertek.step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Library_StepDefinitions {
    @Given("user is on the login page")
    public void user_is_on_the_login_page(){
    System.out.println("User is on the login page");
    }

    @When("user enter librarian username")
    public void userEnterLibrarianUsername() {
    }

    @And("user enter librarian password")
    public void userEnterLibrarianPassword() {
     }

     @Then("user should see dashboard")
    public void userShouldSeeDashboard() {
    }
}
