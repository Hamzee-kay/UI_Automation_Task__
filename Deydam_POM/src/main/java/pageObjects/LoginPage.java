package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class LoginPage {
    public LoginPage (WebDriver driver) {
        this.driver = driver;
    }

    public WebDriver driver;
    //Using By as a location to identify the login fields
    private By username = By.xpath ("//*[@id=\"username\"]");
    private By password = By.xpath("//*[@id=\"password\"]");
    private By loginButton = By.xpath("//*[@id=\"root\"]/div/div/div/main/div/div[2]/div/div/div/div[2]/div/div/form/button");


    public void enterUsername(String uName){
        //Find the username element and enter the username
        driver.findElement(username).sendKeys (uName);
    }
    public void enterPassword (String pwd) {
        //Find the username element and enter the username
        driver.findElement(password).sendKeys (pwd);
    }
    public DashboardPage clickLoginButton () {
        //Find the username element and enter the username
        driver.findElement (loginButton).click();
        return new DashboardPage (driver);
    }

}
