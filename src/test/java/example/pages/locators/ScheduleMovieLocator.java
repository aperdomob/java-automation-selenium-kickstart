package example.pages.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import utilities.LocatorBase;

public class ScheduleMovieLocator extends LocatorBase {

  public Select getShowTimeOption() {
    return new Select(this.driver.findElement(By.id("showTime")));
  }
  
  public Select getSeatsItems() {
    return new Select(driver.findElement(By.name("seats")));
  }
  
  public WebElement getContinueButton() {
    return this.driver.findElement(By.cssSelector("input.btn"));
  }
}
