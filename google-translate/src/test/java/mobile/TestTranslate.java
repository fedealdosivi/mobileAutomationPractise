package mobile;

import org.junit.Test;
import org.openqa.selenium.remote.DesiredCapabilities;
import webdriver.mobile.MobileTest;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class TestTranslate extends MobileTest<TranslateSetUp> {
    @Override
    protected TranslateSetUp getInitialScreen() {
        return new TranslateSetUp();
    }

    @Override
    protected void setCapabilities(DesiredCapabilities desiredCapabilities) {
        desiredCapabilities.setCapability("appPackage","com.google.android.apps.translate");
        desiredCapabilities.setCapability("appActivity", "com.google.android.apps.translate.TranslateActivity");
    }

    @Test
    public void TestTranslate(){
        String result=getInitialScreen()
                .selectFirstLanguage("English")
                .selectLanguage()
                .selectSecondLanguage("Swedish")
                .selectLanguage()
                .pressTranslateOffline()
                .pressDone()
                .pressHome()
                .inputTextToTranslate()
                .setTextToTranslate("hi")
                .getResult();

        assertEquals("Hej",result);
    }

    @Test
    public void TestTakeTour(){
        String result=getInitialScreen()
                   .pressTranslateOffline()
                   .pressDone()
                   .pressHome()
                   .pressTakeTour()
                   .pressLater()
                   .verifyTourIsNotShown();
        assertEquals("Not shown",result);
    }

    @Test
    public void TestAddPhrase(){
        getInitialScreen()
                .pressTranslateOffline()
                .pressDone()
                .pressHome()
                .inputTextToTranslate()
                .setTextToTranslate("ant")
                .pressSelect()
                .addToPhrasebook();

    }

    @Test
    public void TestPhrasebook(){
        getInitialScreen()
                .pressDone()
                .pressPhrasebook();
    }

    @Test
    public void TestSMS(){
        getInitialScreen()
                .pressDone()
                .pressSMS();
    }

    @Test
    public void TestOffline(){
        getInitialScreen()
                .pressDone()
                .pressOffline();
    }

    @Test
    public void TestSettings(){
        getInitialScreen()
                .pressDone()
                .pressSettings();
    }

    @Test
    public void TestHelp(){
        getInitialScreen()
                .pressDone()
                .pressHelp();
    }

}
