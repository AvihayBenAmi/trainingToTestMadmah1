import java.util.Scanner;

public class Loops1x4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;
        do {
            System.out.println("please enter number");
            num = scanner.nextInt();
        }
        while (num < 0);
        System.out.println("the number is " + num);


    }
}
