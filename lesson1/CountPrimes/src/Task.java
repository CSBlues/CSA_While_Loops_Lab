public class Task {
    public static void main(String[] args) {
        // Manually test your code here.

    }

  public static int countFactors(int val){
      int n = 1;
      int count = 0;
      while (n <= val){
          if (val % n == 0){
              count++;
          }
          n++;
      }
      return count;
  }

  public static boolean isPrime(int value){
      return (countFactors(value) <= 2);
  }

  public static int countPrimes(int n){
      int current = 2;
      int count = 0;
      while (current <= n){
          if (isPrime(current)){
              count++;
          }
          current++;
      }
      return count;
  }

}