package mobile;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

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

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView")
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
        for (MobileElement langaugeToSelect : languages) {
            langaugeToSelect.getText().equals(language);
            click(langaugeToSelect);
        }

        return this;
    }

    public TranslateSetUp selectSecondLanguage(String language){
        click(secondLanguage);
        return this;
    }
}
