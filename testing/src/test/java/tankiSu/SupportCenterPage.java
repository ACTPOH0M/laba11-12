package tankiSu;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.DefaultElementLocatorFactory;

import java.util.List;

public class SupportCenterPage {
    private Logger log = LogManager.getRootLogger();
    private static WebDriver driver;
    @FindBy(xpath = "//a[@class='category-card']")
    private List<WebElement> category;
    @FindBy(xpath = "//a[@class='list-main_link']")
    private List<WebElement> itemInList;
    @FindBy(xpath = "//div[@class='dropdown_item']")
    private List<WebElement> listOfSolutions;

    public SupportCenterPage(WebDriver webDriver)
    {
        this.driver = webDriver;
        PageFactory.initElements(new DefaultElementLocatorFactory(webDriver), this);
    }
    public SupportCenterPage clickCategory() throws InterruptedException {
        Thread.sleep(2000);
        log.info("click category");
        category.get(2).click();
        return this;
    }
    public SupportCenterPage itemsInList() throws InterruptedException {
        Thread.sleep(2000);
        log.info("click item in list");
        itemInList.get(25).click();
        return this;
    }
    public SupportCenterPage clickSolution()
    {
        log.info("click solution");
        listOfSolutions.get(2).click();
        return this;
    }
}
