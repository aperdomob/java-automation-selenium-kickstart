package example.pages;

import example.entities.Seat;
import example.pages.locators.SelectSeatLocator;
import utilities.PageObjectBase;

public class SelectSeatPage extends PageObjectBase<SelectSeatLocator>{
  
  public ConfirmationPage selectSeat(Seat[] seats) {
    for (Seat seat : seats) {
      this.map.getSeat(seat.getRow(), seat.getColumn()).click();
    }
    
    this.map.getContinueButton().click();
    
    return new ConfirmationPage();
  }
}
