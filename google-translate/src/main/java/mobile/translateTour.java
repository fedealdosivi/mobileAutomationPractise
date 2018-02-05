package mobile;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

import java.util.Arrays;

import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOfAllElements;

public class translateTour extends translatePage{

    @AndroidFindBy (id = "copydrop_welcome_turn_on_btn")
    private MobileElement btnTurnOn;

    public translateTour(){
        waitFor(visibilityOfAllElements(Arrays.asList(btnTurnOn)));
    }

    public translateHome pressLater(){
        click(btnTurnOn);
        return new translateHome();
    }
}
