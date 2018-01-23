package mobile;

import org.junit.Test;
import org.openqa.selenium.remote.DesiredCapabilities;

import static net.bytebuddy.matcher.ElementMatchers.is;
import static org.junit.Assert.assertEquals;

public class TestTranslate extends MobileTest<translateHome> {
    @Override
    protected translateHome getInitialPage() {
        return new translateHome();
    }

    @Override
    protected void setCapabilities(DesiredCapabilities desiredCapabilities) {
        desiredCapabilities.setCapability("platformName", "android");
        desiredCapabilities.setCapability("deviceName", "emulator-5554");
        desiredCapabilities.setCapability("appPackage","com.google.android.apps.translate");
        desiredCapabilities.setCapability("appActivity", "com.google.android.apps.translate.TranslateActivity");
    }

    @Test
    public void TestTranslate(){
        String result=getInitialPage()
                .pressOkey()
                .inputTextToTranslate()
                .setTextToTranslate("hi")
                .getResult();

        assertEquals(result,"hola");

    }



}
