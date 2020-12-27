package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }
    public WebDriver driver;

    //Using By as a locator for elements
    private By login = By.xpath("//*[@id=\"app-content-wrapper\"]/div[3]/nav/div[2]/div/div[3]/div[2]/a");
    private By username = By.id("username");
    private By password = By.xpath("//input[@id='password']");
    private By loginButton = By.xpath("//button[contains(text(),'Login')]");


    public void clickLogin() {
        //find the username element and enter the username
        driver.findElement(login).click();
    }

    public void enterUsername(String uName) {

        //find the username element and enter the username
        driver.findElement(username).sendKeys(uName);
    }

    public void enterUserPassword(String pwd) {
      driver.findElement(password).sendKeys(pwd);

    }

    public DashboardPage clickLoginBtn() {
        driver.findElement(loginButton).click();
        return new DashboardPage(driver);
    }
}
