package pages.ui;

import driver.Singleton;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginPage {

    private final By LOGIN_BUTTON_HOME_PAGE = By.xpath("//div[@class=\"svg-icon header-icon__icon--person\"]");
    private final By USERNAME_FIELD = By.xpath("//div[@class=\"open-logon open-login\"]//input[@id=\"login-modal-input-login\"]");
    private final By PASSWORD_FIELD = By.xpath("//div[@class=\"open-logon open-login\"]//input[@id=\"password\"]");
    private final By LOGIN_BUTTON = By.xpath("//div[@class=\"open-logon open-login\"]//input[@value=\"Войти\"]");
    private final By ERROR_MESSAGE = By.xpath("//div[@class=\"messages error\"]");
    private final By CLOSE_COOKIES_LOCATOR = By.xpath("//button[@class=\"btn btn-orange js-accept-cookies\"]");
    private final String URL = "https://7745.by/";

    private WebDriver driver;
    private WebDriverWait wait;

    public LoginPage() {
        this.driver = Singleton.getDriver();
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    }

    public void openWebsite() {
        driver.get(URL);
    }

    public void closeCookies() {
        driver.findElement(CLOSE_COOKIES_LOCATOR).click();
    }

    public void login(String username, String password) {
        wait.until(ExpectedConditions.elementToBeClickable(LOGIN_BUTTON_HOME_PAGE)).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(USERNAME_FIELD)).sendKeys(username);
        wait.until(ExpectedConditions.visibilityOfElementLocated(PASSWORD_FIELD)).sendKeys(password);
        wait.until(ExpectedConditions.elementToBeClickable(LOGIN_BUTTON)).click();
    }

    public String getErrorMessageText() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(ERROR_MESSAGE)).getText();
    }
}