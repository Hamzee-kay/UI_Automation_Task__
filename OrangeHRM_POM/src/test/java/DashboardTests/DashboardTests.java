package DashboardTests;

import LoginTests.LoginTests;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.DashboardPage;

public class DashboardTests extends LoginTests {

    @Test (priority = 1)
// This class extends to the SetupTests as the  SetupTests class contains all the setup requirements to run our test
    public void testLogout() throws InterruptedException {
//Handler for dashboard page
        dashboardPage.clickWelcome ();
        dashboardPage.clickLogout ();
        Thread.sleep (1000);

    }
}
