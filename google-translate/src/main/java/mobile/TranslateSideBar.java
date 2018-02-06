package mobile;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

import java.util.Arrays;

import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOfAllElements;

public class TranslateSideBar extends TranslatePage{

    @AndroidFindBy(id = ANDROID_PREFIX +"design_menu_item_text")
    private MobileElement home;

    @AndroidFindBy(id = ANDROID_PREFIX +"")
    private MobileElement phrasebook;

    @AndroidFindBy(id = ANDROID_PREFIX +"btn_camera")
    private MobileElement smsTranslation;

    @AndroidFindBy(id = ANDROID_PREFIX +"")
    private MobileElement offlineTranslation;

    @AndroidFindBy(id = ANDROID_PREFIX +"img_card_txt_body")
    private MobileElement settings;

    @AndroidFindBy(id = ANDROID_PREFIX +"img_card_txt_bottom1")
    private MobileElement helpFeedback;

    public TranslateSideBar(){

    }

    public TranslateHome pressHome(){
        click(home);
        return new TranslateHome();
    }

    public void pressPhrasebook(){
        click(phrasebook);
    }

    public void pressSMS(){
        click(smsTranslation);
    }

    public void pressOffline(){
        click(offlineTranslation);
    }

    public void pressSettings(){
        click(settings);
    }

    public void pressHelp(){
        click(helpFeedback);
    }



}
