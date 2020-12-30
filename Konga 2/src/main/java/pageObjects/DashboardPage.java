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
    private By loginPopup = By.xpath("//*[@id=\"app-content-wrapper\"]/div[1]/div/div[1]/p");
    private By myAccount = By.linkText("My Account");
    private By categories = By.linkText ("Computers and Accessories");
    private By laptops = By.xpath("/html/body/div[1]/div/section/div[3]/section/main/section[2]/section/div/section/div[2]/div[2]/ul/li[5]/a/label/span");
    private By Apple = By.xpath("/html/body/div[1]/div/section/div[3]/section/main/section[2]/section/div/section/div[2]/div[2]/ul/li[5]/a/ul/li[1]/a/label");
    private By logout = By.xpath("/html/body/div[1]/div/section/div[2]/nav/div[2]/div/div[3]/div[2]/div/ul/li[7]/a");


    //functions to interact with the element

    public void verifyLoginPopup() {
        //wait for 10 seconds before executing the action
        driver.findElement(loginPopup).isDisplayed();
    }

    public String getLoginHomePageUrl(){
        WebDriverWait wait = new WebDriverWait(driver,20);
        //wait until URL is visible
        wait.until(ExpectedConditions.urlToBe("https://www.konga.com/"));
        return driver.getCurrentUrl();
    }
    public void clickCategoriesBtn () throws InterruptedException{

        Thread.sleep(5000);
        driver.findElement(categories).click();


    }

    public void extraButtons() throws InterruptedException{
        Thread.sleep(10000);
        driver.findElement(laptops).click();
        Thread.sleep(8000);
        driver.findElement(Apple).click();
        Thread.sleep(8000);

    }

    public void clickMyAccount() throws InterruptedException {

        //fin element my account and click
        driver.findElement(myAccount).click();
        Thread.sleep(5000);
    }



    public LoginPage clickLogout() throws InterruptedException {
        //wait for 5 second before executing action
        Thread.sleep(10000);
        driver.findElement(logout).click();
        return new LoginPage(driver);
    }
}
