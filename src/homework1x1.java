import java.util.Scanner;

public class homework1x1 {
    public static void main(String[] args) {
        exam7();

    }

    public static void exam1() {
        Scanner scanner = new Scanner(System.in);
        int aParameter = 0;
        int bParameter = 0;
        int cParameter = 0;
        double sqrt = 0;
        double x1 = 0;
        double x2 = 0;
        System.out.println("Enter A parameter for quadreic");
        aParameter = scanner.nextInt();
        System.out.println("Enter B parameter for quadreic");
        bParameter = scanner.nextInt();
        System.out.println("Enter C parameter for quadreic");
        cParameter = scanner.nextInt();
        sqrt = (Math.pow(bParameter, 2)) - 4 * (aParameter * cParameter);
        if (sqrt > 0) {
            x1 = (-bParameter + (Math.sqrt(sqrt))) / (2 * aParameter);
            x2 = (-bParameter - (Math.sqrt(sqrt))) / (2 * aParameter);
            if (x1 == x2) {
                System.out.println("There is one solotion to this quadric: x1=" + x1);
            } else {
                System.out.println("There is tow solotions to this quadric: x1: " + x1 + " x2: " + x2);
            }
        } else {
            System.out.println("There are no solotions to this quadric");
        }
    }

    public static void exam2() {
        Scanner scanner = new Scanner(System.in);
        int first = 0;
        int diff = 0;
        int numbers = 0;
        int temp = 0;
        System.out.println("Enter the first number in series");
        first = scanner.nextInt();
        System.out.println("Enter the difference in series");
        diff = scanner.nextInt();
        do {
            System.out.println("Enter how much numbers in series");
            numbers = scanner.nextInt();
        }
        while (numbers < 0);
        System.out.print(first + ", ");
        temp = first;
        for (int i = 1; i < numbers; i++) {
            temp += diff;
            System.out.print(temp + ", ");
        }
    }

    public static void exam3() {
        Scanner scanner = new Scanner(System.in);
        int number;
        do {
            System.out.println("Enter a positive odd number bigger than 3");
            number = scanner.nextInt();
        }
        while ((number < 3) || (number % 2 == 0));
        for (int i = 1; i < number; i += 2) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = number; i >= 1; i -= 2) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void exam4() {
        Scanner scanner = new Scanner(System.in);
        int number = 0;
        System.out.println("Enter a number");
        number = scanner.nextInt();
        if (number > 0) {
            int countPrints = 0;
            int runNumber = 2;
            do {
                int countDividers = 0;
                for (int i = 1; i <= runNumber / 2; i++) {
                    if (runNumber % i == 0) {
                        countDividers++;
                    }
                }
                if (countDividers == 1) {
                    System.out.print(" " + runNumber);
                    countPrints++;
                }
                runNumber++;
            }
            while (countPrints != number);
        }
    }

    public static void exam5() {
        Scanner scanner = new Scanner(System.in);
        int number = 0;
        int tempSum = 0;
        int firstNumber = 0;
        int secondNumber = 1;
        System.out.println("Enter a number");
        number = scanner.nextInt();
        if ((number == 0) || (number == 1)) {
            System.out.println("This is fib");
        } else {
            do {
                tempSum = firstNumber + secondNumber;
                firstNumber = secondNumber;
                secondNumber = tempSum;
            }
            while (tempSum < number);
            if (tempSum > number) {
                System.out.println("This is not fib");
            } else {
                System.out.println("This is fib");
            }
        }
    }
    public static void exam6(){
        Scanner scanner = new Scanner(System.in);
        int number = 0;
        int sum = 0;
        System.out.println("Enter a number");
        number = scanner.nextInt();
        while(number!=0){
            sum+=number%10;
            number=number/10;
        }
        System.out.println(sum);
    }
    public static void exam7(){
        int digitCounter=0;
        int tempnum=0;
        for(int i=0;i<=1000;i++){
            tempnum=i;
            while(tempnum!=0){
                digitCounter++;
                tempnum=tempnum/10;
            }
            if((Math.pow(i%10,digitCounter))+(Math.pow(i/10%10,digitCounter))+(Math.pow(i/100%10,digitCounter))==i){
                System.out.print(i+", ");
            }
            digitCounter=0;
        }
    }
}
