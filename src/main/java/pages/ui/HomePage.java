package pages.ui;

import driver.Singleton;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

    public final By DIV_CONTAINS_LOCATOR = By.xpath("// div//*[contains(text(), '2015-2025')]");
    private final By CLOSE_COOKIES_LOCATOR = By.xpath("//button[@class=\"btn btn-orange js-accept-cookies\"]");
    private final String URL = "https://7745.by/";

    private WebDriver driver;

    public HomePage() {
        this.driver = Singleton.getDriver();
    }

    public void openWebsite() {
        driver.get(URL);
    }

    public void closeCookies() {
        driver.findElement(CLOSE_COOKIES_LOCATOR).click();
    }

    public String getDivContainsText() {
        return driver.findElement(DIV_CONTAINS_LOCATOR).getText();
    }
}

