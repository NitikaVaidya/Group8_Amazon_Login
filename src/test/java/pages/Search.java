package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Search {

    private WebDriver driver;

    public Search(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }


    @FindBy(id = "twotabsearchtextbox")
    WebElement searchBar;

    public WebElement getSearchBar() {
        return searchBar;
    }

    public WebElement getClickSearch() {
        return clickSearch;
    }



    @FindBy(id = "twotabsearchtextbox")
    WebElement clickSearch;




}
