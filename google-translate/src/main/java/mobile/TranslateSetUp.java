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

    @AndroidFindBy(className = "android.widget.TextView[2]")
    private MobileElement secondLanguage;

    @AndroidFindBy(className = "android.widget.CheckedTextView")
    private List<MobileElement> languages;

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

    public TranslateSetUp selectFirstLanguage(String language){
        click(firstLanguage);
        for (MobileElement languageToSelect : languages) {
            if(languageToSelect.getText().equals(language)){
                click(languageToSelect);
            }
        }

        return this;
    }

    public TranslateSetUp selectSecondLanguage(String language){
        click(secondLanguage);
        for (MobileElement languageToSelect:languages){
            if(languageToSelect.getText().equals(language)) {
                click(languageToSelect);
            }
        }
        return this;
    }

    public TranslateSetUp scrollToTheTopOfSelectLanguage(){
        return this;
    }
}
