package driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Wait {
    private WebDriver driver;
    private WebDriverWait wait;

    public Wait(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(4));
    }

    public WebElement waitForElementToBeVisible(By locator) {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    public WebElement waitForElementToBeClickable(By locator) {
        return wait.until(ExpectedConditions.elementToBeClickable(locator));
    }

    public String waitForTextToBePresentInElement(By locator, String text) {
        wait.until(ExpectedConditions.textToBePresentInElementLocated(locator, text));
        return driver.findElement(locator).getText();
    }
}
