package Login;

import Setup.Setups;
import org.testng.annotations.Test;
import pageObjects.DashboardPage;

public class LoginTests extends Setups {

    //TestNG annotation
    @Test (priority = 1)

    public void testLogin() throws InterruptedException{

        loginPage.clickLogin();

        loginPage.enterUsername("hamzatolalekan43@yahoo.com");
        loginPage.enterUserPassword("hamzee02");


        //handler for the dashboard page
        DashboardPage dashboardPage = loginPage.clickLoginBtn();


        Thread.sleep(3000);
        String pageTitle= "Konga";

        if (loginPage.driver.getTitle().contains(pageTitle) ) {
            System.out.println("The page title is " + pageTitle);
        } else {
            System.out.println("The page title is incorrect. Actual page title is " + loginPage.driver.getTitle());

        }
        //dashboardPage.clickMyAccount();
        // loginPage = dashboardPage.clickLogout();

    }
    @Test (priority = 1)

    public static DashboardPage returnDashboardPage() {
        return dashboardPage;

    }
}

