package mobile;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

import java.util.Arrays;

import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOfAllElements;

public class translateTour extends translatePage{

    @AndroidFindBy (id = "drop_welcome_dismiss_btn")
    private MobileElement btnLater;

    public translateTour(){
        waitFor(visibilityOfAllElements(Arrays.asList(btnLater)));
    }

    public void pressLater(){
        click(btnLater);
    }
}
