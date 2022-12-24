package tankiSu;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.DefaultElementLocatorFactory;

import java.util.List;

public class HomePage {
    private Logger log = LogManager.getRootLogger();
    private static WebDriver driver;
    private static final String url = "https://tanki.su";
    @FindBy(xpath = "//span[@class='nav-submenu_arrow js-mainmenu-arrow']")
    private List<WebElement> menuButton;
    @FindBy(xpath = "//a[@class='nav-detail_link js-portal-menu-link-text']")
    private List<WebElement> menuBurger;
    @FindBy(xpath = "//span[@class='cm-showcase_opener js-cm-tooltip-services js-cm-dropdown-link']")
    private WebElement upperMenuService;
    @FindBy(xpath = "//span[@class='cm-singletons_text cm-singletons_text__main']")
    private List<WebElement> upperMenu;

    public HomePage(WebDriver webDriver)
    {
        this.driver = webDriver;
        PageFactory.initElements(new DefaultElementLocatorFactory(webDriver), this);
    }
    public HomePage openPage()
    {
        log.info("open page");
        driver.get(url);
        return this;
    }
    public HomePage clickUpperMenuService()
    {
        log.info("click upper menu service");
        upperMenuService.click();
        return this;
    }
    public HomePage clickSiteButtonOfPrime()
    {
        log.info("click button of premium site");
        upperMenu.get(0).click();
        return this;
    }
    public HomePage clickUpperMenuSupportCenter()
    {
        log.info("click upper menu Support Center");
        upperMenu.get(1).click();
        return this;
    }

    public HomePage clickMainMenuGame()
    {
        log.info("click menu GAME");
        menuButton.get(0).click();
        return this;
    }
    public HomePage clickMainMenuTournament()
    {
        log.info("click menu tournament");
        menuButton.get(3).click();
        return this;
    }
    public HomePage clickMenuBurgerRatingFromGameMenu()
    {
        log.info("click RATING");
        menuBurger.get(3).click();
        return this;
    }
    public HomePage clickMenuBurgerGamesNewsFromGameMenu()
    {
        log.info("click GAMES NEWS");
        menuBurger.get(1).click();
        return this;
    }
    public HomePage clickMenuBurgerTankScienceFromGameMenu()
    {
        log.info("click TANK SCIENCE");
        menuBurger.get(4).click();
        return this;
    }

    public HomePage clickMainMenuGuides()
    {
        log.info("click menu GUIDES");
        menuButton.get(1).click();
        return this;
    }
    public HomePage clickMenuBurgerNewbieFromGuides()
    {
        log.info("click NEWBIES");
        menuBurger.get(5).click();
        return this;
    }
    public HomePage clickMenuBurgerWePlayByTheRulesFromGuides()
    {
        log.info("click WE PLAY BY THE RULES");
        menuBurger.get(10).click();
        return this;
    }

    public HomePage clickMainMenuCommunityButton()
    {
        log.info("click menu COMMUNITY");
        menuButton.get(3).click();
        return this;
    }
    public HomePage clickMenuBurgerSearchForPlayersFromCommunityButton()
    {
        log.info("click SEARCH PLAYERS");
        menuBurger.get(17).click();
        return this;
    }

    public HomePage clickMainMenuClansButton()
    {
        log.info("click menu CLANS");
        menuButton.get(2).click();
        return this;
    }
    public HomePage clickMenuBurgerRatingOfClansFromClansButton()
    {
        log.info("click RATING OF CLANS");
        menuBurger.get(13).click();
        return this;
    }
}
