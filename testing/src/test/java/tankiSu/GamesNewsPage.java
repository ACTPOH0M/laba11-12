package tankiSu;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.DefaultElementLocatorFactory;

import java.util.List;

public class GamesNewsPage {
    private Logger log = LogManager.getRootLogger();
    private static WebDriver driver;
    @FindBy(xpath = "//div[@class='filter_crop']")
    private WebElement menuButton;
    @FindBy(xpath = "//span[@class='filter-list_text']")
    private List<WebElement> changeOptionsInFilter;
    @FindBy(xpath = "//div[@class='preview_item js-preview-item']")
    private List<WebElement> itemsInList;


    public GamesNewsPage(WebDriver webDriver)
    {
        this.driver = webDriver;
        PageFactory.initElements(new DefaultElementLocatorFactory(webDriver), this);
    }
    public GamesNewsPage openFilter()
    {
        log.info("open filter");
        Actions action = new Actions(driver);
        action.moveToElement(menuButton);
        action.perform();
        log.info("change options");
        changeOptionsInFilter.get(7).click();
        return this;
    }
    public GamesNewsPage clickItemInList() throws InterruptedException {
        Thread.sleep(2000);
        log.info("click item");
        Actions action = new Actions(driver);
        action.moveToElement(itemsInList.get(11));
        action.perform();
        itemsInList.get(11).click();
        return this;
    }
}
