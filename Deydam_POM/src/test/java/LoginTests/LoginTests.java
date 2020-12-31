package LoginTests;

import Setup.Setups;
import org.testng.annotations.Test;
import pageObjects.DashboardPage;


public class LoginTests extends Setups {
    public LoginTests() {}

    @Test (priority = 1)

    public void testLogin() throws InterruptedException{

        loginPage.clickLoginButton();

        loginPage.enterUsername("Hamzat");
        loginPage.enterPassword("hamzee02");
        //handler for the dashboard page
        DashboardPage dashboardPage = loginPage.clickLoginButton();


        Thread.sleep(10000);
        String pageTitle= "Deydam";

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
