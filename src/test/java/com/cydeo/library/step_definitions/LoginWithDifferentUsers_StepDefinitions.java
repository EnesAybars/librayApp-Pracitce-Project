package com.cydeo.library.step_definitions;

import com.cydeo.library.pages.DashboardPage;
import com.cydeo.library.pages.LoginPage;
import com.cydeo.library.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LoginWithDifferentUsers_StepDefinitions {


    LoginPage loginPage = new LoginPage();
    DashboardPage dashboardPage = new DashboardPage();

    @When("user is login using {string} and {string}")
    public void user_is_login_using_and(String string, String string2) {
        loginPage.usernameInput.sendKeys(string);
        loginPage.passwordInput.sendKeys(string2);
        loginPage.signInButton.click();


    }

    @Then("account holder name should be {string}")
    public void account_holder_name_should_be(String string) {
        BrowserUtils.waitForVisibility(dashboardPage.navBarDropdownText, 5);
        Assert.assertEquals(string, dashboardPage.navBarDropdownText.getText());

    }


}
