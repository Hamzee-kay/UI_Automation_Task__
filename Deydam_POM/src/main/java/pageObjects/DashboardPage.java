package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DashboardPage {
    //create a webDriver object
    public WebDriver driver;

    //create a constructor
    public DashboardPage(WebDriver driver) {

        this.driver = driver;
    }

    //locate elements
    private By messages = By.xpath("//body/div[@id='root']/div[1]/div[1]/div[1]/main[1]/div[1]/div[1]/div[2]/section[1]/div[1]/div[1]/div[1]/div[1]/ul[2]/a[1]/li[1]/p[1]");
    private By account = By.xpath("//body/div[@id='root']/div[1]/div[1]/div[1]/main[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[3]/button[1]");
    private By logout = By.linkText("Log Out");


    //functions to interact with the element


    public void clickMessage () throws InterruptedException{

        Thread.sleep(5000);
        driver.findElement(messages).click();

    }

    public void clickAccount () throws InterruptedException {
        Thread.sleep(5000);
        //fin element my account and click
        driver.findElement(account).click();

    }



    public LoginPage clickLogout() throws InterruptedException {
        //wait for 5 second before executing action
        Thread.sleep(10000);
        driver.findElement(logout).click();
        return new LoginPage(driver);
    }
}
