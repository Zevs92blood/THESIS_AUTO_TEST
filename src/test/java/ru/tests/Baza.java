package ru.tests;

import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import ru.app.AppManager;
import ru.tech.Konfig;


public class Baza {

    protected static final AppManager app = new AppManager();

    @BeforeSuite
    public void setUp() throws Exception {
        Konfig konf = new Konfig();
        // equals - сравнение для строк.
        if (konf.browser.equals("chrome")) {
            if (konf.useLinux.equals("false"))
                System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver.exe"); //обращение для винды.
            else
                System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver"); //обращение для линуха
        } else {
            if (konf.useLinux.equals("false"))
                System.setProperty("webdriver.gecko.driver", "./src/test/resources/geckodriver.exe"); //обращение для винды.
            else
                System.setProperty("webdriver.gecko.driver", "./src/test/resources/geckodriver"); //обращение для линуха
        }
        app.init(konf);
    }

    @AfterSuite
    public void tearDown() {
        app.stop();
    }


}
