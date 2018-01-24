package webdriver.mobile;

import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;
import webdriver.CommonOperations;

public class Screen extends CommonOperations {

    protected Screen() {
        PageFactory.initElements(new AppiumFieldDecorator(getDriver()), this);
    }

}
