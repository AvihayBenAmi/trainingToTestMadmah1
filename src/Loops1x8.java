import java.util.Scanner;

public class Loops1x8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;
        boolean answer = true;
        System.out.println("Please enter number bigger than 1");
        num = scanner.nextInt();
        if (num > 1) {
            for (int i = 2; i <= num / 2; i++) {
                if (num % i == 0) {
                    answer = false;
                    break;
                }
            }
            if (answer) {
                System.out.println("it is Prime number");
            } else {
                System.out.println("it is non prime number");
            }
        } else {
            System.out.println("You enter Wrong insert");
        }
    }
}
