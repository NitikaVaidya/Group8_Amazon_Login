package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

    private WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }


    @FindBy(xpath = "//div[@class=\"nav-line-1-container\"]")
    WebElement loginPage;

    @FindBy(xpath = "//input[@id=\"ap_email\"]")
    WebElement email;

    @FindBy(xpath = "//span[@id=\"continue\"]")
    WebElement click;


    @FindBy(xpath = "//input[@id=\"ap_password\"]")
    WebElement password;


    @FindBy(xpath = "//input[@id=\"signInSubmit\"]")
    WebElement loginResult;

    public WebElement getLoginPage() {
        return loginPage;
    }

    public WebElement getEmail() {
        return email;
    }

    public WebElement getClick() {
        return click;
    }

    public WebElement getPassword() {
        return password;
    }

    public WebElement getLoginResult() {
        return loginResult;
    }

}
