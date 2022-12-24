package tankiSu;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.DefaultElementLocatorFactory;

public class RatingsPage {
    private Logger log = LogManager.getRootLogger();
    @FindBy(xpath = "//li[@class='rating-links-grid_item']")
    private WebElement menu;
    private static WebDriver driver;
    public RatingsPage(WebDriver webDriver)
    {
        this.driver = webDriver;
        PageFactory.initElements(new DefaultElementLocatorFactory(webDriver), this);
    }
    public RatingsPage clickRatingsByAchievements() {
        menu.click();
        return this;
    }
}
