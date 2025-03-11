package pages;

import org.openqa.selenium.By;

public class CartPage {

    private final By BUTTON_CATALOG_LOCATOR = By.xpath("//span[@class=\"catalog-nav-icon\"]");
    private final By CATALOG_LOCATOR = By.xpath("//li[@class=\"cat-136108\"]");
    private final By CATALOG_POWER_TOOLS_DRILL_LOCATOR = By.xpath("//a[@href=\"/catalog/dreli\"]");
    private final By SELECT_POWER_TOOLS_DRILL_VALUE_LOCATOR = By.xpath("//input[@value=\"wortex\"]");
    private final By BUTTON_SEARCH_POWER_TOOLS_DRILL_LOCATOR = By.xpath("//button[@class=\"btn btn-orange\"]");
    private final By BUTTON_SELECT_DRILL_LOCATOR = By.xpath("//a[@href=\"/product/drel-udarnaya-wortex-ds-1308\"]");
    private final By BUTTON_CART_LOCATOR = By.xpath("//button[@class=\"btn btn-orange btn-buy \"]");
    private final By CART_PAGE_LOCATOR = By.xpath("//div[@class=\"svg-icon header-icon__icon--cart\"]");
    private final By CART_PAGE_MESSAGE_LOCATOR = By.xpath("//a[@href=\"/product/drel-udarnaya-wortex-ds-1308\"]");
    private final String URL = "https://7745.by/";
}
