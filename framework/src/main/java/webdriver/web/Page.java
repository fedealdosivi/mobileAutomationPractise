package webdriver.web;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import webdriver.CommonOperations;

public abstract class Page extends CommonOperations {

    protected Page() {
        PageFactory.initElements(getDriver(), this);
    }

}