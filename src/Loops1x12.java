import java.util.Scanner;

public class Loops1x12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;
        do {
            System.out.println("Enter number between 1-10");
            num = scanner.nextInt();
        }
        while ((num > 10) || (num < 1));
        for (int i = 0; i <= 100; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.print(num * j + ", ");
            }
            System.out.println();
        }
    }
}
