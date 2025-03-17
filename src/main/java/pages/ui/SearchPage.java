package pages.ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SearchPage {
    private WebDriver driver;
    private WebDriverWait wait;

    private final String URL = "https://7745.by/";
    private final By SEARCH_INPUT_LOCATOR = By.xpath("//input[@id='search']");
    private final By SEARCH_BUTTON_LOCATOR = By.xpath("//span[@class='search-icon']");
    private final By PRODUCT_TITLE_LOCATOR = By.xpath("//h1[@class='product__title js-prod-title']");
    private final By CLOSE_COOKIES_LOCATOR = By.xpath("//button[@class=\"btn btn-orange js-accept-cookies\"]");

    public SearchPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(20));
    }

    public void closeCookies() {
        driver.findElement(CLOSE_COOKIES_LOCATOR).click();
    }

    public void openWebsite() {
        driver.get(URL);
    }

    public void searchForProduct(String productName) {
        WebElement searchInputElement = wait.until(ExpectedConditions.visibilityOfElementLocated(SEARCH_INPUT_LOCATOR));
        searchInputElement.sendKeys(productName);

        WebElement searchButtonElement = wait.until(ExpectedConditions.elementToBeClickable(SEARCH_BUTTON_LOCATOR));
        searchButtonElement.click();
    }

    public String getProductTitle() {
        WebElement titleElement = wait.until(ExpectedConditions.visibilityOfElementLocated(PRODUCT_TITLE_LOCATOR));
        return titleElement.getText();
    }
}
