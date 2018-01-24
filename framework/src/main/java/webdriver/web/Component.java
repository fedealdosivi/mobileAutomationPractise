package webdriver.web;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.DefaultElementLocatorFactory;
import org.openqa.selenium.support.pagefactory.DefaultFieldDecorator;
import webdriver.CommonOperations;

public abstract class Component extends CommonOperations {

  protected Component(WebElement container) {
    PageFactory.initElements(new DefaultFieldDecorator(new DefaultElementLocatorFactory(container)), this);
  }

}
