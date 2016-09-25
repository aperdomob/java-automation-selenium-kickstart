package example.pages.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utilities.LocatorBase;

public class SelectSeatLocator extends LocatorBase {

  public WebElement getSeat(int row, int column) {
    return this.driver.findElement(By.cssSelector("label[for=\"" + row + "," + column + "\"]"));
  }
  
  public WebElement getContinueButton() {
    return this.driver.findElement(By.cssSelector("button.bth:nth-child(2)"));
  }
}
