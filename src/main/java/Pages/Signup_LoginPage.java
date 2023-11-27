import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Signup_LoginPage extends BasePage {
    public Signup_LoginPage(WebDriver driver) {
        super.driver = driver;
    }

    private static final By SIGNUPNAME = By.cssSelector("[data-qa='signup-name']");
    private static final By SIGNUPEMAIL = By.cssSelector("[data-qa='signup-email']");
    private static final By SIGNUPBUTTON = By.cssSelector("[data-qa='signup-button']");
    private static final By LOGINPASSWORD = By.cssSelector("[data-qa='login-password']");
    private static final By LOGINEMAIL = By.cssSelector("[data-qa='login-email']");
    private static final By LOGINBUTTON = By.cssSelector("[data-qa='login-button']");
    private static final By INCORRECTTEXT = By.xpath("//*[contains(text(),'incorrect')]");

    @Override
    public void openURL() {
        driver.get("https://automationexercise.com/login");
    }

    public void sendLoginEmail(String name) {
        sendKeysOnElement(LOGINEMAIL, name);
    }

    public void sendLoginPassword(String name) {
        sendKeysOnElement(LOGINPASSWORD, name);
    }

    public void sendNameSignup(String name) {
        sendKeysOnElement(SIGNUPNAME, name);

    }

    public void sendEmailSignup(String name) {
        sendKeysOnElement(SIGNUPEMAIL, name);
    }

    public void clickOnLoginSubmit() {
        clickOnElement(LOGINBUTTON);
    }

    public void clickOnSignUpSubmit() {
        clickOnElement(SIGNUPBUTTON);
    }

    public void displayedIncorrectText() {
        displayedElement(INCORRECTTEXT);
    }

    public void fillSignInForm(String email, String password){
        sendLoginEmail(email);
        sendLoginPassword(password);
        clickOnLoginSubmit();
    }
    public void fillSignUpForm(String email, String name){
        sendEmailSignup(email);
        sendNameSignup(name);
        clickOnSignUpSubmit();
    }
}