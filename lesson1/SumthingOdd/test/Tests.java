import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;


public class Tests {
  private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
  private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();
  private final PrintStream originalOut = System.out;
  private final PrintStream originalErr = System.err;


  @Before
  public void setUpStreams() {
    System.setOut(new PrintStream(outContent));
    System.setErr(new PrintStream(errContent));

  }

  @After
  public void restoreStreams() {
    System.setOut(originalOut);
    System.setErr(originalErr);
  }
  @Test
  public void testSumOdds5() {
    Task.sumOdds(5);
    Assert.assertEquals("FAILED: Your sumOdds() function did not work properly for the call, sumOdds(5).", "9\n", outContent.toString());
  }
  @Test
  public void testSumOdds6() {
    Task.sumOdds(6);
    Assert.assertEquals("FAILED: Your sumOdds() function did not work properly for the call, sumOdds(6).", "9\n", outContent.toString());
  }
  @Test
  public void testSumOdds100() {
    Task.sumOdds(100);
    Assert.assertEquals("FAILED: Your sumOdds() function did not work properly for the call, sumOdds(5).", "2500\n", outContent.toString());
  }
}