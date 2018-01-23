package mobile;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

import java.util.Arrays;

import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOfAllElements;

public class translateHome extends translatePage {

    @AndroidFindBy(id = ANDROID_PREFIX + "onboarding_checkbox_description")
    private MobileElement okeyPopUpBtn;

    @AndroidFindBy(id = ANDROID_PREFIX + "online_state_bg")
    private MobileElement textTranslate;

    public translateHome(){
        waitFor(visibilityOfAllElements(Arrays.asList(okeyPopUpBtn, textTranslate)));
    }

    public translateHome pressOkey(){
        click(okeyPopUpBtn);
        return this;
    }

    public MobileElement getTextTranslate() {
        return textTranslate;
    }

    public void setTextTranslate(MobileElement textTranslate) {
        this.textTranslate = textTranslate;
    }

    public translateForm inputTextToTranslate(){
        click(textTranslate);
        return new translateForm();
    }
}
