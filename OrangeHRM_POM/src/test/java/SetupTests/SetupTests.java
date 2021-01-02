package SetupTests;

import Setup.Setups;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class SetupTests extends Setups {

    @Test(priority = 0)
    public void testGetURL () {
        String pageURL = "https://opensource-demo.orangehrmlive.com";
        if (pageURL.equalsIgnoreCase ("https://opensource-demo.orangehrmlive.com")) {
            System.out.println ("The webPage URL is" + pageURL);
        } else {
            System.out.println("Invalid URL.Actual webPage URL is" + pageURL);
        }
    }
}
