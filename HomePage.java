
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePage {
    public HomePage(WebDriver driver) {
        super.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[contains(text(),'Signup / Login')]")
    WebElement signUpLogin;

    private static final By FIRST_PICTURE = By.cssSelector("[src=\"/get_product_picture/31\"]");

    private static final By SIGNUPLOGIN = By.xpath("//*[contains(text(),'Signup / Login')]");
    private static final By USERSIGNEDICON = By.xpath("//*[contains(text(),'Logged')]");
    private static final By LOGOUTUSER = By.xpath("//*[contains(text(),'Logout')]");
    private static final By DELETEACCOUNT = By.xpath("//*[contains(text(),'Delete Account')]");

    @Override
    public void openURL() {
        driver.get("https://automationexercise.com/");
    }

    public void clickonSignUpLoginbutton() {
        clickOnElement(signUpLogin);
    }

    public void displayedSignedIcon() {
        displayedElement(USERSIGNEDICON);
    }

    public void logOutElement() {
        clickOnElement(LOGOUTUSER);
    }

    public void deleteAccount() {
        clickOnElement(DELETEACCOUNT);
    }
    public void hoverFirstProduct(){
        moveToElement(FIRST_PICTURE);
    }

}
