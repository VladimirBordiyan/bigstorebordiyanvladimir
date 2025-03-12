package by.bigstore;

import driver.Singleton;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import pages.HomePage;

public class HomeTest {

    @BeforeEach
    public void setUp() {
        HomePage homePage = new HomePage();
        homePage.openWebsite();;
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
