package com.cydeo.library.pages;

import com.cydeo.library.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.Arrays;
import java.util.List;

public class UsersPage {

    public UsersPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(xpath = "//th[@data-name='actions']")
    public WebElement dataActions;

    @FindBy(xpath = "//th[@data-name='id']")
    public WebElement dataUserID;

    @FindBy(xpath = "//th[@data-name='full_name']")
    public WebElement dataFullName;

    @FindBy(xpath = "//th[@data-name='email']")
    public WebElement dataEmail;

    @FindBy(xpath = "//th[@data-name='group_name']")
    public WebElement dataGroup;

    @FindBy(xpath = "//th[@data-name='status']")
    public WebElement dataStatus;



    public List<WebElement> getAllWebElements(List<WebElement> elements){
        elements.addAll(Arrays.asList(dataActions, dataUserID, dataFullName, dataEmail, dataGroup, dataStatus));
        return elements;
    }



}
