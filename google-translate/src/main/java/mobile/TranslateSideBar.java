package mobile;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

import java.util.Arrays;

import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOfAllElements;

public class TranslateSideBar extends TranslatePage{

    @AndroidFindBy(id = ANDROID_PREFIX +"design_menu_item_text")
    private MobileElement home;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.FrameLayout[2]/android.support.v7.widget.RecyclerView/android.support.v7.widget.LinearLayoutCompat[2]/android.widget.CheckedTextView")
    private MobileElement phrasebook;

    @AndroidFindBy(xpath = "\t/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.FrameLayout[2]/android.support.v7.widget.RecyclerView/android.support.v7.widget.LinearLayoutCompat[3]/android.widget.CheckedTextView")
    private MobileElement smsTranslation;

    @AndroidFindBy(xpath = "\t/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.FrameLayout[2]/android.support.v7.widget.RecyclerView/android.support.v7.widget.LinearLayoutCompat[4]/android.widget.CheckedTextView")
    private MobileElement offlineTranslation;

    @AndroidFindBy(xpath = "\t/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.FrameLayout[2]/android.support.v7.widget.RecyclerView/android.support.v7.widget.LinearLayoutCompat[5]/android.widget.CheckedTextView")
    private MobileElement settings;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.FrameLayout[2]/android.support.v7.widget.RecyclerView/android.support.v7.widget.LinearLayoutCompat[6]/android.widget.CheckedTextView")
    private MobileElement helpFeedback;

    public TranslateSideBar(){

    }

    public TranslateHome pressHome(){
        click(home);
        return new TranslateHome();
    }

    public void pressPhrasebook(){
        click(phrasebook);
    }

    public void pressSMS(){
        click(smsTranslation);
    }

    public void pressOffline(){
        click(offlineTranslation);
    }

    public void pressSettings(){
        click(settings);
    }

    public void pressHelp(){
        click(helpFeedback);
    }



}
