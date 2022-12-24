package tankiSu;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.DefaultElementLocatorFactory;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class AchievementsPage {
    private Logger log = LogManager.getRootLogger();
    @FindBy(xpath = "//div[@class='filter-nav_item js-tb-filter-block']")
    private WebElement menuOptions;
    @FindBy(xpath = "//li[@class='filter-nav_list-item']")
    private List<WebElement> options;
    private static WebDriver driver;
    public AchievementsPage(WebDriver webDriver)
    {
        this.driver = webDriver;
        PageFactory.initElements(new DefaultElementLocatorFactory(webDriver), this);
    }
    public AchievementsPage changeOptions()  {
        log.info("open options");
        Actions action = new Actions(driver);
        action.moveToElement(menuOptions);
        action.perform();
        return this;
    }
    public AchievementsPage clickToChangeOptions ()
    {
        log.info("click change options");
        options.get(1).click();
        return this;
    }
}
