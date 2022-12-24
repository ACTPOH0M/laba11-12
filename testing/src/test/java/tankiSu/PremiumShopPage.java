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

public class PremiumShopPage {
    private Logger log = LogManager.getRootLogger();
    private static WebDriver driver;
    @FindBy(xpath = "//a[@class='category-menu_link']")
    private List<WebElement> itemOfProducts;
    @FindBy(xpath = "//a[@class='product_link']")
    private List<WebElement> itemsInShop;

    public PremiumShopPage(WebDriver webDriver)
    {
        this.driver = webDriver;
        PageFactory.initElements(new DefaultElementLocatorFactory(webDriver), this);
    }
    public PremiumShopPage clickOfProduct() throws InterruptedException {
        Thread.sleep(5000);
        log.info("click of product");
        itemOfProducts.get(2).click();
        return this;
    }
    public PremiumShopPage clickItemInShop() throws InterruptedException {
        Thread.sleep(5000);
        log.info("click item in shop");
        itemsInShop.get(10).click();
        return this;
    }

}
