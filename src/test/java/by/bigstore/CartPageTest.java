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

        cartPage.openWebsite();
    }

    @Test
    public void testAddProductToCart() {
        // Открываем каталог
        cartPage.openCatalog();

        // Выбираем категорию "Электроинструмент"
        cartPage.selectCategory();

        // Переходим на вкладку "Дрели"
        cartPage.selectPowerToolsDrill();

        // Выбираем нужную дрель
        cartPage.selectDrill();

        // Добавляем товар в корзину
        cartPage.addToCart();

        // Переход в корзину
        cartPage.goToCart();

        String productTitle = cartPage.getCartProductTitle();
        Assertions.assertEquals(productTitle, "Дрель ударная WORTEX DS 1308 (DS130800029)", productTitle);
    }

    @AfterEach
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
