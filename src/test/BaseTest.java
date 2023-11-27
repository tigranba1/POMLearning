import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.*;

public class BaseTest {
    static WebDriver driver;
    @BeforeSuite
    void beforeSuite(){
        System.out.println("Before suite ");
    }
    @BeforeTest
    void beforeTest(){
        System.out.println("Before test ");
    }

    @AfterTest
    void afterTest(){
        System.out.println("after test ");
    }
    @AfterSuite
    void afterSuite(){
        System.out.println("After suite ");
    }
    @Parameters({"browser", "a"})
    @BeforeMethod
    void setupWebDriver(@Optional("chrome") String browser, @Optional("ss") String a){
        System.out.println(a);
        driver = null;
        if (browser.equalsIgnoreCase("chrome")){
            driver = new ChromeDriver();
        }else if (browser.equalsIgnoreCase("edge")){
            driver = new EdgeDriver();
        }
    }

    void closeDriver(WebDriver driver){
        driver.quit();
    }
}