import java.util.Scanner;

public class Loops1x13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;
        System.out.println("enter number");
        num = scanner.nextInt();
        for (int i = 1; i <= num; i++) {
            System.out.println("\t");
            for (int j = 1; j <= num; j++) {
                System.out.print(i * j + " \t");
            }
        }
    }
}
