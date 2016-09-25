package example;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import example.entities.Seat;
import example.pages.ConfirmationPage;
import example.pages.MainPage;
import example.pages.ScheduleMoviePage;
import example.pages.SelectSeatPage;
import utilities.Browser;

public class EliteMovieTest {

  @Before
  public void setup() {
     Browser.getInstance().start();
  }
  
  @After
  public void tearDown() {
    Browser.getInstance().close();
  }
  
  @Test
  public void reserveSeats() {
    Seat[] seats = new Seat[2];
    seats[0] = new Seat(1, 8);
    seats[1] = new Seat(1, 9);

    MainPage eliteMoviePage = new MainPage();
    eliteMoviePage.goToMovie("sinsajo");
    
    ScheduleMoviePage scheduleMoviePage = new ScheduleMoviePage();
    scheduleMoviePage.reserve("2020-03-02 20:00", seats.length);
    
    SelectSeatPage selectSeatPage = new SelectSeatPage();
    selectSeatPage.SelectSeat(seats);
    
    ConfirmationPage confirmatonPage  = new ConfirmationPage();
    String message = confirmatonPage.getConfirmationMessage();
    
    assertThat(message, is("Las sillas Fila:1-Columna:8 y Fila:1-Columna:9 han sido asignadas correctamente!"));
  }
}
