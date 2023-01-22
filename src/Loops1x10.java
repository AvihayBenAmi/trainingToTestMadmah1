import java.util.Scanner;

public class Loops1x10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;
        int firstDigit = 0;
        System.out.println("Enter Number");
        num = scanner.nextInt();
        while (num != 0) {
            firstDigit = num % 10;
            num = num / 10;
        }
        System.out.println(firstDigit);
    }
}
