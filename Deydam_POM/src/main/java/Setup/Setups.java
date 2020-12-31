package Setup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import pageObjects.DashboardPage;
import pageObjects.LoginPage;

public class Setups {

    protected WebDriver driver;

    //Create LoginPage Object
    public static LoginPage loginPage;
    public static DashboardPage dashboardPage;

    @BeforeTest
    public void setUps(){

        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");

        //instantiate  WebDriver Object
        driver = new ChromeDriver();

        //Maximize window size
        driver.manage().window().maximize();

        //Launch the application
        driver.get("https://dev.d2rxvhrryr2bkn.amplifyapp.com/login");

        //Instantiate login page after launching the browser
        loginPage = new LoginPage(driver);
        dashboardPage = new DashboardPage(driver);
    }

    @AfterTest

    //Browser should quit
    public void tearDown() {

        driver.quit();
    }
}
