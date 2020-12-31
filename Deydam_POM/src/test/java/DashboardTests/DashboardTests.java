package DashboardTests;

import LoginTests.LoginTests;
import org.testng.Assert;
import org.testng.annotations.Test;


public class DashboardTests extends LoginTests {

    @Test(priority = 2)
    public void clickMessage () throws InterruptedException {
        Thread.sleep(3000);
        dashboardPage.clickMessage();
    }

    @Test(priority = 3)
    public void assertName() throws InterruptedException {
        dashboardPage.clickAccount();
        Thread.sleep(8000);
        if (dashboardPage.driver.getPageSource().contains("Hamzat")) {
            System.out.println("Text is present");
        } else {
            System.out.println("Text is absent");
        }
    }

    @Test(priority = 4)
    public void clickLogout() throws InterruptedException {
        dashboardPage.clickAccount();
        Thread.sleep(10000);
        dashboardPage.clickLogout();
        Thread.sleep(15000);
        System.out.println("The logout was successful. Page URL is " + dashboardPage.driver.getCurrentUrl());
    }
}
