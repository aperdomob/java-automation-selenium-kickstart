package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PageObjectBase<T extends LocatorBase> {
  
  protected final WebDriver driver;
  protected final WebDriverWait wait;
  protected final T map;

  public PageObjectBase() {
    this.driver = Browser.getInstance().getDriver();
    this.wait = Browser.getInstance().getWait();
    
    this.map = new T();
  }
}
