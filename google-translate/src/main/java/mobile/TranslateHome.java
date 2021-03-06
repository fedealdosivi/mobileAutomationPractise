package mobile;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidBy;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.By;


public class TranslateHome extends TranslatePage {

    @AndroidFindBy(id = ANDROID_PREFIX + "online_state_bg")
    private MobileElement textTranslate;

    @AndroidFindBy(id = ANDROID_PREFIX+ "picker2")
    private MobileElement languagePicker2;

    @AndroidFindBy(id= ANDROID_PREFIX+"img_card_txt_bottom1")
    private MobileElement takeTour;

    @AndroidFindBy(id = ANDROID_PREFIX + "btn_star")
    private MobileElement star;

    public TranslateHome(){

    }

    public TranslateForm inputTextToTranslate(){
        click(textTranslate);
        return new TranslateForm();
    }

    public TranslateTour pressTakeTour(){
        click(takeTour);
        return new TranslateTour();
    }

    public TranslateSelectLanguage clickPicker2(){
        click(languagePicker2);
        return new TranslateSelectLanguage();
    }

    public TranslateHome pressTouch(int x, int y){
        touch(x,y);
        return this;
    }

    public TranslateSideBar pressTouchSideBar(){
        touch(0,43);
        return new TranslateSideBar();
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

    public TranslateHome addToPhrasebook(){
        click(star);
        return this;
    }
}
