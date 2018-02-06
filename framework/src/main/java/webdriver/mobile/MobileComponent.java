package webdriver.mobile;

import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import webdriver.CommonOperations;

public class MobileComponent extends CommonOperations {

    public MobileComponent(WebElement container) {
        PageFactory.initElements(new AppiumFieldDecorator(container), this);
    }
}