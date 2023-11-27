package tests;

import org.example.Deleted_AccountPage;
import org.example.HomePage;
import org.example.Signup_LoginPage;
import org.testng.annotations.Ignore;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class LoginTests extends BaseTest {
    @Parameters({"username", "password"})
    @Test(priority = 2)
    void LoginTestWithCorrectDate(@Optional("14689486") String username,@Optional("14689486") String password) {
        SoftAssert softAssert = new SoftAssert();

        HomePage homePage = new HomePage(BaseTest.driver);
        homePage.openURL();

        homePage.hoverFirstProduct();

        homePage.clickonSignUpLoginbutton();

        Signup_LoginPage signupLoginPage = new Signup_LoginPage(BaseTest.driver);
        signupLoginPage.fillSignInForm(username, password);
//        homePage.displayedSignedIcon();
//        homePage.logOutElement();

        softAssert.assertEquals(BaseTest.driver.getTitle(), "Automation Exercise - Signup / Login");

        BaseTest.driver.quit();
        softAssert.assertAll();
    }

    @Ignore
    @Test(priority = 0)
    void LoginTestWithIncorrectDate() {
        Signup_LoginPage signupLoginPage = new Signup_LoginPage(BaseTest.driver);
        signupLoginPage.openURL();
        signupLoginPage.sendLoginEmail("Joh99n@abc.com");
        signupLoginPage.sendLoginPassword("pass1882");
        signupLoginPage.clickOnLoginSubmit();
        signupLoginPage.displayedIncorrectText();
        BaseTest.driver.quit();
    }

    @Test(priority = 3, enabled = false)
    void DeleteLoggedAccount() {
        Signup_LoginPage signupLoginPage = new Signup_LoginPage(BaseTest.driver);
        Deleted_AccountPage deletedAccountPage = new Deleted_AccountPage(BaseTest.driver);
        signupLoginPage.openURL();
        signupLoginPage.sendLoginEmail("John@a4c1.com");
        signupLoginPage.sendLoginPassword("4525444s");
        signupLoginPage.clickOnLoginSubmit();
        HomePage homePage = new HomePage(BaseTest.driver);
        homePage.deleteAccount();
        deletedAccountPage.displayText();
        deletedAccountPage.clickonContinue();
        BaseTest.driver.getTitle();
        BaseTest.driver.quit();
    }


}