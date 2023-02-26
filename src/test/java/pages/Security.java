package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Security {

    private WebDriver driver;

    public Security(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//div[@class=\"nav-line-1-container\"]")
    WebElement loginPage4;

    @FindBy(xpath = "//input[@id=\"ap_email\"]")
    WebElement email4;

    @FindBy(xpath = "//span[@id=\"continue\"]")
    WebElement click4;


    @FindBy(xpath = "//input[@id=\"ap_password\"]")
    WebElement password4;

    @FindBy(xpath = "//input[@id=\"signInSubmit\"]")
    WebElement loginResult4;

    public WebElement getLoginPage4() {
        return loginPage4;
    }

    public WebElement getEmail4() {
        return email4;
    }

    public WebElement getClick4() {
        return click4;
    }

    public WebElement getPassword4() {
        return password4;
    }

    public WebElement getLoginResult4() {
        return loginResult4;
    }

    public WebElement getAccount4() {
        return account4;
    }

    public WebElement getSecurity() {
        return security;
    }

    @FindBy(xpath = "//div[@class=\"nav-line-1-container\"]")
    WebElement account4;

    @FindBy(xpath = "//div[@class=\"ya-card-cell\"][2]")
    WebElement security;


}
