import org.openqa.selenium.WebDriver;
import org.testng.annotations.Ignore;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.Deleted_AccountPage;
import pages.HomePage;
import pages.Signup_LoginPage;

import static tests.SignupTests.username;

public class LoginTests extends BaseTest {
    @Parameters({"username", "password"})
    @Test(priority = 2)
    void LoginTestWithCorrectDate(@Optional("14689486") String username,@Optional("14689486") String password) {
        SoftAssert softAssert = new SoftAssert();

        HomePage homePage = new HomePage(driver);
        homePage.openURL();

        homePage.hoverFirstProduct();

        homePage.clickonSignUpLoginbutton();

        Signup_LoginPage signupLoginPage = new Signup_LoginPage(driver);
        signupLoginPage.fillSignInForm(username, password);
//        homePage.displayedSignedIcon();
//        homePage.logOutElement();

        softAssert.assertEquals(driver.getTitle(), "Automation Exercise - Signup / Login");

        driver.quit();
        softAssert.assertAll();
    }

    @Ignore
    @Test(priority = 0)
    void LoginTestWithIncorrectDate() {
        Signup_LoginPage signupLoginPage = new Signup_LoginPage(driver);
        signupLoginPage.openURL();
        signupLoginPage.sendLoginEmail("Joh99n@abc.com");
        signupLoginPage.sendLoginPassword("pass1882");
        signupLoginPage.clickOnLoginSubmit();
        signupLoginPage.displayedIncorrectText();
        driver.quit();
    }

    @Test(priority = 3, enabled = false)
    void DeleteLoggedAccount() {
        Signup_LoginPage signupLoginPage = new Signup_LoginPage(driver);
        Deleted_AccountPage deletedAccountPage = new Deleted_AccountPage(driver);
        signupLoginPage.openURL();
        signupLoginPage.sendLoginEmail("John@a4c1.com");
        signupLoginPage.sendLoginPassword("4525444s");
        signupLoginPage.clickOnLoginSubmit();
        HomePage homePage = new HomePage(driver);
        homePage.deleteAccount();
        deletedAccountPage.displayText();
        deletedAccountPage.clickonContinue();
        driver.getTitle();
        driver.quit();
    }


}