package ru.app;

import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import ru.tech.Konfig;


import java.util.concurrent.TimeUnit;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class AppManager {

    private HelperOfNavigation helperOfNavigation;

    private HelperOfSession helperOfSession;
    WebDriver driver; // Для линуха ставим sudo apt-get install chromium-chromedriver

    public static boolean isAlertPresent(WebDriver driver) {
        try {
            driver.switchTo().alert();
            return true;
        } catch (NoAlertPresentException e) {
            return false;

        }
    }

    public void init(Konfig konf) {
        open(konf.podopitnie);
        $(By.xpath("//input[@type='text']")).setValue(konf.userL); //вход в систему.
        $(By.xpath("//input[@type='password']")).setValue(konf.userP);
        $("div.v-button.v-widget.v-has-width").click();
    }


    public void stop() {
        driver.quit();
    }


    public HelperOfNavigation getHelperOfNavigation() {
        return helperOfNavigation;
    }

    public WebDriver getDriver() {
        return driver;
    }
}
