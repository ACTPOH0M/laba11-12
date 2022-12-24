package tankiSu;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.DefaultElementLocatorFactory;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class WePlayByTheRulesPage {
    private Logger log = LogManager.getRootLogger();
    private static WebDriver driver;
    @FindBy(xpath = "//a[@class='newcomers-menu_link']")
    private List<WebElement> newcomersMenu;

    public WePlayByTheRulesPage(WebDriver webDriver)
    {
        this.driver = webDriver;
        PageFactory.initElements(new DefaultElementLocatorFactory(webDriver), this);
    }
    public WePlayByTheRulesPage clickMenuForNewbies()
    {
        newcomersMenu.get(1).click();
        return this;
    }
}
