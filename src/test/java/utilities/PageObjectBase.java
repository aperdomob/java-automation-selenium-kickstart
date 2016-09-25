package utilities;

import java.lang.reflect.ParameterizedType;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PageObjectBase<T extends LocatorBase> {
  
  protected final WebDriver driver;
  protected final WebDriverWait wait;
  protected final T map;

  public PageObjectBase() {
    this.driver = Browser.getInstance().getDriver();
    this.wait = Browser.getInstance().getWait();
    this.map = getInstance();
  }
  
  @SuppressWarnings("unchecked")
  private T getInstance() {
    try {
      ParameterizedType superClass =  (ParameterizedType) this.getClass().getGenericSuperclass();
      Class<T> classBase = (Class<T>) superClass.getActualTypeArguments()[0];
      
      return classBase.newInstance();
      
    } catch (InstantiationException | IllegalAccessException e) {
      return null;
    }
  }
}
