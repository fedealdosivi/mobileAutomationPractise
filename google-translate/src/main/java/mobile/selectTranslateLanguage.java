package mobile;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

import java.util.List;

public class selectTranslateLanguage extends translatePage{

    @AndroidFindBy (id = "list")
    private List<MobileElement> listLanguages;
}
