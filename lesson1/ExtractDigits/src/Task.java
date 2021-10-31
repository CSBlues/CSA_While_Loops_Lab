public class Task {
    public static void main(String[] args) {
        // Manually test your code here.

    }
    public static void extractDigits(int num){
        while (num != 0){
            System.out.println(num % 10);
            num /= 10;
        }
    }
}