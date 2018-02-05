package mobile;

import org.junit.Test;
import org.openqa.selenium.remote.DesiredCapabilities;
import webdriver.mobile.MobileTest;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class TestTranslate extends MobileTest<TranslateHome> {
    @Override
    protected TranslateHome getInitialScreen() {
        return new TranslateHome();
    }

    @Override
    protected void setCapabilities(DesiredCapabilities desiredCapabilities) {
        desiredCapabilities.setCapability("appPackage","com.google.android.apps.translate");
        desiredCapabilities.setCapability("appActivity", "com.google.android.apps.translate.TranslateActivity");
    }

    @Test
    public void TestTranslate(){
        String result=getInitialScreen()
                .pressDone()
                .pressHome()
                .inputTextToTranslate()
                .setTextToTranslate("hi")
                .getResult();

        assertEquals(result,"Hola");
    }

    @Test
    public void TestTakeTour(){
        String result=getInitialScreen()
                   .pressDone()
                   .pressHome()
                   .pressTakeTour()
                   .pressLater()
                   .verifyTourIsNotShown();
        assertEquals(result,"Not shown");
    }


}
