package by.bigstore.uitest;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.CartPage;

public class CartPageTest {
    private WebDriver driver;
    private CartPage cartPage;

    @BeforeEach
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        cartPage = new CartPage(driver);
        cartPage.openWebsite();
        cartPage.closeCookies();
    }

    @Test
    public void testAddProductToCart() {
        cartPage.openCatalog();

        cartPage.selectCategory();

        cartPage.selectPowerToolsDrill();

        cartPage.selectDrill();

        cartPage.addToCart();

        cartPage.goToCart();

        String product = cartPage.getCartProductTitle();
        Assertions.assertEquals(product, "Дрель ударная WORTEX DS 1308 (DS130800029)", product);
    }

    @AfterEach
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
