package ParaBankPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Page {


    private WebDriver driver;
    public  Page (WebDriver driver)
    {
        this.driver=driver;
    }

private By usernameField=By.name("username");
private By passwordField=By.name("password");
    private By loginBtn=By.cssSelector("input[value=\"Log In\"]");

private By Findtransactions=By.linkText("Find Transactions");

    public  void login (String userName ,String password )
    {
        driver.findElement(usernameField).sendKeys(userName);
        driver.findElement(passwordField).sendKeys(password);
        driver.findElement(loginBtn).click();
    }



    public  void clickFindtransactions()
    {
        driver.findElement(Findtransactions).click();
    }
}
