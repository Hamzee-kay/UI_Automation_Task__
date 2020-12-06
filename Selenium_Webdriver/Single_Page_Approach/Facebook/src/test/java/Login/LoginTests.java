package Login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

public class LoginTests {

    private WebDriver driver;

    @BeforeClass

    public void setUp () throws InterruptedException {
        //import chromedriver
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        driver = new ChromeDriver();


        //input the webpage url

        driver.get ("https://web.facebook.com/login");

        //wait for 5 seconds

        Thread.sleep(5000);


        //maximize the window

        driver.manage ().window ().maximize ();

        System.out.println (driver.getTitle ());

        driver.manage ().timeouts ().implicitlyWait (10, TimeUnit.SECONDS);

        driver.findElement(By.id("email")).sendKeys("hamzatolalekan43@yahoo.com");

        driver.findElement(By.id("pass")).sendKeys("hamzee02");

        //locate button field
        driver.findElement(By.xpath("//button[@id='loginbutton']")).click();

    }


    public static void main (String[] args) throws InterruptedException {

        LoginTests test = new LoginTests();
        test.setUp();
    }

    @AfterClass

    public void tearDown() {

        driver.quit ();

    }
}
