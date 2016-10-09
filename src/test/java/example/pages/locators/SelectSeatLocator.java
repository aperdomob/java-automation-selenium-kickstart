package example.pages.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import utilities.LocatorBase;

public class SelectSeatLocator extends LocatorBase {

  public WebElement getSeat(int row, int column) {
    By locator = By.cssSelector("label[for=\"" + row + "," + column + "\"]");
    this.wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    return this.driver.findElement(locator);
  }
  
  public WebElement getContinueButton() {
    return this.driver.findElement(By.cssSelector("button.btn:nth-child(2)"));
  }
}
