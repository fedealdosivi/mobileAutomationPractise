package mobile;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

import java.util.Arrays;

import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOfAllElements;

public class translateHome extends translatePage {

    @AndroidFindBy(id = ANDROID_PREFIX + "button_done")
    private MobileElement okeyPopUpBtn;

    @AndroidFindBy(id = ANDROID_PREFIX + "online_state_bg")
    private MobileElement textTranslate;

    @AndroidFindBy(id= ANDROID_PREFIX + "design_menu_item_text")
    private MobileElement home;

    public translateHome(){
        waitFor(visibilityOfAllElements(Arrays.asList(okeyPopUpBtn)));
    }

    public translateHome pressDone(){
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

    public translateHome pressHome() {
        click(home);
        return this;
    }
}
