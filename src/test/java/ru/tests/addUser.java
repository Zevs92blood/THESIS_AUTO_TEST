package ru.tests;


import org.openqa.selenium.By;
import org.testng.annotations.Test;
import ru.tech.Konfig;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;

public class addUser extends Baza {

    @Test
    public void addUserAllRole() throws InterruptedException, IOException {
        Konfig konf = new Konfig();
        TimeUnit.SECONDS.sleep(1);
        $(By.xpath("//span[6]")).click();
        $(By.xpath("//div[2]/div/div/span/span")).click();
        $(By.cssSelector("div.v-csslayout.v-layout.v-widget.c-flowlayout.v-csslayout-c-flowlayout.c-buttons-panel.v-csslayout-c-buttons-panel.v-csslayout-spacing > div.v-button.v-widget.v-popupbutton")).click();
        $(By.cssSelector("div.c-cm-button.v-widget.v-has-width.c-cm-button-selected")).click();
        TimeUnit.SECONDS.sleep(1);
        $(By.xpath("//input")).setValue(konf.first_name);
        $(By.xpath("//div[3]/input")).setValue("1");
        $(By.xpath("//div[4]/input")).setValue("1");
        $(By.xpath("//div[9]/input")).setValue("malahov@haulmont.com");
        $(By.xpath("//div[2]/div[2]/div/div")).click();
        $(By.cssSelector("div.v-tree8.v-widget.v-has-width.v-has-height > div.v-tree8-tablewrapper > table > tbody.v-tree8-body > tr.v-tree8-row.v-tree8-row-stripe.v-tree8-row-has-data.v-tree8-row-depth-1 > td.v-tree8-cell > div.v-tree8-node.depth-1 > div.gwt-HTML.v-tree8-cell-content > span.v-captiontext")).click();
        $(By.cssSelector("div.v-horizontallayout.v-layout.v-horizontal.v-widget.c-lookup-window-actions.v-horizontallayout-c-lookup-window-actions > div.v-slot.v-slot-primary.v-slot-c-primary-action > div.v-button.v-widget.primary.v-button-primary.c-primary-action.v-button-c-primary-action")).click();
        $(By.cssSelector("span.v-checkbox.v-checkbox-empty-caption.v-widget.v-has-width")).click();
        $(By.cssSelector("div.v-csslayout.v-layout.v-widget.c-flowlayout.v-csslayout-c-flowlayout.c-buttons-panel.v-csslayout-c-buttons-panel.v-csslayout-spacing > div.v-button.v-widget.icon")).click();
        $(By.xpath("//div[2]/div/table/tbody/tr/td/div")).click();
        $(By.cssSelector("div.v-button.v-widget.primary.v-button-primary.c-primary-action.v-button-c-primary-action")).click();
        int i;
        for (i = 2; i < 24; i++) {
            if (i != 19) {
                $(By.cssSelector("div.v-csslayout.v-layout.v-widget.c-flowlayout.v-csslayout-c-flowlayout.c-buttons-panel.v-csslayout-c-buttons-panel.v-csslayout-spacing > div.v-button.v-widget.icon")).click();
                $(By.xpath("//div[2]/div/table/tbody/tr[" + i + "]/td/div")).click();
                $(By.cssSelector("div.v-button.v-widget.primary.v-button-primary.c-primary-action.v-button-c-primary-action")).click();
            }
        }

        $(By.cssSelector("div.v-button.v-widget.primary.v-button-primary.c-primary-action.v-button-c-primary-action")).click();
        $(By.cssSelector("div.v-button.v-widget.primary.v-button-primary.c-primary-action.v-button-c-primary-action")).click();
        $(By.cssSelector("div.v-button.v-widget.c-primary-action.v-button-c-primary-action.icon")).click();
        TimeUnit.SECONDS.sleep(1);
        $(By.xpath("//div[5]/input")).sendKeys(konf.last_name);
        $(By.xpath("//textarea")).sendKeys("1");
        $(By.cssSelector("div.v-button.v-widget.primary.v-button-primary.c-primary-action.v-button-c-primary-action")).click();


    }


}
