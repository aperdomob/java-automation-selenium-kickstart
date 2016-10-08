package example.pages;

import example.pages.locators.ScheduleMovieLocator;
import utilities.PageObjectBase;

public class ScheduleMoviePage extends PageObjectBase<ScheduleMovieLocator>{

  public SelectSeatPage reserve(String showTime, int seats) {
    this.map.getShowTimeOption().selectByVisibleText(showTime);
    this.map.getSeatsItems().selectByValue(String.valueOf(seats));
    this.map.getContinueButton().click();
    
    return new SelectSeatPage();
  }
}
