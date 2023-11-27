package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public abstract class BasePage {
    WebDriver driver;
    Duration timeout = Duration.ofSeconds(10);

    public abstract void openURL();

    public WebElement getElement(By locator) {
        return driver.findElement(locator);
    }

    public void clearElement(By locator) {
        getElement(locator).clear();
    }

    public void displayedElement(By locator) {
        getElement(locator).isDisplayed();
    }

    public void clickOnElement(By locator) {
        getClickableElement(locator).click();
    }

    public void clickOnElement(WebElement element) {
        element.click();
    }

    public void sendKeysOnElement(By locator, String name) {
        getElement(locator).sendKeys(name);
    }

    public void selectOptionByText(By locator, String text) {
        Select drop = new Select(getElement(locator));
        drop.selectByVisibleText(text);
    }

    WebElement getVisibleElement(By locator) {
        WebDriverWait wait = new WebDriverWait(driver, timeout);
        return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    WebElement getClickableElement(By locator) {
        WebDriverWait wait = new WebDriverWait(driver, timeout);
        return wait.until(ExpectedConditions.elementToBeClickable(locator));
    }

    boolean isElementVisible(By locator, Duration duration) {
        WebDriverWait wait = new WebDriverWait(driver, duration);
        return wait.until(ExpectedConditions.visibilityOf(getElement(locator))).isDisplayed();
    }

    boolean isElementVisible(WebElement element) {
        return element.isDisplayed();
    }

    public void  moveToElement(By locator){
        Actions actions = new Actions(driver);
        actions.moveToElement(getElement(locator)).perform();
    }
    public boolean isCheckboxSelected(By locator) {
        return getVisibleElement(locator).isSelected();
    }

    public void setCheckboxState(By locator, boolean check) {
        if (isCheckboxSelected(locator) != check) {
            clickOnElement(locator);
        }
    }
}

