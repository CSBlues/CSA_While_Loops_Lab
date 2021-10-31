
public class Task {
    public static void main(String[] args) {
        // Manually test your code here.
        sumOdds(5);
    }
  public static void sumOdds(int userInput) {
      int counter = 0;
      int sum = 0;
      while (counter <= userInput){
            if (counter % 2 == 1){
                sum += counter;
            }
            counter++;
      }
      System.out.println(sum);
  }

}