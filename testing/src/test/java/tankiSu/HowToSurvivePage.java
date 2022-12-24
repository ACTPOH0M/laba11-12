package tankiSu;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.DefaultElementLocatorFactory;

public class HowToSurvivePage {
    private Logger log = LogManager.getRootLogger();
    @FindBy(xpath = "//a[@id='spotting_concealment']")
    private WebElement title;
    private static WebDriver driver;
    public HowToSurvivePage(WebDriver webDriver)
    {
        this.driver = webDriver;
        PageFactory.initElements(new DefaultElementLocatorFactory(webDriver), this);
    }
    public HowToSurvivePage ScrollingToArticle()
    {   log.info("scrolling to article");
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", title);
        return this;
    }
}
