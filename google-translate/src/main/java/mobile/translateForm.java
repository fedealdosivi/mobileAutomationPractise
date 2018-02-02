package mobile;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

import java.util.Arrays;

import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOfAllElements;

public class translateForm extends translatePage {

    @AndroidFindBy(id = ANDROID_PREFIX + "edit_input")
    private MobileElement textToTranslate;

    @AndroidFindBy(id = ANDROID_PREFIX + "result_text")
    private MobileElement textTranslated;

    @AndroidFindBy(id = ANDROID_PREFIX + "result_selector")
    private MobileElement resultSelector;

    public translateForm(){
        waitFor(visibilityOfAllElements(Arrays.asList(textToTranslate)));
    }

    public translateForm setTextToTranslate(String text){
        type(textToTranslate,text);
        return this;
    }

    public String getResult(){
        return getText(textTranslated);
    }
}
