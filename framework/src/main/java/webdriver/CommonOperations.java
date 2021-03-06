package webdriver;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.html5.Location;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

import static java.util.concurrent.TimeUnit.SECONDS;
import static org.openqa.selenium.support.ui.ExpectedConditions.elementToBeClickable;
import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOf;

public abstract class CommonOperations {

    protected AppiumDriver getDriver() {
        return Context.INSTANCE.getDriver();
    }

    protected CommonOperations selectByText(MobileElement element, String text) {
        waitFor(visibilityOf(element));
        new Select(element).selectByVisibleText(text);
        return this;
    }

    protected CommonOperations sendKeys(MobileElement element, String text) {
        waitFor(visibilityOf(element));
        element.sendKeys(text);
        return this;
    }

    protected CommonOperations selectByValue(MobileElement element, String value) {
        waitFor(visibilityOf(element));
        new Select(element).selectByValue(value);
        return this;
    }

    protected CommonOperations selectByIndex(MobileElement element, int index) {
        waitFor(visibilityOf(element));
        new Select(element).selectByIndex(index);
        return this;
    }

    protected CommonOperations type(MobileElement element, String text) {
        waitFor(visibilityOf(element));
        element.sendKeys(text);
        return this;
    }

    protected void click(MobileElement element) {
        waitFor(elementToBeClickable(element));
        element.click();
    }

    protected String getText(MobileElement element) {
        waitFor(visibilityOf(element));
        return element.getText();
    }

    protected CommonOperations touch(int x, int y){
        try {
            TouchAction touch = new TouchAction(this.getDriver());
            touch.tap(x,y).perform().release();
        }catch (Exception e){
            e.printStackTrace();
        }
        return this;
    }

    protected CommonOperations scroll(MobileElement element,int x,int y){
        try {
            TouchAction touchAction=new TouchAction(getDriver());
            touchAction.press(element).waitAction(Duration.ofMillis(5000)).moveTo(element,x,-y).release().perform();
        }catch (Exception e){
            e.printStackTrace();
        }
        return this;
    }

    protected <T> void waitFor(ExpectedCondition<T> condition) {
        new FluentWait<>(getDriver())
                .withTimeout(60, SECONDS)
                .pollingEvery(1, SECONDS)
                .ignoring(NoSuchElementException.class)
                .ignoring(StaleElementReferenceException.class)
                .until(condition);
    }

}
