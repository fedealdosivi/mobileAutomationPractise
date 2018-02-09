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
                .searchFirstLanguage("English")
                .selectLanguage()
                .searchSecondLanguage("Swedish")
                .selectLanguage()
                .pressTranslateOffline()
                .pressDoneToSideBar()
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
                   .pressDoneToSideBar()
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
                .pressDoneToSideBar()
                .pressHome()
                .inputTextToTranslate()
                .setTextToTranslate("ant")
                .pressSelect()
                .addToPhrasebook();

    }

    @Test
    public void TestTouchAction(){
        getInitialScreen()
                .pressTranslateOffline()
                .pressDoneToHome()
                .pressTouch(1000,500)
                .inputTextToTranslate()
                .setTextToTranslate("ant")
                .pressSelect()
                .addToPhrasebook();
    }

    @Test
    public void TestTouchOpenSideBar(){
        getInitialScreen()
                .pressTranslateOffline()
                .pressDoneToSideBar()
                .pressHome()
                .pressTouchSideBar()
                .pressHome()
                .inputTextToTranslate()
                .setTextToTranslate("hi")
                .pressSelect();
    }

    @Test
    public void TestScrollAction(){
        getInitialScreen()
                .pressTranslateOffline()
                .searchFirstLanguage("Georgian")
                .selectLanguageWithScroll()
                .pressDoneToHome();
    }

    @Test
    public void TestPhrasebook(){
        getInitialScreen()
                .pressDoneToSideBar()
                .pressPhrasebook();
    }

    @Test
    public void TestSMS(){
        getInitialScreen()
                .pressDoneToSideBar()
                .pressSMS();
    }

    @Test
    public void TestOffline(){
        getInitialScreen()
                .pressDoneToSideBar()
                .pressOffline();
    }

    @Test
    public void TestSettings(){
        getInitialScreen()
                .pressDoneToSideBar()
                .pressSettings();
    }

    @Test
    public void TestHelp(){
        getInitialScreen()
                .pressDoneToSideBar()
                .pressHelp();
    }

}
