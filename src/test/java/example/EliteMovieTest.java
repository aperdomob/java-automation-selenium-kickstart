package example;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import example.pages.MainPage;
import utilities.Browser;

public class EliteMovieTest {

  @Before
  public void setup() {
    // Browser.getInstance().start();
  }
  
  @After
  public void tearDown() {
    Browser.getInstance().close();
  }
  
  @Test
  public void reserveSeats() {
    MainPage eliteMoviePage = new MainPage();
    eliteMoviePage.goToMovie("sinsajo");
  }
}
