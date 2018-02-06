package webdriver;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public enum Context {

    INSTANCE;

    private static final ThreadLocal<WebDriver> DRIVERS_PER_THREAD = new ThreadLocal<>();

    public WebDriver getDriver() {
        return DRIVERS_PER_THREAD.get();
    }

    public WebDriver init(Capabilities capabilities) throws MalformedURLException {

        URL url = new URL(System.getProperty("APPIUM_URL", "http://127.0.0.1:4723/wd/hub"));

        return init(url, capabilities);
    }

    public WebDriver init(URL url, Capabilities capabilities) {

        terminate();

        WebDriver driver = new AppiumDriver<>(url, capabilities);

        DRIVERS_PER_THREAD.set(driver);

        return driver;
    }

    public void terminate() {
        WebDriver driver = getDriver();
        if (driver != null) {
            getDriver().quit();
        }
        DRIVERS_PER_THREAD.remove();

    }
}