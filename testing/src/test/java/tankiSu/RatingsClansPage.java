package tankiSu;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.DefaultElementLocatorFactory;

public class RatingsClansPage {
    private Logger log = LogManager.getRootLogger();
    @FindBy(xpath = "//div[@class='tbl-rating_tr js-rating-row-clan-23381 tbl-rating_tr__clickable js-toggle-clan-info js-toggle-clan-info-23381']")
    private WebElement firstPlace;
    @FindBy(xpath = "//a[@class=' profile-link link js-clan-profile-link profile-link__wot']")
    private WebElement linkToProfileClan;

    private static WebDriver driver;
    public RatingsClansPage(WebDriver webDriver)
    {
        this.driver = webDriver;
        PageFactory.initElements(new DefaultElementLocatorFactory(webDriver), this);
    }
    public RatingsClansPage clickFirstPlace()
    {
        log.info("click on first clan in link");
        firstPlace.click();
        return this;
    }

}
