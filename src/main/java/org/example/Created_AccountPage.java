package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Created_AccountPage extends BasePage {
    @FindBy(css = "[data-qa='account-created']")
    WebElement accCreatedText;
    private static final By ACC_CREATEDTEXT = By.cssSelector("[data-qa='account-created']");
    private static final By CONTINUEBUTTON = By.cssSelector("[data-qa=continue-button]");

    public Created_AccountPage(WebDriver driver) {
        super.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @Override
    public void openURL() {
        driver.get("https://automationexercise.com/");
    }

    public boolean isCreatedTextShown() {
        System.out.println("Account Created text is displayed ");
        return isElementVisible(accCreatedText);
    }

    public void clickOnContinueButton() {
        clickOnElement(CONTINUEBUTTON);
    }
}