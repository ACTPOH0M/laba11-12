package tankiSu;

import Model.User;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.DefaultElementLocatorFactory;

import java.util.List;

public class TournamentPage {
    private Logger log = LogManager.getRootLogger();
    private static WebDriver driver;
    @FindBy(xpath = "//a[@class='link-more']")
    private List<WebElement> linkToOptions;
    @FindBy(xpath = "//div[@class='filter_block filter_block__tournament js-filter-block']")
    private WebElement options;
    @FindBy(xpath = "//span[@class='filter-list_text']")
    private List<WebElement> itemsInOptions;
    @FindBy(xpath = "//span[@class='small-button']")
    private List<WebElement> submitButton;
    @FindBy(xpath = "//input[@class='input-light_inner input-light_inner__email -metrika-nokeys js-focus-state js-autofocus js-login-input js-input']")
    private WebElement login;
    @FindBy(xpath = "//input[@class='input-light_inner -metrika-nokeys js-input js-password-input js-focus-state ']")
    private WebElement password;
    @FindBy(xpath = "//span[@class='button-airy_inner js-submit-title']")
    private WebElement submitLogin;
    @FindBy(xpath = "//span[@class='link-more js-link-more']")
    private List<WebElement> linkToCreateTeam;
    @FindBy(xpath = "//input[@class='input']")
    private List<WebElement> inputArea;
    @FindBy(xpath = "//a[@class='button-action button-action__mobile-wide']")
    private List<WebElement> submitButtonInCreateTeam;
    @FindBy(xpath = "//a[@class='big-button js-confirm-team']")
    private WebElement accessTeam;
    @FindBy(xpath = "//a[@class='button-action button-action__mobile-wide js-popup-action']")
    private List<WebElement> access;




    public TournamentPage(WebDriver webDriver)
    {
        this.driver = webDriver;
        PageFactory.initElements(new DefaultElementLocatorFactory(webDriver), this);
    }

    public TournamentPage clickLinkToOptions()
    {
        linkToOptions.get(0).click();
        return this;
    }
    public TournamentPage openOptions()
    {
        Actions action = new Actions(driver);
        action.moveToElement(options);
        action.perform();
        return this;
    }
    public TournamentPage setOptions()
    {
        itemsInOptions.get(5).click();
        return this;
    }
    public TournamentPage joinToTournament()
    {
        submitButton.get(0).click();
        return this;
    }
    public TournamentPage loginUser(User user)
    {
        login.sendKeys(user.getUsername());
        password.sendKeys(user.getPassword());
        submitLogin.click();
        return this;
    }
    public TournamentPage createTeam()
    {
        linkToCreateTeam.get(1).click();
        return this;
    }
    public TournamentPage inputData()
    {
        inputArea.get(0).sendKeys("NameOfTeam");
        inputArea.get(1).sendKeys("call me in VK");
        return this;
    }
    public TournamentPage submitCreateTeam()
    {
        submitButtonInCreateTeam.get(0).click();
        return this;
    }
    public TournamentPage accessTeam()
    {
        accessTeam.click();
        return this;
    }
    public TournamentPage access()
    {
        access.get(1).click();
        return this;
    }

}
