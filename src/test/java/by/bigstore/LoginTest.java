package by.bigstore;

import driver.Singleton;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import pages.LoginPage;

public class LoginTest {

    @Test
    public void testLogin() {
        LoginPage loginPage = new LoginPage();
        loginPage.open();

        loginPage.login("656000000", "0123456");

        String errorMessage = loginPage.getErrorMessageText();
        Assertions.assertEquals("Извините, указанный номер телефона или пароль неверны. Попробуйте набрать снова.", errorMessage);
    }

    @AfterEach
    public void tearDown() {
        Singleton.quit();
    }
}