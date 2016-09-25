package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Browser {

	private static final Object lock = new Object();
	private static volatile Browser instance;
	
	private WebDriver driver;
	private WebDriverWait wait;
	
	private Browser() {
		this.driver = new FirefoxDriver();
		this.wait = new WebDriverWait(this.driver, 30);
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
	  this.driver.get("https://elite-movie-psl.herokuapp.com");
	}
	
	public void close() {
	  this.driver.close();
	  instance = null;
	}
}
