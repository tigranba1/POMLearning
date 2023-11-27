import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Deleted_AccountPage extends BasePage {
    @Override
    public void openURL() {
    }

    public Deleted_AccountPage(WebDriver driver) {
        super.driver = driver;
    }

    private static final By DELETEDTEXT = By.cssSelector("[data-qa=account-deleted]");
    private static final By CONTINUEBUTTON = By.cssSelector("[data-qa=continue-button]");

    public void displayText() {
        displayedElement(DELETEDTEXT);
        System.out.println("Deleted text is displayed ");
    }

    public void clickonContinue() {
        clickOnElement(CONTINUEBUTTON);
    }
}