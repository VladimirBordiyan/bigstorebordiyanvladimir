package pages.ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CartPage {

    private WebDriver driver;
    private WebDriverWait wait;

    private final By BUTTON_CATALOG_LOCATOR = By.xpath("//span[@class=\"catalog-nav-icon\"]");
    private final By CATALOG_LOCATOR = By.xpath("//li[@class=\"cat-136108\"]");
    private final By CATALOG_POWER_TOOLS_DRILL_LOCATOR = By.xpath("//a[@href=\"/catalog/dreli\"]");
    private final By BUTTON_SELECT_DRILL_LOCATOR = By.xpath("//a[@title=\"Дрель ударная WORTEX DS 1308\"]");
    private final By BUTTON_CART_LOCATOR = By.xpath("//button[@class=\"btn btn-orange btn-buy \"]");
    private final By CART_PAGE_LOCATOR = By.xpath("//div[@class=\"svg-icon header-icon__icon--cart\"]");
    private final By CART_PRODUCT_TITLE_LOCATOR = By.xpath("//div[@class=\"product-item__title\"]");
    private final By CLOSE_COOKIES_LOCATOR = By.xpath("//button[@class=\"btn btn-orange js-accept-cookies\"]");
    private final String URL = "https://7745.by/";

    public CartPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(20));
    }

    public void closeCookies() {
        driver.findElement(CLOSE_COOKIES_LOCATOR).click();
    }

    public void openWebsite() {
        driver.get(URL);
    }

    public void openCatalog() {
        wait.until(ExpectedConditions.elementToBeClickable(BUTTON_CATALOG_LOCATOR)).click();
    }

    public void selectCategory() {
        wait.until(ExpectedConditions.elementToBeClickable(CATALOG_LOCATOR)).click();
    }

    public void selectPowerToolsDrill() {
        wait.until(ExpectedConditions.elementToBeClickable(CATALOG_POWER_TOOLS_DRILL_LOCATOR)).click();
    }

    public void selectDrill() {
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(BUTTON_SELECT_DRILL_LOCATOR));
        Actions action = new Actions(driver);
        action.moveToElement(element).build().perform();
        element.click();
    }

    public void addToCart() {
        wait.until(ExpectedConditions.elementToBeClickable(BUTTON_CART_LOCATOR)).click();
    }

    public void goToCart() {
        wait.until(ExpectedConditions.elementToBeClickable(CART_PAGE_LOCATOR)).click();
    }

    public String getCartProductTitle() {
        WebElement productTitle = wait.until(ExpectedConditions.visibilityOfElementLocated(CART_PRODUCT_TITLE_LOCATOR));
        return productTitle.getText();
    }
}