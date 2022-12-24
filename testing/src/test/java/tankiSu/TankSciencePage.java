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

public class TankSciencePage {
    private Logger log = LogManager.getRootLogger();
    private static WebDriver driver;
    @FindBy(xpath = "//div[@class='filter_crop']")
    private WebElement openOptions;
    @FindBy(xpath = "//span[@class='filter-list_text filter-list_text__hide']")
    private List<WebElement> menuOptions;
    @FindBy(xpath = "//a[@class='table-view_row']")
    private List<WebElement> listOfTanks;
    @FindBy(xpath = "//h1[@class='heading-1 heading-1__uppercase']")
    private WebElement overMouse;


    public TankSciencePage(WebDriver webDriver)
    {
        this.driver = webDriver;
        PageFactory.initElements(new DefaultElementLocatorFactory(webDriver), this);
    }

    public TankSciencePage openOptions()
    {
        log.info("open tank options");
        Actions action = new Actions(driver);
        action.moveToElement(openOptions);
        action.perform();
        return this;
    }
    public TankSciencePage clickOptionsNation()
    {
        log.info("click nation");
        menuOptions.get(7).click();
        return this;
    }
    public TankSciencePage clickOptionsType()
    {   log.info("click type");
        menuOptions.get(13).click();
        return this;
    }
    public TankSciencePage clickTankInList() throws InterruptedException {
        Thread.sleep(2000);
        log.info("click tank in list");
        Actions action = new Actions(driver);
        action.moveToElement(overMouse);
        action.perform();
        listOfTanks.get(1).click();
        return this;
    }
}
