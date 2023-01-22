import java.util.Scanner;

public class exam46exams {
    public static void main(String[] args) {
        int n1 = 18;
        int n2 = 12;
        int temp = 0;
        //temp=gcd(n1, n2);
        //System.out.println(temp);
        exam21();
    }

    public static void exam1() {
        Scanner scanner = new Scanner(System.in);
        int radius;
        double perimeter;
        double area;
        System.out.println("Enter Radius");
        radius = scanner.nextInt();
        perimeter = 2 * Math.PI * radius;
        area = Math.PI * radius * radius;
        System.out.println("The circle perimeter is =" + perimeter + "\n" +
                "The circle area is =" + area);
    }

    public static void exam2() {
        Scanner scanner = new Scanner(System.in);
        int ribA;
        int ribB;
        int area;
        int perimeter;
        System.out.println("Enter rib A");
        ribA = scanner.nextInt();
        System.out.println("Enter rib B rectangle");
        ribB = scanner.nextInt();
        area = ribA * ribB;
        perimeter = ((2 * ribA) + (2 * ribB));
        System.out.println("The rectangle area is = " + area + "\n" +
                "The perimeter is =" + perimeter);
    }

    public static void exam3() {
        Scanner scanner = new Scanner(System.in);
        double a;
        double b;
        double c;
        System.out.println("Enter A rib");
        a = scanner.nextInt();
        System.out.println("Enter B rib");
        b = scanner.nextInt();
        c = ((Math.pow(a, 2)) + (Math.pow(b, 2)));
        c = Math.sqrt(c);
        System.out.println("The rest of Triangle is =" + c);
    }

    public static void exam4() {
        Scanner scanner = new Scanner(System.in);
        int age;
        final int THIS_YEAR = 2023;
        final int TARGET_YEAR = 2040;
        System.out.println("Enter your age");
        age = scanner.nextInt();
        age = (TARGET_YEAR - THIS_YEAR) + age;
        System.out.println("Your age in " + TARGET_YEAR + " is will " + age);
    }

    public static float exam5() {
        int num1 = 0;
        int num2 = 0;
        int num3 = 0;
        int num4 = 0;
        float avg = 0;
        avg = (num1 + num2 + num3 + num4) / 4;
        return avg;
    }

    public static void exam6() {
        Scanner scanner = new Scanner(System.in);
        int price;
        int kilometersFromStore;
        final int PRICE_FOR_KILOMETER = 5;
        final double TIP = 1.1;
        int floor;
        int weight;
        double totalPrice;
        int transportationPrice;
        System.out.println("Enter the product price");
        price = scanner.nextInt();
        System.out.println("Enter the product weight");
        weight = scanner.nextInt();
        System.out.println("Enter your destetion from store in km");
        kilometersFromStore = scanner.nextInt();
        System.out.println("Enter your floor house");
        floor = scanner.nextInt();
        transportationPrice = (kilometersFromStore * PRICE_FOR_KILOMETER) + (floor * weight);
        totalPrice = (price + transportationPrice) * TIP;
        System.out.println("The product price is " + price + "\n" +
                "The transportation Price is " + transportationPrice + "\n" +
                "The TIP is " + (int) (totalPrice / 10) + "\n" +
                "The Total price is " + (int) totalPrice);
    }

    public static void exam7() {
        Scanner scanner = new Scanner(System.in);
        int num;
        System.out.println("Enter number");
        num = scanner.nextInt();
        num = num % 10;
        System.out.println(num);
    }

    public static void exam8() {
        Scanner scanner = new Scanner(System.in);
        int num;
        System.out.println("Enter tow digits number");
        num = scanner.nextInt();
        if (num >= 10 && num <= 99) {
            num = num / 10 % 10;
            System.out.println(num);
        }
    }

    public static void exam9() {
        Scanner scanner = new Scanner(System.in);
        int num;
        System.out.println("Enter tow digits number");
        num = scanner.nextInt();
        int sum = 0;
        if (num >= 10 && num <= 99) {
            sum = (num % 10);
            num = num / 10;
            sum += num % 10;
            System.out.println(sum);
        }
    }

    public static void exam10() {
        Scanner scanner = new Scanner(System.in);
        int num;
        System.out.println("Enter number bigger than 1000");
        num = scanner.nextInt();
        if (num > 1000) {
            System.out.println("success");
        } else {
            System.out.println("failure");
        }
    }

    public static void exam11() {
        Scanner scanner = new Scanner(System.in);
        int productPrice1;
        int productPrice2;
        int productPrice3;
        int sum;
        final int SUM_FOR_DISCOUNT = 500;
        System.out.println("Enter product price 1");
        productPrice1 = scanner.nextInt();
        System.out.println("Enter product price 2");
        productPrice2 = scanner.nextInt();
        System.out.println("Enter product price 3");
        productPrice3 = scanner.nextInt();
        sum = productPrice1 + productPrice2 + productPrice3;
        if (sum > SUM_FOR_DISCOUNT) {
            System.out.println("You bought more than 500NIS, you receive 10% discount. total is =" + sum * 0.9);
        } else {
            System.out.println(sum);
        }
    }

