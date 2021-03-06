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

    @AndroidFindBy(className = "android.widget.ListView")
    private  MobileElement allLanguages;

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
    public TranslateSetUp selectLanguageWithScroll(){
        scrollLanguages(allLanguages);
        for (MobileElement languageToSelect : languages) {
            if(languageToSelect.getText().equals(stringLanguage)){
                click(languageToSelect);
                break;
            }
        }
        return new TranslateSetUp();
    }

    public TranslateSetUpLanguageSelect scrollLanguages(MobileElement element) {
        int x = element.getSize().width;
        int y =  element.getSize().height/2;
        scroll(element,x,y);
        return this;
    }
}
