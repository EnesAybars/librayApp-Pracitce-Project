package com.cydeo.library.pages;

import com.cydeo.library.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardPage {

    public DashboardPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "navbarDropdown")
    public WebElement navBarDropdown;

    @FindBy(id = "user_count")
    public WebElement userCount;

    @FindBy(xpath = "//a[@href='#users']")
    public WebElement usersLink;

    @FindBy(xpath = "//a[@id='navbarDropdown']//span")
    public WebElement navBarDropdownText;








}
