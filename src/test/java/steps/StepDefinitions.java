package steps;

import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import pages.*;
import utils.BrowserManager;
import utils.QaProps;
import utils.TestDataReader;

import java.util.HashMap;

public class StepDefinitions {

    private WebDriver driver;

    String url;

    HomePage homePage;

    InvalidUser invalidUser;

    Security security;

    Order order;

    Search search;

    HashMap<String, String> data;
    Scenario scenario;

    public StepDefinitions(BrowserManager browserManager){
        this.driver=browserManager.getDriver();

    }

    /*@Before
    public void before(Scenario scenario){

        this.scenario = scenario;

    }*/

    @Given("the user navigates to the home page")
    public void the_user_navigates_to_the_home_page() {
        url = QaProps.getValue("url");
        driver.get(url);
        //System.out.println(1/0);

    }
    @When("the user enters the valid user name")
    public void the_user_enters_the_valid_user_name() throws InterruptedException {
        homePage = new HomePage(driver);

        WebDriverWait wait = new WebDriverWait(driver,20);
        homePage.getLoginPage().click();
        //data = TestDataReader.getData("Verify that user is able to login");
        //data= TestDataReader.getData(scenario.getName());
        //homePage.getEmail().sendKeys(data.get("TypeValue"));
        homePage.getEmail().sendKeys("9424624521");
        homePage.getClick().click();
        homePage.getPassword().sendKeys("Amazon@000");
        homePage.getLoginResult().click();


    }
    @Then("the user will login into amazon")
    public void the_user_will_login_into_amazon() throws InterruptedException {
        //homePage.getLoginPage().sendKeys(Keys.ENTER);

        WebDriverWait wait = new WebDriverWait(driver,20);
        Assert.assertTrue(driver.getCurrentUrl().contains("https://www.amazon.in/"));

    }

     @Given("the user navigates to the account page")
    public void the_user_navigates_to_the_account_page(){
        url = QaProps.getValue("url");
        driver.get(url);
    }

    @When("the user click on my order")
    public void the_user_click_on_my_order() throws InterruptedException {
        order = new Order(driver);
        WebDriverWait wait = new WebDriverWait(driver,20);
        order.getLoginPage2().click();
        order.getEmail2().sendKeys("9424624521");
        order.getClick2().click();
        order.getPassword2().sendKeys("Amazon@000");
        order.getLoginResult2().click();
        order.getAccount().click();
        order.getMyOrder().click();

    }

    @Then("the user navigates to my order page")
    public void the_user_navigates_to_my_order_page() throws InterruptedException {

        WebDriverWait wait = new WebDriverWait(driver,20);

        Assert.assertTrue(driver.getCurrentUrl().contains("https://www.amazon.in/"));
        //Assert.assertTrue(driver.getCurrentUrl().contains("https://www.amazon.in/"));


    }


    @Given("the user navigates to the accountpage")
    public void the_user_navigates_to_the_accountpage() {
        url = QaProps.getValue("url");
        driver.get(url);
        //System.out.println(1/0);

    }
    @When("the user click on security")
    public void the_user_click_on_security() throws InterruptedException {
        security = new Security(driver);
        WebDriverWait wait = new WebDriverWait(driver,20);
        security.getLoginPage4().click();
        security.getEmail4().sendKeys("9424624521");
        security.getClick4().click();
        security.getPassword4().sendKeys("Amazon@000");
        security.getLoginResult4().click();
        security.getAccount4().click();
        security.getSecurity().click();


    }
    @Then("the user navigates to login and security page")
    public void the_user_navigates_to_the_login_and_security_page() throws InterruptedException {
        //homePage.getLoginPage().sendKeys(Keys.ENTER);

        WebDriverWait wait = new WebDriverWait(driver,20);

        Assert.assertTrue(driver.getCurrentUrl().contains("https://www.amazon.in/"));

    }


    @Given("the user navigates to the homepage")
    public void the_user_navigates_to_the_homepage(){
        url = QaProps.getValue("url");
        driver.get(url);
    }

    @When("the user enters the invalid user name")
    public void the_user_enter_invalid_user_name(){
        invalidUser = new InvalidUser(driver);
                invalidUser.getLoginPage1().click();
        invalidUser.getEmail1().sendKeys("9424624521");
        invalidUser.getClick1().click();
        invalidUser.getPassword1().sendKeys("Amazon#00");
        invalidUser.getLoginResult1().click();

    }

    @Then("the user can not login into amazon")
    public void the_user_can_not_login_into_amazon(){

        System.out.println("Invalid User Details");


    }


    @Given("the user navigates to the amazon home page")
    public void the_user_navigates_to_the_amazon_home_page(){
        url = QaProps.getValue("url");
        driver.get(url);
    }

    @When("the user click on search bar {string} .")
    public void the_user_click_on_search_bar(String srg0){
        search = new Search(driver);
        search.getSearchBar().sendKeys(srg0);
        search.getClickSearch().sendKeys(Keys.ENTER);

    }

    @Then("the user find required object")
    public void the_user_find_required_object(){
        //Assert.assertTrue(driver.getCurrentUrl().contains("https://www.amazon.in/"));
    }
}
