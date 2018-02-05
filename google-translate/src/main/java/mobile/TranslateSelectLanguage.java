package mobile;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

import java.util.List;

public class TranslateSelectLanguage extends TranslatePage {

    @AndroidFindBy (id = "list")
    private List<MobileElement> listLanguages;
}
