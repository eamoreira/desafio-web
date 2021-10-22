package elementMapper;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePageElementMapper {

    @FindBy(className = "login")
    public WebElement login;

    public WebElement search_query_top;

    @FindBy(xpath = "//*[@id=\"searchbox\"]/button")
    public WebElement submit_search;
}