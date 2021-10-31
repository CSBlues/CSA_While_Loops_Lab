public class Task {
    public static void extractDigits(int num){
        while (num != 0){
            System.out.println(num % 10);
            num /= 10;
        }
    }
}