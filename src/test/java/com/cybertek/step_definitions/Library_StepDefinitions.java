package com.cybertek.step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Library_StepDefinitions {
    @Given("user is on the login page")
    public void user_is_on_the_login_page(){
    System.out.println("User is on the login page");
    }

    @When("user enter librarian username")
    public void user_Enter_Librarian_Username() {
        System.out.println("User enters LIBRARIAN username");

        //Intentionally failing this step
       // Assert.fail("INTENTIONAL FAIL!!!!!!!!!!!!");
    }

    @And("user enter librarian password")
    public void user_Enter_Librarian_Password() {
        System.out.println("User enters LIBRARIAN password");
     }

     @Then("user should see dashboard")
    public void user_Should_See_Dashboard() {
         System.out.println("User sees dashboard");
    }
    


    @When("user enters student username")
    public void userEntersStudentUsername() {
        System.out.println("User enters STUDENT username");
    }

    @And("user enters student password")
    public void userEntersStudentPassword() {
        System.out.println("User enters STUDENT password");
    }

    @When("user enter admin username")
    public void userEnterAdminUsername() {
        System.out.println("User enters ADMIN username");
        
    }

    @When("user enter admin  password")
    public void userEnterAdminPassword() {
        System.out.println("User enters ADMIN password");

    }
}
