package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BrowserFactory {
  
  public static WebDriver getBrowser(String browserType) {
    
    WebDriver driver;
    
    switch(browserType) {    
      case "firefox":
        driver = new FirefoxDriver();
        break;
      
      case "chrome":
        driver = new ChromeDriver();
        break;
        
      case "iexplorer":
        driver = new InternetExplorerDriver();
        break;
      
     default:
        driver = null;
    };
    
    return driver;
  }

}
