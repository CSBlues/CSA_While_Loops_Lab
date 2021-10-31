
public class Task {
  //put your task here
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