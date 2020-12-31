package SetupTests;

import Setup.Setups;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class SetupTests extends Setups {

    @Test(priority = 0)
    public void testSetups () {
        String pageURL = "https://dev.d2rxvhrryr2bkn.amplifyapp.com/login";

        if (driver.getCurrentUrl().contains(pageURL)) {
            System.out.println ("The webPage URL is" + pageURL);
        } else {
            System.out.println("Invalid URL.Actual webPage URL is" + driver.getCurrentUrl());
        }
    }

}
