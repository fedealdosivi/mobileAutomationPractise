package mobile;

import org.junit.Test;
import org.openqa.selenium.remote.DesiredCapabilities;

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
        
    }



}
