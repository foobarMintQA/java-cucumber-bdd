package org.example.steps;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;

public class DataDrivenTestsSteps {

    @Given("I am on website")
    public void i_am_on_website() {
    }

    @Then("I enter username as {string} with emp code {int}")
    public void iEnterUsername(String username, int num) {
        System.out.println("Employee with emp code \"" + num + "\" has username as \"" + username + "\"");
    }

    @Then("I enter password as {string}")
    public void iEnterPassword(String password) {
        System.out.println("Password is " + password);
    }

    @When("I hit enter")
    public void iHitEnterReturnKey() {
    }

    @Then("I successfully logged in")
    public void iSuccessfullyLoggedIn() {
    }

    @Then("I enter username with emp code empCode")
    public void iEnterUsernameWithEmpCodeEmpCode(DataTable userData) {
        List<List<String>> listData = userData.asLists(String.class);
        String username = userData.cell(0, 0);
        int num = Integer.parseInt(userData.cell(0, 1));
        // Without loop on the data
        System.out.println("Without loop: Employee with emp code >> \"" + num + "\" has username as >> \"" + username + "\"");

        // Print all values using For loop
        for (int i = 0; i < listData.size(); i++) {
            username = userData.cell(i, 0);
            num = Integer.parseInt(userData.cell(i, 1));
            System.out.println("On loop: Employee with emp code >> \"" + num + "\" has username as >> \"" + username + "\"");
        }
    }
}
