package mobile;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class TranslateSetUp extends TranslatePage{

    @AndroidFindBy(id = ANDROID_PREFIX + "button_done")
    private MobileElement okeyPopUpBtn;

    @AndroidFindBy(id = "onboarding_checkbox")
    private MobileElement checkOffline;

    @AndroidFindBy(id = "primary_lang_spinner")
    private MobileElement firstLanguage;

    @AndroidFindBy(id = "translation_lang_spinner")
    private MobileElement secondLanguage;


    public TranslateSetUp(){

    }

    public TranslateSideBar pressDone(){
        click(okeyPopUpBtn);
        return new TranslateSideBar();
    }

    public TranslateSetUp pressTranslateOffline(){
        click(checkOffline);
        return this;
    }

    public TranslateSetUpLanguageSelect selectFirstLanguage(String language){
        click(firstLanguage);
        return new TranslateSetUpLanguageSelect(language);
    }

    public TranslateSetUpLanguageSelect selectSecondLanguage(String language){
        click(secondLanguage);
        return new TranslateSetUpLanguageSelect(language);
    }

    public TranslateSetUp scrollToTheTopOfSelectLanguage(){
        return this;
    }
}
