import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignupPage extends BasePage {
    private static final By ACCOUNTINF = By.xpath("//*[contains(text(),'Enter')]");
    private static final By RADIO = By.id("id_gender2");
    private static final By NAME1_FIELD = By.id("name");
    private static final By EMAIL1_FIELD = By.id("email");
    private static final By PASSWORD = By.id("password");
    private static final By DAYOFFBIRTH = By.id("days");
    private static final By MONTHOFBIRT = By.id("months");
    private static final By YEARSOFBIRTH = By.id("years");
    private static final By NEWSLET = By.id("newsletter");
    private static final By OFFERS = By.id("optin");
    private static final By FIRST_NAME = By.id("first_name");
    private static final By LAST_NAME = By.id("last_name");
    private static final By COMPANY = By.id("company");
    private static final By ADDRESS = By.id("address1");
    private static final By ADDRESS2 = By.id("address2");
    private static final By COUNTRY = By.id("country");
    private static final By STATE = By.id("state");
    private static final By CITY = By.id("city");
    private static final By ZIPCODE = By.id("zipcode");
    private static final By MOBILE = By.id("mobile_number");
    private static final By SUBMITBUTTON = By.cssSelector("[data-qa=create-account]");
    public SignupPage(WebDriver driver) {
        super.driver = driver;
    }

    @Override
    public void openURL() {
        driver.get("https://automationexercise.com/products");
    }

    public void chooseRadio() {
        clickOnElement(RADIO);
    }

    public void setPassword(String Password) {
        sendKeysOnElement(PASSWORD, Password);
    }

    public void selectDayofBirt(String year) {
        selectOptionByText(DAYOFFBIRTH, year);

    }

    public void selectMonthofBirt(String month) {
        selectOptionByText(MONTHOFBIRT, month);
    }

    public void selectYearofBirt(String year) {
        selectOptionByText(YEARSOFBIRTH, year);
    }

    public void setSignupNewsletterState(boolean check) {
        setCheckboxState(NEWSLET, check);
    }

    public void clickonOffer(boolean check) {
        setCheckboxState(OFFERS, check);
    }

    public void clearName() {
        clearElement(FIRST_NAME);
    }

    public void setFirstName(String FirstName) {
        sendKeysOnElement(FIRST_NAME, FirstName);
    }

    public void setLastName(String LastName) {
        sendKeysOnElement(LAST_NAME, LastName);
    }

    public void setCompanyName(String Company) {
        sendKeysOnElement(COMPANY, Company);
    }

    public void setAddress(String Adress1) {
        sendKeysOnElement(ADDRESS, Adress1);
    }

    public void setAddress2(String Adress2) {
        sendKeysOnElement(ADDRESS2, Adress2);
    }

    public void selectCountry() {
        selectOptionByText(COUNTRY, "Canada");
    }

    public void setState(String State) {
        sendKeysOnElement(STATE, State);
    }

    public void setCity(String City) {
        sendKeysOnElement(CITY, City);
    }

    public void setZipcode(String Zipcode) {
        sendKeysOnElement(ZIPCODE, Zipcode);
    }

    public void setMobNumb(String Mobile) {
        sendKeysOnElement(MOBILE, Mobile);
    }

    public void clickCreateSubmit() {
        clickOnElement(SUBMITBUTTON);
    }
}