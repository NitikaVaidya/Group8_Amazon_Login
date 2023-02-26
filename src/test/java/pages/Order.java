package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Order {

    private WebDriver driver;

    public Order(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//div[@class=\"nav-line-1-container\"]")
    WebElement loginPage2;

    @FindBy(xpath = "//input[@id=\"ap_email\"]")
    WebElement email2;

    @FindBy(xpath = "//span[@id=\"continue\"]")
    WebElement click2;


    @FindBy(xpath = "//input[@id=\"ap_password\"]")
    WebElement password2;


    @FindBy(xpath = "//input[@id=\"signInSubmit\"]")
    WebElement loginResult2;


    @FindBy(xpath = "//div[@class=\"nav-line-1-container\"]")
    WebElement account;

    @FindBy(xpath = "//div[@class=\"a-column a-span9 a-span-last\"]")
    WebElement myOrder;

    public WebElement getLoginPage2() {
        return loginPage2;
    }

    public WebElement getEmail2() {
        return email2;
    }

    public WebElement getClick2() {
        return click2;
    }

    public WebElement getPassword2() {
        return password2;
    }

    public WebElement getLoginResult2() {
        return loginResult2;
    }

    public WebElement getAccount() {
        return account;
    }

    public WebElement getMyOrder() {
        return myOrder;
    }
}
