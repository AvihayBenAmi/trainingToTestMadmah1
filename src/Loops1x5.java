import java.util.Scanner;

public class Loops1x5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;
        int sum=0;
        do {
            System.out.println("Enter Number");
            num = scanner.nextInt();
        }
        while (num < 0);
        for (int i = 0; i <= num; i++) {
            sum += i;
        }
        System.out.println("The summery is " + sum);

    }
}
