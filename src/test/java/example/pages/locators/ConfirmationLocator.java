package example.pages.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import utilities.LocatorBase;

public class ConfirmationLocator extends LocatorBase {

  public WebElement getConfimationLabel() {
    By selector = By.cssSelector(".alert");
    this.wait.until(ExpectedConditions.visibilityOfElementLocated(selector));
    return this.driver.findElement(selector);
  }  
}
