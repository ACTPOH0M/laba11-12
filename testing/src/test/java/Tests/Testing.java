package Tests;

import Model.User;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.annotations.Test;
import service.UserCreator;
import tankiSu.*;
import util.AssertTests;

import java.util.List;

import static org.testng.AssertJUnit.assertEquals;

public class Testing  extends CommonConditions  {

    private static Logger log = LogManager.getRootLogger();
    User user = UserCreator.withCredentialsFromProperty();
    private  static  final  String resultTest1 ="Обнаружение и маскировка";
    private  static  final  String resultTest2 ="ВЧЕРА";
    private  static  final  String resultTest3 ="ŠKODA T 45";
    private  static  final  String resultTest4 ="Запрещённые моды";
    private  static  final  String resultTest5 ="AC_TP_OH_OM";
    private  static  final  String resultTest6 ="ПОДРОБНЕЕ";
    private  static  final  String resultTest7 ="C o y o t e s";
    private  static  final  String resultTest8 ="Варианты решения проблемы";
    private  static  final  String resultTest9 ="Хэллоуин 2022: только веселье и колдовство";
    private  static  final  String resultTest10 ="\n" +
            "                                    Состав подтверждён\n" +
            "                                ";
    @FindBy(xpath = "//h2[3]")
    private WebElement titleResultTest1;
    @FindBy(xpath = "//span[@class='filter-nav_option']")
    private WebElement titleResultTest2;
    @FindBy(xpath = "//h1[@class='garage_title garage_title__inline garage_title__gold js-tank-title']")
    private WebElement titleResultTest3;
    @FindBy(xpath = "//h1[@class='header-inner_title']")
    private WebElement titleResultTest4;
    @FindBy(xpath = "//div[@class='user-name_inner']")
    private WebElement titleResultTest5;
    @FindBy(xpath = "//h2[@class='description_title heading-h3']")
    private WebElement titleResultTest6;
    @FindBy(xpath = "//span[@class='clan_name js-longname']")
    private WebElement titleResultTest7;
    @FindBy(xpath = "//div[@class='dropdown_title']")
    private List<WebElement> titleResultTest8;
    @FindBy(xpath = "//title")
    private WebElement titleResultTest9;
    @FindBy(xpath = "//p[@class='header-inner_directive']")
    private List<WebElement> titleResultTest10;


      @Test
      public void FindInformationAboutDetectionAndMasking(){
              new HomePage(webDriver)
                      .openPage()
                      .clickMainMenuGuides()
                      .clickMenuBurgerNewbieFromGuides();
              new NewcomersGuidePage(webDriver)
                      .clickMenu();
              new HowToSurvivePage(webDriver)
                      .ScrollingToArticle();
          assertEquals(AssertTests.actual(titleResultTest1,webDriver),resultTest1 );
      }
      @Test
      public void FindRatingYesterday(){
          new HomePage(webDriver)
                  .openPage()
                  .clickMainMenuGame()
                  .clickMenuBurgerRatingFromGameMenu();
          new RatingsPage(webDriver)
                  .clickRatingsByAchievements();
          new AchievementsPage(webDriver)
                  .changeOptions()
                  .clickToChangeOptions();
          assertEquals(AssertTests.actual(titleResultTest2,webDriver),resultTest2 );
      }
      @Test
      public void findInformationAboutTheTankSKODAT45() throws InterruptedException {
          new HomePage(webDriver)
                  .openPage()
                  .clickMainMenuGame()
                  .clickMenuBurgerTankScienceFromGameMenu();
          new TankSciencePage(webDriver)
                  .openOptions()
                  .clickOptionsNation()
                  .clickOptionsType()
                  .clickTankInList();
          assertEquals(AssertTests.actual(titleResultTest3,webDriver),resultTest3);
      }
      @Test
      public void findInformationAboutBannedMods(){
          new HomePage(webDriver)
                  .openPage()
                  .clickMainMenuGuides()
                  .clickMenuBurgerWePlayByTheRulesFromGuides();
          new WePlayByTheRulesPage(webDriver).clickMenuForNewbies();
          assertEquals(AssertTests.actual(titleResultTest4,webDriver),resultTest4 );
      }
      @Test
      public void findPlayerStats() throws InterruptedException {
          new HomePage(webDriver)
                  .openPage()
                  .clickMainMenuCommunityButton()
                  .clickMenuBurgerSearchForPlayersFromCommunityButton();
          new SearchPlayersPage(webDriver)
                  .inputData()
                  .clickFind()
                  .clickOnUser();
          assertEquals(AssertTests.actual(titleResultTest5,webDriver),resultTest5);
      }

      @Test
      public void findPriceOfOneDayTankPremiumAccount() throws InterruptedException {
          new HomePage(webDriver)
                  .openPage()
                  .clickUpperMenuService()
                  .clickSiteButtonOfPrime();
          new PremiumShopPage(webDriver)
                  .clickOfProduct()
                  .clickItemInShop();
          assertEquals(AssertTests.actual(titleResultTest6,webDriver),resultTest6);
      }

    @Test
    public void viewTheProfileOfTheFirstClanInTheRanking() {
        new HomePage(webDriver)
                .openPage()
                .clickMainMenuClansButton()
                .clickMenuBurgerRatingOfClansFromClansButton();
        new RatingsClansPage(webDriver)
                .clickFirstPlace();

        assertEquals(AssertTests.actual( titleResultTest7,webDriver),resultTest7);
    }
    @Test
    public void findSolutionToReducePing() throws InterruptedException {
        new HomePage(webDriver)
                .openPage()
                .clickUpperMenuSupportCenter();
        new SupportCenterPage(webDriver)
                .clickCategory()
                .itemsInList()
                .clickSolution();
        assertEquals(AssertTests.actual(titleResultTest8.get(2),webDriver),resultTest8);
    }
    @Test
    public void findInformationAboutHalloween() throws InterruptedException {
        new HomePage(webDriver)
                .openPage()
                .clickMainMenuGame()
                .clickMenuBurgerGamesNewsFromGameMenu();
        new GamesNewsPage(webDriver)
                .openFilter()
                .clickItemInList();
        assertEquals(AssertTests.actual(titleResultTest9,webDriver),resultTest9);
    }
    @Test
    public void registrationInTournament()
    {
        new HomePage(webDriver)
                .openPage()
                .clickMainMenuTournament();
        new TournamentPage(webDriver)
                .clickLinkToOptions()
                .openOptions()
                .setOptions()
                .joinToTournament()
                .loginUser(user)
                .createTeam()
                .inputData()
                .submitCreateTeam()
                .accessTeam()
                .access();
        assertEquals(AssertTests.actual(titleResultTest10.get(0),webDriver),resultTest10);
    }
}
