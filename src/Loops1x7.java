import java.util.Scanner;

public class Loops1x7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;
        int posSum = 0;
        int negSum = 0;
        do {
            System.out.println("Enter Number");
            num = scanner.nextInt();
            if (num > 0) {
                posSum += num;
            } else {
                negSum += num;
            }
        }
        while (num != 0);
        System.out.println("The summery of positive numbers is " + posSum);
        System.out.println("The summery of negative numbers is " + negSum);
    }
}
