package utilities;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

import org.apache.commons.configuration.CompositeConfiguration;
import org.apache.commons.configuration.ConfigurationException;
import org.apache.commons.configuration.PropertiesConfiguration;
import org.apache.commons.configuration.SystemConfiguration;

public class ApplicationConfig {

  private String browser;
  private String urlBase;
  private int timeout;
  
  public String getBrowser() {
    return browser;
  }

  public String getUrlBase() {
    return urlBase;
  }

  public int getTimeout() {
    return timeout;
  }

  public ApplicationConfig() {
    this.loadConfig();
  }
  
  private void loadConfig() {
    try {
      CompositeConfiguration config = new CompositeConfiguration();
      config.addConfiguration(new SystemConfiguration());
      config.addConfiguration(new PropertiesConfiguration("config" + File.separator + "qa.properties"));
      
      this.browser = config.getString("browser");
      this.urlBase = config.getString("urlBase");
      this.timeout = config.getInt("timeout");

    } catch (ConfigurationException e) {
      e.printStackTrace();
    }    
  }
}