    public static void exam12() {
        Scanner scanner = new Scanner(System.in);
        int num1;
        int num2;
        int num3;
        System.out.println("Enter number 1");
        num1 = scanner.nextInt();
        System.out.println("Enter number 2");
        num2 = scanner.nextInt();
        System.out.println("Enter number 3");
        num3 = scanner.nextInt();
        if ((num2 - num1) == (num3 - num2)) {
            System.out.println("the difference is OK");
        } else {
            System.out.println("the differnce is not OK");
        }
    }

    public static void exam13() {
        Scanner scanner = new Scanner(System.in);
        int avgStudent;
        final int EXELLENT = 90;
        final int GOOD = 70;
        System.out.println("Enter Student average");
        avgStudent = scanner.nextInt();
        if (avgStudent > EXELLENT) {
            System.out.println("The student is exellent");
        } else if (avgStudent > GOOD && avgStudent < EXELLENT) {
            System.out.println("The student is Good");
        } else {
            System.out.println("The student is Not Good");
        }
    }

    public static void exam14() {
        Scanner scanner = new Scanner(System.in);
        int num;
        System.out.println("Enter tow digits number");
        num = scanner.nextInt();
        int sum = 0;
        if (num >= 10 && num <= 99) {
            sum = (num % 10);
            num = num / 10;
            sum += num % 10;
            System.out.println(sum);
        }
    }

    public static void exam15() {
        Scanner scanner = new Scanner(System.in);
        int num;
        int num1;
        int num2;
        int num3;
        System.out.println("Enter three digits number");
        num = scanner.nextInt();
        if (num >= 100 && num <= 999) {
            num1 = num / 100;
            num2 = num / 10 % 10;
            num3 = num % 10;
            if ((num1 + 1 == num2 && num2 + 1 == num3) || (num1 - 1 == num2 && num2 - 1 == num3)) {
                System.out.println("good");
            } else {
                System.out.println("Not good");
            }
        }
    }

    public static void exam16() {
        Scanner scanner = new Scanner(System.in);
        int baseSalary;
        int salesTarget;
        int sales;
        double totalsalery;
        final double MAX_BONUS = 1.75;
        final int BASE_BONUS = 2000;
        final double MIN_SALES_FOR_BONUS = 0.5;
        System.out.println("Enter your base salary");
        baseSalary = scanner.nextInt();
        System.out.println("Enter your month target sales");
        salesTarget = scanner.nextInt();
        System.out.println("Enter your sales on this month");
        sales = scanner.nextInt();
        if (sales >= salesTarget) {
            totalsalery = baseSalary * MAX_BONUS;
        } else if (sales >= salesTarget * MIN_SALES_FOR_BONUS) {
            totalsalery = baseSalary + BASE_BONUS;
        } else {
            totalsalery = baseSalary;
        }
        System.out.println("your total salary this month is = " + (int) totalsalery);
    }

    public static void exam17() {
        Scanner scanner = new Scanner(System.in);
        int counter = 0;
        int num;
        while (counter < 5) {
            System.out.println("Enter couple number");
            num = scanner.nextInt();
            if (num % 2 == 0) {
                counter++;
            }
        }
    }

    public static void exam18() {
        Scanner scanner = new Scanner(System.in);
        int counter = 0;
        int counterDiviosn = 0;
        int num = 0;
        while (counter < 10) {
            System.out.println("Enter number");
            num = scanner.nextInt();
            counter++;
            if (num % 3 == 0) {
                counterDiviosn++;
            }
        }
        System.out.println(counterDiviosn);
    }

    public static void exam19() {
        Scanner scanner = new Scanner(System.in);
        int number;
        do {
            System.out.println("Enter tow-digit number with equals digits");
            number = scanner.nextInt();
        }
        while (number / 10 != number % 10);
    }

    public static int exam20(int number1, int number2) {
        int bigNumber;
        int temp = 0;
        if (number1 > number2) {
            bigNumber = number1;
        } else {
            bigNumber = number2;
        }
        for (int i = 2; i <= bigNumber; i++) {
            if (number1 % i == 0 && number2 % i == 0) {
                temp = i;
            }
        }
        return temp;
    }

    public static void exam21() {
        Scanner scanner = new Scanner(System.in);
        int number;
        int counterDigits = 0;
        System.out.println("Enter numebr");
        number = scanner.nextInt();
        while (number != 0) {
            number = number / 10;
            counterDigits++;
        }
        System.out.println(counterDigits);
    }

}

