package webdriver.mobile;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.HasCapabilities;
import org.openqa.selenium.remote.DesiredCapabilities;

public enum OperSyst implements HasCapabilities {

    ANDROID {
        @Override
        public Capabilities getCapabilities() {
            DesiredCapabilities capabilities = DesiredCapabilities.android();

            capabilities.setCapability("deviceName", "emulator-5554");
            capabilities.setCapability("platformName", "Android");

            return capabilities;
        }
    }
}
