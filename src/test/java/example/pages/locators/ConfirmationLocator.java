package example.pages.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utilities.LocatorBase;

public class ConfirmationLocator extends LocatorBase {

  public WebElement getConfimationLabel() {
    return this.driver.findElement(By.cssSelector(".alert"));
  }  
}
