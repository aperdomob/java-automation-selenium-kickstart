package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.github.bonigarcia.wdm.ChromeDriverManager;
import io.github.bonigarcia.wdm.InternetExplorerDriverManager;

public class BrowserFactory {
  
  public static WebDriver getBrowser(String browserType) {
    
    WebDriver driver;
    
    switch(browserType) {    
      case "firefox":
        driver = new FirefoxDriver();
        break;
      
      case "chrome":
        ChromeDriverManager.getInstance().setup();
        driver = new ChromeDriver();
        break;
        
      case "iexplorer":
        InternetExplorerDriverManager.getInstance().setup();
        driver = new InternetExplorerDriver();
        break;
      
     default:
        driver = null;
    };
    
    return driver;
  }

}
