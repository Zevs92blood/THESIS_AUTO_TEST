package ru.app;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import ru.tech.Konfig;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;


public class HelperOfSession extends GeneralHelper {

    public HelperOfSession(WebDriver driver) {
        super(driver);
    }

    public void login(Konfig konf) {
        $(By.name("user")).setValue(konf.userL); //вход в систему.
        $(By.name("pass")).setValue(konf.userP);
        $("#submit").click();

    }
}
