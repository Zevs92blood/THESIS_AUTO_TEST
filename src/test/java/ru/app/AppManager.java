package ru.app;

import org.openqa.selenium.By;

import ru.tech.Konfig;


import static com.codeborne.selenide.Selenide.*;

public class AppManager {



    public void init(Konfig konf) {
        open(konf.podopitnie);
        $(By.xpath("//input[@type='text']")).setValue(konf.userL); //вход в систему.
        $(By.xpath("//input[@type='password']")).setValue(konf.userP);
        $("div.v-button.v-widget.v-has-width").click();
    }


    public void stop() {
        closeWebDriver();

    }



}
