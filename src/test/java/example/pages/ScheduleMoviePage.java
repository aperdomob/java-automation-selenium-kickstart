package example.pages;

import example.pages.locators.ScheduleMovieLocator;
import utilities.PageObjectBase;

public class ScheduleMoviePage extends PageObjectBase<ScheduleMovieLocator>{

  public void reserve(String showTime, int seats) {
    this.map.getShowTimeOption().selectByVisibleText(showTime);
    this.map.getSeatsItems().deselectByValue(String.valueOf(seats));
    this.map.getContinueButton().click();
  }
}
