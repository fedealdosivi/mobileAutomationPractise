package mobile;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidBy;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.By;


public class TranslateHome extends TranslatePage {

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

    public TranslateHome(){

    }

    public TranslateHome pressDone(){
        click(okeyPopUpBtn);
        return this;
    }

    public TranslateForm inputTextToTranslate(){
        click(textTranslate);
        return new TranslateForm();
    }

    public TranslateHome pressHome() {
        click(home);
        return this;
    }

    public TranslateTour pressTakeTour(){
        click(takeTour);
        return new TranslateTour();
    }

    public TranslateSelectLanguage clickPicker2(){
        click(languagePicker2);
        return new TranslateSelectLanguage();
    }

    public String verifyTourIsNotShown() {
        try {
        if(takeTour.getText()!=null){
            return "Its here";
        }else {
            return "Not shown";
        }
        }catch (Exception e){
            return "Not shown";
        }
    }
}
