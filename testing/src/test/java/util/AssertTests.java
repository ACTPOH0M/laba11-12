package util;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class AssertTests {
    private static Logger log = LogManager.getRootLogger();
    public static String actual(WebElement locator, WebDriver driver) {
        log.info("actual");
        driver.manage().timeouts().implicitlyWait(5000,
                TimeUnit.MILLISECONDS);
        return locator.getText();
    }
}
