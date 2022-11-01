package com.cydeo.library.step_definitions;

import com.cydeo.library.pages.DashboardPage;
import com.cydeo.library.pages.LoginPage;
import com.cydeo.library.pages.UsersPage;
import com.cydeo.library.utilities.BrowserUtils;
import com.cydeo.library.utilities.ConfigurationReader;
import com.cydeo.library.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class SearchResults_StepDefinitions {

    DashboardPage dashboardPage = new DashboardPage();
    LoginPage loginPage = new LoginPage();
    UsersPage usersPage = new UsersPage();

    @Given("user is on the login page")
    public void user_is_on_the_login_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("library.url"));
    }
    @Given("user login as a librarian")
    public void user_login_as_a_librarian() {
        loginPage.usernameInput.sendKeys(ConfigurationReader.getProperty("librarian.username"));
        loginPage.passwordInput.sendKeys(ConfigurationReader.getProperty("librarian.password"));
        loginPage.signInButton.click();
    }
    @Given("user click on Users link")
    public void user_click_on_users_link() {
        dashboardPage.usersLink.click();
    }
    @Then("table should have following column names")
    public void table_should_have_following_column_names(List<String> expectedColumns) {

        BrowserUtils.waitFor(1);

        List<WebElement> actualElements = new ArrayList<>();
        usersPage.getAllWebElements(actualElements);

        for (int i = 0; i < expectedColumns.size(); i++) {
            Assert.assertEquals(expectedColumns.get(i), actualElements.get(i).getText());
        }


    }

}
