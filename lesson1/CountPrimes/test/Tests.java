import org.junit.Assert;
import org.junit.Test;

public class Tests {
  @Test
  public void testCountFactors() {
    Assert.assertEquals("FAILED: Your countFactors did not return the correct value for the call: countFactors(24).",8, Task.countFactors(24));
  }
  @Test
  public void testCountFactors2() {
    Assert.assertEquals("FAILED: Your countFactors did not return the correct value for the call: countFactors(1).",2, Task.countFactors(7));
  }
  @Test
  public void testIsPrime1() {
    boolean result = Task.isPrime(27);
    Assert.assertFalse("FAILED: Your isPrime did not return the correct value for the call: isPrime(27). Expected: false actual: " + result, result);
  }
  @Test
  public void testIsPrime2() {
    boolean result = Task.isPrime(47);
    Assert.assertTrue("FAILED: Your isPrime did not return the correct value for the call: isPrime(47). Expected: true actual: " + result, result);
  }

  @Test
  public void testCountPrimes() {
    int result = Task.countPrimes(24);
    Assert.assertEquals("FAILED: Your countPrimes did not return the correct value for the call: countPrimes(24).",9, result);
  }

}