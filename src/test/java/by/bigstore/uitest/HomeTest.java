package by.bigstore.uitest;

import driver.Singleton;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.HomePage;

public class HomeTest {
    private WebDriver driver;
    private HomePage homePage;

    @BeforeEach
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        homePage = new HomePage();
        homePage.openWebsite();
        homePage.closeCookies();
    }

    @Test
    public void testHomePageOpend() {
        HomePage homePage = new HomePage();
        homePage.openWebsite();
        String actual = homePage.getDivContainsText();
        Assertions.assertEquals("© 2015-2025 7745.by", actual);
    }

    @AfterEach
    public void tearDown() {
        Singleton.quit();
    }
}
