package pageObjects;

import elementMapper.CategoryPageElementMapper;
import org.openqa.selenium.support.PageFactory;
import utils.Browser;

public class CategoryPage extends CategoryPageElementMapper {

    public CategoryPage() {
        PageFactory.initElements(Browser.getCurrentDriver(),this);
    }

    public boolean isPageTShirts() {
        return getAutheticationPageTShirts().contains("T-SHIRTS");
    }

    public String getAutheticationPageTShirts() {
        return nameCategoryTShirt.getText();
    }
}
