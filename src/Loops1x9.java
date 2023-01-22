import java.util.Scanner;

public class Loops1x9 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        long num;
        System.out.println("Enter a number");
        num=scanner.nextInt();
        num=num%10;
        System.out.println(num);

    }
}
