package tests;

import org.example.Created_AccountPage;
import org.example.SignupPage;
import org.example.Signup_LoginPage;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import static utils.StringUtil.generateRandomString;

public class SignupTests extends BaseTest {
    static  String username = generateRandomString(6) + "@a435.com";
    static  String password = "4525444s";

    @Test
    void SignupTest() throws InterruptedException {
        SoftAssert softAssert = new SoftAssert();

        Signup_LoginPage loginPage = new Signup_LoginPage(driver);
        loginPage.openURL();


        loginPage.fillSignUpForm(username, "John");

        SignupPage signupPage = new SignupPage(driver);
        softAssert.assertEquals(driver.getTitle(), "Automation Exercise - Signup");
        //Assert.assertEquals(driver.getTitle(), "Automation Exercise - Signup");

        signupPage.chooseRadio();
        signupPage.clearName();
        signupPage.setFirstName("Johnik");
        signupPage.setPassword(password);
        signupPage.selectDayofBirt("20");
        signupPage.selectMonthofBirt("July");
        signupPage.selectYearofBirt("1996");
        signupPage.setSignupNewsletterState(true);
        signupPage.clickonOffer(true);
        signupPage.setFirstName("John");
        signupPage.setLastName("Smith");
        signupPage.setCompanyName("amazon");
        signupPage.setAddress("California");
        signupPage.setAddress2("newli");
        signupPage.selectCountry();
        signupPage.setState("abcsd");
        signupPage.setCity("hwgs");
        signupPage.setZipcode("1244A6");
        signupPage.setMobNumb("1124245");
        Thread.sleep(5000);
        signupPage.clickCreateSubmit();

        Created_AccountPage createdAccountPage = new Created_AccountPage(driver);

        softAssert.assertTrue(createdAccountPage.isCreatedTextShown(), "Created Text was shown");
        createdAccountPage.clickOnContinueButton();

        closeDriver(driver);

        softAssert.assertAll();
    }

}