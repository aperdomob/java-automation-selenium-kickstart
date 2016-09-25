package example.pages;

import example.pages.locators.MainLocator;
import utilities.PageObjectBase;

public class MainPage extends PageObjectBase<MainLocator>{

  public ScheduleMoviePage goToMovie(String movieName) {
    this.map.getSearchField().sendKeys(movieName);
    this.map.getSearchButton();
    this.map.getFirstFilm().click();
    
    return new ScheduleMoviePage();
  }
}
