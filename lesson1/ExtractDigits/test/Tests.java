import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
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
  public void testExtractDigits() {
    Task.extractDigits(3478);
    Assert.assertEquals("FAILED: Your extractDigits function did not work properly for the call, extractDigits(3478).", "8\n7\n4\n3\n", outContent.toString());
//    Task.extractDigits(1);
//    Assert.assertEquals("1\n", outContent.toString());
      }
  @Test
  public void testExtractDigits2() {
    Task.extractDigits(1);
    Assert.assertEquals("FAILED: Your extractDigits function did not work properly for the call, extractDigits(1).","1\n", outContent.toString());
  }
  @Test
  public void testExtractDigits3() {
    Task.extractDigits(12340);
    Assert.assertEquals("FAILED: Your extractDigits function did not work properly for the call, extractDigits(12340).","0\n4\n3\n2\n1\n", outContent.toString());
  }
}