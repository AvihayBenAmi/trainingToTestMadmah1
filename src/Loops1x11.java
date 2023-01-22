import java.util.Scanner;

public class Loops1x11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        int counter = 0;
        System.out.println("Enter Number");
        num = scanner.nextInt();
        while (num != 0) {
            counter++;
            num = num / 10;
        }
        System.out.println(counter);
    }
}
