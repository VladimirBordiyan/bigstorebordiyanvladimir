package by.bigstore.uitest;

import driver.Singleton;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.ui.LoginPage;

public class LoginTest {
    private WebDriver driver;
    private LoginPage loginPage;

    @BeforeEach
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        loginPage = new LoginPage();
        loginPage.openWebsite();
        loginPage.closeCookies();
    }

        @Test
        public void testLogin () {
            LoginPage loginPage = new LoginPage();
            loginPage.openWebsite();
            loginPage.login("656000000", "0123456");
            String errorMessage = loginPage.getErrorMessageText();
            Assertions.assertEquals("Извините, указанный номер телефона или пароль неверны. Попробуйте набрать снова.", errorMessage);
        }

        @AfterEach
        public void tearDown () {
            Singleton.quit();
        }
    }
