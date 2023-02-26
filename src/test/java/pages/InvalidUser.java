package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InvalidUser {

    private WebDriver driver;

    public InvalidUser(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//div[@class=\"nav-line-1-container\"]")
    WebElement loginPage1;

    @FindBy(xpath = "//input[@id=\"ap_email\"]")
    WebElement email1;

    @FindBy(xpath = "//span[@id=\"continue\"]")
    WebElement click1;

    public WebElement getLoginPage1() {
        return loginPage1;
    }

    public WebElement getEmail1() {
        return email1;
    }

    public WebElement getClick1() {
        return click1;
    }

    public WebElement getPassword1() {
        return password1;
    }

    public WebElement getLoginResult1() {
        return loginResult1;
    }

    @FindBy(xpath = "//input[@id=\"ap_password\"]")
    WebElement password1;


    @FindBy(xpath = "//input[@id=\"signInSubmit\"]")
    WebElement loginResult1;


}
