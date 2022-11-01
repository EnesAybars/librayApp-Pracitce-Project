package com.cydeo.library.step_definitions;

import com.cydeo.library.pages.DashboardPage;
import com.cydeo.library.pages.LoginPage;
import com.cydeo.library.utilities.BrowserUtils;
import com.cydeo.library.utilities.ConfigurationReader;
import com.cydeo.library.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Login_StepDefinitions {

    LoginPage loginPage = new LoginPage();
    DashboardPage dashboardPage = new DashboardPage();

    @Given("User is on the login page")
    public void user_is_on_the_login_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("library.url"));
    }


    //Login.feature
    @When("user enters librarian username")
    public void user_enters_librarian_username() {
        loginPage.usernameInput.sendKeys("librarian1@library");
    }
    @When("user enters librarian password")
    public void user_enters_librarian_password() {
        loginPage.passwordInput.sendKeys("rs4BNN9G");
        loginPage.signInButton.click();
    }
    @When("user enters student username")
    public void user_enters_student_username() {
        loginPage.usernameInput.sendKeys("student1@library");
    }
    @When("user enters student password")
    public void user_enters_student_password() {
        loginPage.passwordInput.sendKeys("i2A9TgXa");
        loginPage.signInButton.click();
    }



    //LoginWithParameters.feature
    @When("user enters librarian username <{string}>")
    public void user_enters_librarian_username(String string) {
        loginPage.usernameInput.sendKeys(string);
    }
    @When("user enters librarian password <{string}>")
    public void user_enters_librarian_password(String string) {
        loginPage.passwordInput.sendKeys(string);
        loginPage.signInButton.click();
    }

    @When("user enters student username <{string}>")
    public void user_enters_student_username(String string) {
        loginPage.usernameInput.sendKeys(string);
    }
    @When("user enters student password <{string}>")
    public void user_enters_student_password(String string) {
        loginPage.passwordInput.sendKeys(string);
        loginPage.signInButton.click();
    }

    // Task 4
    @When("user login using <{string}> and <{string}>")
    public void user_login_using_and(String string, String string2) {
        loginPage.usernameInput.sendKeys(string);
        loginPage.passwordInput.sendKeys(string2);
        loginPage.signInButton.click();
    }
    @Then("user should be on the dashboard page")
    public void user_should_be_on_the_dashboard_page() {
        BrowserUtils.waitForVisibility(dashboardPage.navBarDropdown,10);
        BrowserUtils.verifyElementDisplayed(dashboardPage.navBarDropdown);
    }
    @Then("There should be <{string}> users")
    public void there_should_be_users(String string) {
        BrowserUtils.waitFor(1);
        Assert.assertEquals(dashboardPage.userCount.getText(), string);
    }






    @Then("user should land on the dashboard page")
    public void user_should_land_on_the_dashboard_page() {
        BrowserUtils.waitForVisibility(dashboardPage.navBarDropdown,10);
        BrowserUtils.verifyElementDisplayed(dashboardPage.navBarDropdown);
    }

    @Then("user should land on the books page")
    public void user_should_land_on_the_books_page() {
        BrowserUtils.waitForVisibility(dashboardPage.navBarDropdown,10);
        BrowserUtils.verifyElementDisplayed(dashboardPage.navBarDropdown);
    }


   /*

   @Test
    public void test(){

        Driver.getDriver().get("https://library1.cydeo.com/");
        loginPage.usernameInput.sendKeys("librarian1@library");
        loginPage.passwordInput.sendKeys("rs4BNN9G");
        loginPage.signInButton.click();

        BrowserUtils.waitFor(2);

        System.out.println(dashboardPage.userCount.getText());
        Driver.closeDriver();

    }

    */



}
