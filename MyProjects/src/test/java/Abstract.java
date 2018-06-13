import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class Abstract {



    public static WebDriver driver;
    public static String baseUrl = "https://www.interactivebrokers.com/en/index.php?f=16042";

    @BeforeClass
    public static void setUp() {

        System.setProperty("webdriver.gecko.driver", "C:\\AutomationDrivers\\geckodriver.exe");

        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get(baseUrl);
    }

    @AfterClass
    public static void tearDown() {
        driver.quit();
    }

}