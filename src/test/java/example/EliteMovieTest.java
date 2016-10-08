package example;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import example.entities.Seat;
import example.pages.MainPage;
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
    
    String message = eliteMoviePage
      .goToMovie("violinista")
      .reserve("2020-03-02 20:00", seats.length)
      .selectSeat(seats)
      .getConfirmationMessage();
    
    assertThat(message, is("Las sillas Fila:1-Columna:8 y Fila:1-Columna:9 han sido asignadas correctamente!"));
  }
}
