package by.bigstore;

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

        driver.get("https://7745.by/");
    }

    @Test
    public void testAddProductToCart() {

        cartPage.openCatalog();

        cartPage.selectCategory();

        cartPage.selectPowerToolsDrill();


        cartPage.selectWortexBrand();

        cartPage.clickSearchButton();

        cartPage.selectDrill();

        cartPage.addToCart();

        cartPage.goToCart();

        Assertions.assertTrue(cartPage.isProductInCart(), "Дрель ударная WORTEX DS 1308 (DS130800029)");
    }

    @AfterEach
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}

