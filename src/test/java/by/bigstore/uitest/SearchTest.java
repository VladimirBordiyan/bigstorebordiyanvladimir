package by.bigstore.uitest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.SearchPage;

public class SearchTest {
    private WebDriver driver;
    private SearchPage searchPage;

    @BeforeClass
    public void setUp() {
        driver = new ChromeDriver();
        searchPage = new SearchPage(driver);
        searchPage.openWebsite();
        searchPage.closeCookies();
    }

    @Test
    public void testSearchForProduct() {
        searchPage.openWebsite();
        searchPage.searchForProduct("Телевизор SAMSUNG UE55DU7100UXRU");

        String expectedTitle = "Телевизор SAMSUNG UE55DU7100UXRU";
        String actualTitle = searchPage.getProductTitle();
        Assert.assertEquals(actualTitle, expectedTitle, "Заголовок продукта не соответствует ожидаемому");
    }

    @AfterClass
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
