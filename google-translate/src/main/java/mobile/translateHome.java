package mobile;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

import java.util.Arrays;

import static org.openqa.selenium.support.ui.ExpectedConditions.invisibilityOf;
import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOfAllElements;

public class translateHome extends translatePage {

    @AndroidFindBy(id = ANDROID_PREFIX + "button_done")
    private MobileElement okeyPopUpBtn;

    @AndroidFindBy(id = ANDROID_PREFIX + "online_state_bg")
    private MobileElement textTranslate;

    @AndroidFindBy(id= ANDROID_PREFIX + "design_menu_item_text")
    private MobileElement home;

    @AndroidFindBy(id = ANDROID_PREFIX+ "picker2")
    private MobileElement languagePicker2;

    @AndroidFindBy(id= ANDROID_PREFIX+"img_card_txt_bottom1")
    private MobileElement takeTour;

    public translateHome(){

    }

    public translateHome pressDone(){
        click(okeyPopUpBtn);
        return this;
    }

    public translateForm inputTextToTranslate(){
        click(textTranslate);
        return new translateForm();
    }

    public translateHome pressHome() {
        click(home);
        return this;
    }

    public translateTour pressTakeTour(){
        click(takeTour);
        return new translateTour();
    }

    public selectTranslateLanguage clickPicker2(){
        click(languagePicker2);
        return new selectTranslateLanguage();
    }

    public boolean verifyTourIsNotShown() {
        return takeTour.isDisplayed();
    }
}
