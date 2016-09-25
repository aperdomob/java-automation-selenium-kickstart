package example.pages;

import example.pages.locators.ConfirmationLocator;
import utilities.PageObjectBase;

public class ConfirmationPage extends PageObjectBase<ConfirmationLocator>{

  public String getConfirmationMessage() {
    return this.map.getConfimationLabel().getText();
  }
}
