package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LocatorBase {

  protected final WebDriver driver;
  protected final WebDriverWait wait;
  
  public LocatorBase() {
    this.driver = Browser.getInstance().getDriver();
    this.wait = Browser.getInstance().getWait();
  }
}
