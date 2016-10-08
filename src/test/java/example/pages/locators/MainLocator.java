package example.pages.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utilities.LocatorBase;

public class MainLocator extends LocatorBase {

  public WebElement getSearchField() {
    return this.driver.findElement(By.className("searchfield"));
  }
  
  public WebElement getSearchButton() {
    return this.driver.findElement(By.className("searchbtn"));
  }
  
  public WebElement getFirstFilm() {
    return this.driver.findElement(By.cssSelector("a.ng-scope:nth-child(1)"));
  }
}
