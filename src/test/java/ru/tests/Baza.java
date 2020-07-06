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
        app.init(konf);
    }

    @AfterSuite
    public void tearDown() {
        app.stop();
    }


}
