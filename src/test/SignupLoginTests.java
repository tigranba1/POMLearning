import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import pages.HomePage;

public class SignupLoginTests extends BaseTest {
    @Test
    void toLoginPageTest() {
        HomePage page = new HomePage(driver);
        page.openURL();
        page.clickonSignUpLoginbutton();
    }
}