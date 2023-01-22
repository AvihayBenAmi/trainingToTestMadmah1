import java.util.Scanner;

public class Loops1x2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = 0;
        int y = 0;
        do {
            System.out.println("Enter X Number smaller than Y");
            x = scanner.nextInt();
            System.out.println("Enet Y number bigger than X");
            y = scanner.nextInt();
        }
        while (x > y);
        for (int i = x; i <= y; i++) {
            System.out.println(i);
        }
    }
}
