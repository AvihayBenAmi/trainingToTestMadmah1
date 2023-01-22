import java.util.Scanner;

public class functions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = 11;
        int num2 = 6;
        int num3 = 7;
        System.out.println("the bigger number is ");
        theBiggerNumber(num1, num2, num3);
        System.out.println("the average is " + average(num1, num2, num3));
        System.out.println("is Couple number? " + isCouple(num3));
        System.out.println("is prime number? " + isPrimeNumber(num3));
        System.out.println("is pitagoric trio? " + isPitagoric(num1, num2, num3));
        System.out.println("the sum digits is " + sumDigits(num1));
        seriesMath(num1, num2, num3);
    }

    public static void theBiggerNumber(int num1, int num2, int num3) {
        if ((num1 > num2) && (num1 > num3)) {
            System.out.println(num1);
        } else if ((num2 > num1) && (num2 > num3)) {
            System.out.println(num2);
        } else {
            System.out.println(num3);
        }
    }

    public static float average(int num1, int num2, int num3) {
        float avg = 0;
        avg = (num1 + num2 + num3) / 3;
        return avg;
    }

    public static boolean isCouple(int num1) {
        boolean answer = false;
        if (num1 % 2 == 0) {
            answer = true;
        }
        return answer;
    }

    public static boolean isPrimeNumber(int num1) {
        boolean answer = true;
        if (num1 > 1) {
            for (int i = 2; i <= num1 / 2; i++) {
                if (num1 % i != 0) {
                    answer = false;
                    break;
                }
            }
        }
        return answer;
    }

    public static boolean isPitagoric(int num1, int num2, int num3) {
        boolean answer = false;
        if ((num1 * num1) + (num2 * num2) == (num3 * num3)) {
            answer = true;
        }
        return answer;
    }

    public static int sumDigits(int num1) {
        int sum = 0;
        while (num1 != 0) {
            sum += num1 % 10;
            num1 = num1 / 10;
        }
        return sum;
    }

    public static void seriesMath(int firstDigit, int diff, int numOfPara) {
        int sum = firstDigit;
        for (int i = 1; i <= numOfPara; i++) {
            System.out.print(sum + " ");
            sum += diff;
        }
    }

}