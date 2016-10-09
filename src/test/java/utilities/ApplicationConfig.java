package utilities;

import java.io.File;

import org.apache.commons.configuration2.Configuration;
import org.apache.commons.configuration2.builder.fluent.Configurations;
import org.apache.commons.configuration2.ex.ConfigurationException;

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
      Configurations configs = new Configurations();
      Configuration config = configs.properties("config" + File.separator + "qa.properties");

      this.browser = config.getString("browser");
      this.urlBase = config.getString("urlBase");
      this.timeout = config.getInt("timeout");
    } catch (ConfigurationException e) {
      e.printStackTrace();
    }
  }
}
