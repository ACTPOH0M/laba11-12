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

public class SearchPlayersPage {
    private Logger log = LogManager.getRootLogger();
    private static final String USERNAME = "AC_TP_OH_OM";
    @FindBy(xpath = "//input[@class='b-search_input js-account-table-search js-tooltip']")
    private WebElement inputText;
    @FindBy(xpath = "//input[@class='b-btn-search']")
    private WebElement findButton;
    @FindBy(linkText = "AC_TP_OH_OM [CVARA]")
    private WebElement userInList;

    private static WebDriver driver;
    public SearchPlayersPage(WebDriver webDriver)
    {
        this.driver = webDriver;
        PageFactory.initElements(new DefaultElementLocatorFactory(webDriver), this);
    }
    public SearchPlayersPage inputData()
    {
        log.info("input data");
        inputText.click();
        inputText.sendKeys(USERNAME);
        return this;
    }
    public SearchPlayersPage clickFind()
    {
        log.info("click submit");
        findButton.click();
        return this;
    }
    public SearchPlayersPage clickOnUser() throws InterruptedException {
        Thread.sleep(2000);
        log.info("click on user");
        userInList.click();
        return this;
    }
}
