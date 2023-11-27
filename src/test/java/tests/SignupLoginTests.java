package tests;

import org.example.HomePage;
import org.testng.annotations.Test;

public class SignupLoginTests extends BaseTest {
    @Test
    void toLoginPageTest() {
        HomePage page = new HomePage(driver);
        page.openURL();
        page.clickonSignUpLoginbutton();
    }
}