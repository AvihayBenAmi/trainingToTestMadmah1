import java.util.Scanner;

public class Loops1x6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1;
        int num2;
        int pow;
        System.out.println("Enter number 1");
        num1 = scanner.nextInt();
        System.out.println("Enter number 2");
        num2 = scanner.nextInt();
        if (num2 == 0) {
            num1 = 1;
        }
        if (num2 == 1) {
            num1 = num1;
        }
        pow = num1;
        for (int i = 2; i <= num2; i++) {
            pow *= num1;
        }
        System.out.println(pow);
    }
}
