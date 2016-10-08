package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Browser {

	private static final Object lock = new Object();
	private static volatile Browser instance;
	
	private WebDriver driver;
	private WebDriverWait wait;
	private ApplicationConfig configuration;
	
	private Browser() {
	  this.configuration = new ApplicationConfig();
	  
		this.driver = BrowserFactory.getBrowser(this.configuration.getBrowser());
		this.wait = new WebDriverWait(this.driver, this.configuration.getTimeout());
	}
	
	public static Browser getInstance() {
		if (instance == null) {
			synchronized (lock) {
				if (instance == null){
					instance = new Browser();
				}
			}
		}
		
		return instance;
	}
	
	public WebDriverWait getWait() {
	  return this.wait;
	}
	
	public WebDriver getDriver() {
	  return this.driver;
	}
	
	public void start() {
	  this.driver.get(configuration.getUrlBase());
	}
	
	public void close() {
	  this.driver.close();
	  instance = null;
	}
}
