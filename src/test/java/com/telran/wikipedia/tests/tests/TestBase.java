package com.telran.wikipedia.tests.tests;

import com.telran.wikipedia.tests.fw.AppManager;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.net.MalformedURLException;

public class TestBase {

    protected static AppManager app = new AppManager();

    @BeforeClass
    public void setUp() throws MalformedURLException {
        app.init();
    }

    @AfterClass(enabled = false)
    public void tearDown(){
        app.stop();
    }

}
