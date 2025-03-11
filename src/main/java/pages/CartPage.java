package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CartPage {

    private final By BUTTON_CATALOG_LOCATOR = By.xpath("//span[@class=\"catalog-nav-icon\"]");
    private final By CATALOG_LOCATOR = By.xpath("//li[@class=\"cat-136108\"]");
    private final By CATALOG_POWER_TOOLS_DRILL_LOCATOR = By.xpath("//a[@href=\"/catalog/dreli\"]");
    private final By SELECT_POWER_TOOLS_DRILL_VALUE_LOCATOR = By.xpath("//input[@value=\"wortex\"]");
    private final By BUTTON_SEARCH_POWER_TOOLS_DRILL_LOCATOR = By.xpath("//button[@class=\"btn btn-orange\"]");
    private final By BUTTON_SELECT_DRILL_LOCATOR = By.xpath("//a[@href=\"/product/drel-udarnaya-wortex-ds-1308\"]");
    private final By BUTTON_CART_LOCATOR = By.xpath("//button[@class=\"btn btn-orange btn-buy \"]");
    private final By CART_PAGE_LOCATOR = By.xpath("//div[@class=\"svg-icon header-icon__icon--cart\"]");
    private final By CART_PAGE_MESSAGE_LOCATOR = By.xpath("//a[@href=\"/product/drel-udarnaya-wortex-ds-1308\"]");
    private final String URL = "https://7745.by/";

    private WebDriver driver;
    private WebDriverWait wait;

    public CartPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(15));
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

    public void selectWortexBrand() {
        wait.until(ExpectedConditions.elementToBeClickable(SELECT_POWER_TOOLS_DRILL_VALUE_LOCATOR)).click();
    }

    public void clickSearchButton() {
        wait.until(ExpectedConditions.elementToBeClickable(BUTTON_SEARCH_POWER_TOOLS_DRILL_LOCATOR)).click();
    }

    public void selectDrill() {
        wait.until(ExpectedConditions.elementToBeClickable(BUTTON_SELECT_DRILL_LOCATOR)).click();
    }

    public void addToCart() {
        wait.until(ExpectedConditions.elementToBeClickable(BUTTON_CART_LOCATOR)).click();
    }

    public void goToCart() {
        wait.until(ExpectedConditions.elementToBeClickable(CART_PAGE_LOCATOR)).click();
    }

    public boolean isProductInCart() {
        WebElement cartMessage = wait.until(ExpectedConditions.visibilityOfElementLocated(CART_PAGE_MESSAGE_LOCATOR));
        return cartMessage.isDisplayed();
    }
}

