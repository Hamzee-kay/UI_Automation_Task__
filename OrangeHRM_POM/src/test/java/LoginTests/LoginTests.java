package LoginTests;

import Setup.Setups;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import pageObjects.DashboardPage;

public class LoginTests extends Setups {

    @Test(priority = 0)
    public void testALoginPanel () {
        loginPage.verifyLoginPanel (); }

    @Test (priority = 0)

    public void testACompanyLogo () {
        loginPage.verifyCompanyLogo ();
    }

    @Test (priority = 0)

    public void testAForgotPassword () {
        loginPage.verifyForgotPassword ();
    }

    @Test (priority = 1)
    public void tstAPageTittle () throws InterruptedException {
        loginPage.enterUsername ("Admin");
        loginPage.enterPassword ("admin123");
        DashboardPage dashboardPage = loginPage.clickLoginButton ();
        //Check whether the pageTitle is correct
        String pageTitle ="OrangeHRM";
        if(pageTitle.equalsIgnoreCase ("OrangeHRM")) {
            System.out.println ("The page title is" + pageTitle);
        } else {
            System.out.println("The page title is incorrect.Actual page title is" + pageTitle);
        }
        Thread.sleep (5000);
    }

    @Test (priority = 1)
    public static DashboardPage getDashboardPage (){
        return dashboardPage;
    }
}
