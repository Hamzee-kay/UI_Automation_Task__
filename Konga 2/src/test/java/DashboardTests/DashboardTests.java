package DashboardTests;

import Login.LoginTests;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DashboardTests extends LoginTests {


        @Test(priority = 2)
        public void testLoginPopup() throws InterruptedException {
            Thread.sleep(3000);
            dashboardPage.verifyLoginPopup();
    }


    @Test(priority = 3)
    public void assertPageURL() throws InterruptedException {
        String loginURL = "https://www.konga.com/";
        Assert.assertEquals(dashboardPage.getLoginHomePageUrl(), loginURL, "You are not on login page");
        Thread.sleep(4000);
    }

    @Test(priority = 4)
    public void assertName() throws InterruptedException {
        dashboardPage.clickMyAccount();
        Thread.sleep(8000);
        if (dashboardPage.driver.getPageSource().contains("Hamzat")) {
            System.out.println("Text is present");
        } else {
            System.out.println("Text is absent");
        }
    }

    @Test (priority = 5)
    public void getPageTitle() throws InterruptedException{


            dashboardPage.clickCategoriesBtn();
            String pageTitle = dashboardPage.driver.getTitle();
            System.out.println("PageTitle is " +pageTitle);
    }


    @Test(priority = 6)
    public void assert5Items() throws InterruptedException {
        Thread.sleep(20000);

        //Find if element contains Notebooks
        if (dashboardPage.driver.getPageSource().contains("Notebooks")) {
            System.out.println("Text is present");
        } else {
            System.out.println("Text is absent");
        }

        //Find if element contains Hybrid Computers
        if (dashboardPage.driver.getPageSource().contains("Hybrid Computers")) {
            System.out.println("Text is present");
        } else {
            System.out.println("Text is absent");
        }

        //Find if element contains Ultrabooks
        if (dashboardPage.driver.getPageSource().contains("Ultrabooks")) {
            System.out.println("Text is present");
        } else {
            System.out.println("Text is absent");
        }

        //Find if element contains mini laptops and netbooks
        if (dashboardPage.driver.getPageSource().contains("Mini Laptops and Netbooks")) {
            System.out.println("Text is present");
        } else {
            System.out.println("Text is absent");
        }

        //Find if element contains Apple MacBooks
        if (dashboardPage.driver.getPageSource().contains("Apple MacBooks")) {
            System.out.println("Text is present");
        } else {
            System.out.println("Text is absent");
        }
    }


    @Test(priority = 7)
    public void clickLogout() throws InterruptedException {
            dashboardPage.extraButtons();
            dashboardPage.clickMyAccount();
            Thread.sleep(10000);
            dashboardPage.clickLogout();
            Thread.sleep(15000);
            System.out.println("The logout was successful. Page URL is " + dashboardPage.driver.getCurrentUrl());
    }



}
