import java.util.Scanner;

public class Loops1x3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int num = 0;
        System.out.println("Enter number");
        num = scanner.nextInt();
        for (int i = 1; i <= num; i++) {
            sum += i;
        }
        System.out.println("The summery of the naural number until you enterd number is = " + sum);

    }
}
