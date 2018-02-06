package mobile;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import webdriver.mobile.MobileComponent;

import java.util.List;

public class TranslateSetUpLanguageSelect extends TranslatePage{

    @AndroidFindBy(className = "android.widget.CheckedTextView")
    private List<MobileElement> languages;

    private String stringLanguage;

    public TranslateSetUpLanguageSelect(String language) {
        stringLanguage = language;
    }

    public TranslateSetUp selectLanguage(){
        for (MobileElement languageToSelect : languages) {
            if(languageToSelect.getText().equals(stringLanguage)){
                click(languageToSelect);
                break;
            }
        }
        return new TranslateSetUp();
    }
}
