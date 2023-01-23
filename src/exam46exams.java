import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class exam46exams {
    public static void main(String[] args) {
        int[] arr1 = {4363, 12756, 1278, 9550};
        int[] arr2 = {5, 3, 122, 8, 1, 12, 6, 7, 8};
        int n2 = 50;
        exam46(121111, 1);
        //exam34x3();
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

    public static void exam22() {
        Scanner scanner = new Scanner(System.in);
        int number = 0;
        int sum = 0;
        System.out.println("Enter numebr");
        number = scanner.nextInt();
        while (number != 0) {
            sum += number % 10;
            number = number / 10;
        }
        System.out.println(sum);
    }

    public static void exam23() {
        Scanner scanner = new Scanner(System.in);
        int number = 0;
        int firstDigit = 0;
        int lastDigit = 0;
        System.out.println("Enter numebr");
        number = scanner.nextInt();
        lastDigit = number % 10;
        while (number != 0) {
            number = number / 10;
            firstDigit = number % 10;
            if (number >= 1 && number < 9) {
                break;
            }
        }
        if (firstDigit == lastDigit) {
            System.out.println("beautiful number");
        } else {
            System.out.println("ugly number");

        }
    }

    public static void exam24() {
        int number = 0;
        int firstDigit = 0;
        int lastDigit = 0;
        for (int i = 1; i <= 1000; i++) {
            number = i;
            lastDigit = number % 10;
            while (number != 0) {
                number = number / 10;
                firstDigit = number % 10;
                if (number >= 1 && number <= 9) {
                    break;
                }
            }
            if (firstDigit == lastDigit) {
                System.out.print(i + ", ");
            }
        }
    }

    public static int exam25(int number, int digit) {
        int counter = 0;
        while (number != 0) {
            if (number % 10 == digit) {
                counter++;
            }
            number = number / 10;
        }
        return counter;
    }

    public static int[] exam26(int parameter1, int parameter2) {
        int[] array = new int[parameter1];
        for (int i = 0; i < array.length; i++) {
            array[i] = parameter2;
        }
        System.out.println(Arrays.toString(array));
        return array;
    }

    public static int[] exam27(int parameter1, int parameter2) {
        int[] array = new int[parameter1];
        for (int i = 0; i < array.length; i++) {
            array[i] = (parameter2) + i;
        }
        System.out.println(Arrays.toString(array));
        return array;
    }

    public static int[] exam28(int parameter1) {
        Random random = new Random();
        int[] array = new int[parameter1];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(1, 1000);
        }
        System.out.println(Arrays.toString(array));
        return array;
    }

    public static int exam29(int[] array) {
        int theHighestNumber = 0;
        theHighestNumber = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > theHighestNumber) {
                theHighestNumber = array[i];
            }
        }
        System.out.println(theHighestNumber);
        return theHighestNumber;
    }

    public static int exam30(int[] array, int number) {
        int counetr = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == number) {
                counetr++;
            }
        }
        //System.out.println(counetr);
        return counetr;
    }

    public static int[] exam31(int[] array, int number) {
        int counter = exam30(array, number);
        int[] newArray = new int[array.length - counter];
        for (int i = 0; i < newArray.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[j] != number) {
                    newArray[i] = array[j];
                    i++;
                }
            }
        }
        System.out.println(Arrays.toString(newArray));
        return newArray;
    }

    public static int exam32(int[] array1, int[] array2) {
        int sumArray1 = 0;
        int sumArray2 = 0;
        int answer;
        for (int i = 0; i < array1.length; i++) {
            sumArray1 += array1[i];
        }
        for (int i = 0; i < array2.length; i++) {
            sumArray2 += array2[i];
        }
        if (sumArray1 > sumArray2) {
            answer = 1;
        } else if (sumArray2 > sumArray1) {
            answer = 2;
        } else {
            answer = 0;
        }
        System.out.println(answer);
        return answer;
    }

    public static void exam33x1(int[] array) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            System.out.println("Enter number");
            array[i] = scanner.nextInt();
        }
    }

    public static void exam33x2(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                System.out.print(array[i] + ",");
            }
        }
    }

    public static void exam33x3() {
        final int ARRAY_LENGTH = 10;
        int[] array = new int[ARRAY_LENGTH];
        exam33x1(array);
        exam33x2(array);
        //System.out.print(Arrays.toString(array));
    }

    public static void exam34x1(int[] array, int num) {
        int temp = 1;
        for (int i = 0; i < array.length; i++) {
            array[i] = num * temp;
            temp++;
        }
    }

    public static void exam34x2(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ",");
        }
    }

    public static void exam34x3() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your array size");
        int arraySize = scanner.nextInt();
        System.out.println("Enter your number");
        int number = scanner.nextInt();
        int[] array = new int[arraySize];
        exam34x1(array, number);
        exam34x2(array);
    }

    public static void exam35(int[] array) {
        for (int i = 1; i < array.length; i += 2) {
            array[i] = array[i] * 3;
        }
        System.out.println(Arrays.toString(array));
    }

    public static boolean exam36(int[] array) {
        boolean answer = false;
        int maxNum = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > maxNum) {
                maxNum = array[i];
            }
            if (maxNum == array[array.length - 1]) {
                answer = true;
            } else {
                answer = false;
            }
        }
        System.out.println(answer);
        return answer;
    }

    public static int exam37(int[] array, int num) {
        int sum = 0;
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (sum < num) {
                sum += array[i];
                index = i;
            } else {
                break;
            }
        }
        System.out.println(index);
        return index;
    }

    public static int exam38(int[] array, int num) {
        int counter = 0;
        for (int i = 0; i <= array.length; i++) {
            if (array[i] != num) {
                counter++;
            } else {
                break;
            }
        }
        for (int j = 0; j <= array.length; j++) {
            if (array[array.length - 1 - j] != num) {
                counter++;
            } else {
                break;
            }
        }
        System.out.println(counter);
        return counter;
    }

    public static int[] exan39(int[] array, int num) {
        final int SIZE_ARRAY = 3;
        int[] newArray = new int[SIZE_ARRAY];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < num) {
                newArray[0]++;
            } else if (array[i] == num) {
                newArray[1]++;
            } else {
                newArray[2]++;
            }
        }
        System.out.println(Arrays.toString(newArray));
        return newArray;
    }

    public static int[] exam40(int[] array1, int[] array2) {
        int counter = 0;
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                if (array1[i] == array2[j]) {
                    counter++;
                }
            }
        }
        int k = 0;
        int[] newArray = new int[counter];
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                if (array1[i] == array2[j]) {
                    newArray[k] = array2[j];
                    k++;
                }

            }
        }
        System.out.println(Arrays.toString(newArray));
        return newArray;
    }

    public static int[] exam41(int[] array1, int[] array2) {
        int[] tempArray = new int[array1.length + array2.length];
        int k = 0;
        for (int i = 0; i < array1.length; i++) {
            tempArray[k] = array1[i];
            k++;
        }
        for (int i = 0; i < array2.length; i++) {
            tempArray[k] = array2[i];
            k++;
        }
        int counter = 0;
        for (int i = 0; i < tempArray.length; i++) {
            for (int j = i + 1; j < tempArray.length; j++) {
                if (tempArray[i] == tempArray[j]) {
                    counter++;
                }
            }
        }
        int[] newArray = new int[tempArray.length];
        boolean isExist = false;
        int index = 0;
        counter = 0;
        for (int i = 0; i < tempArray.length; i++) {
            for (int j = 0; j < newArray.length; j++) {
                if (tempArray[i] == newArray[j]) {
                    isExist = true;
                    break;
                }
            }
            if (!isExist) {
                newArray[index] = tempArray[i];
                index++;
                counter++;
            } else {
                isExist = false;
            }
        }
        int[] finalArray = new int[counter];
        for (int i = 0; i < finalArray.length; i++) {
            finalArray[i] = newArray[i];
        }
        System.out.println(Arrays.toString(finalArray));
        return finalArray;
    }

    public static int[] removeDup(int[] tempArray) {
        int[] newArray = new int[tempArray.length];
        boolean isExist = false;
        int index = 0;
        int counter = 0;
        for (int i = 0; i < tempArray.length; i++) {
            for (int j = 0; j < newArray.length; j++) {
                if (tempArray[i] == newArray[j]) {
                    isExist = true;
                    break;
                }
            }
            if (!isExist) {
                newArray[index] = tempArray[i];
                index++;
                counter++;
            } else {
                isExist = false;
            }
        }
        int[] finalArray = new int[counter];
        for (int i = 0; i < finalArray.length; i++) {
            finalArray[i] = newArray[i];
        }
        return finalArray;
    }

    public static boolean exam42(int[] array1, int[] array2) {
        boolean answer = false;
        boolean flag = true;
        int counter = 0;
        array1 = removeDup(array1);
        array2 = removeDup(array2);
        if (array1.length == array2.length) {
            for (int i = 0; i < array1.length; i++) {
                for (int j = 0; j < array2.length; j++) {
                    if (array1[i] == array2[j]) {
                        counter++;
                    }
                }
            }
        } else {
            flag = false;
        }
        if (counter == array1.length) {
            answer = true;
        }
        System.out.println(answer);
        return answer;
    }

    public static int[] exam43x1(int[] array1, int[] array2) {
        int thebiggerLength = 0;
        int thebiggerarray = 0;
        if (array1.length > array2.length) {
            thebiggerLength = array1.length;
            thebiggerarray = 1;
        }
        if (array2.length > array1.length) {
            thebiggerLength = array2.length;
            thebiggerarray = 2;
        }
        int[] newArray = new int[thebiggerLength];
        switch (thebiggerarray) {
            case 1 -> {
                for (int i = 0; i < array2.length; i++) {
                    newArray[i] = array2[i];
                }
            }
            case 2 -> {
                for (int i = 0; i < array1.length; i++) {
                    newArray[i] = array1[i];
                }
            }
        }
        //System.out.println(Arrays.toString(newArray));
        return newArray;
    }

    public static int[] exam43x2(int[] array1, int[] array2) {
        if (array1.length > array2.length) {
            array2 = exam43x1(array1, array2);
        }
        if (array2.length > array2.length) {
            array1 = exam43x1(array1, array2);
        }
        int[] newArray = new int[array1.length];
        for (int i = 0; i < newArray.length; i++) {
            newArray[i] = (array1[i] + array2[i]) / 2;
        }
        System.out.println(Arrays.toString(newArray));
        return newArray;
    }

    public static int[] exam44x1(int[] array) {
        int[] newArray = new int[array.length];
        newArray[0] = array[array.length - 1];
        for (int i = 0; i < array.length - 1; i++) {
            newArray[i + 1] = array[i];
        }
        return newArray;
        //System.out.println(Arrays.toString(newArray));
    }

    public static int[] exam44x2(int[] array) {
        int[] newArray = new int[array.length];
        newArray[newArray.length - 1] = array[0];
        for (int i = 0; i < array.length - 1; i++) {
            newArray[i] = array[i + 1];
        }
        return newArray;
        //System.out.println(Arrays.toString(newArray));
    }

    public static int[] exam44X3(int[] array, boolean left, int shifts) {
        int[] newArray = array;
        if (left) {
            for (int i = 0; i < shifts; i++) {
                newArray = exam44x2(newArray);
            }
        } else {
            for (int i = 0; i < shifts; i++) {
                newArray = exam44x1(newArray);
            }
        }
        System.out.println(Arrays.toString(newArray));
        return newArray;
    }

    public static int[] exam45(int[] array) {
        int[] newArray = new int[10];
        int[] tempArray = new int[array.length];
        int temp = 0;
        for (int i = 0; i < newArray.length; i++) {
            for (int j = 0; j < array.length; j++) {
                tempArray[j] = array[j];
            }
            for (int j = 0; j < tempArray.length; j++) {
                while (tempArray[j] != 0) {
                    temp = tempArray[j] % 10;
                    if (temp == i) {
                        newArray[i]++;
                    }
                    tempArray[j] = tempArray[j] / 10;
                }
            }
        }
        System.out.println(Arrays.toString(newArray));
        return newArray;
    }

    public static int exam46(int num, int digit) {
        int finalNum = 0;
        int counter = 0;
        int temp = num;
        while (temp != 0) {
            counter++;
            temp = temp / 10;
        }
        int[] numArray = new int[counter];
        for (int i = 0; i < numArray.length; i++) {
            numArray[numArray.length - 1 - i] = num % 10;
            num = num / 10;
        }
        int[] newArray = new int[numArray.length];
        boolean isExist = false;
        int index = 0;
        counter = 0;
        for (int i = 0; i < numArray.length; i++) {
            for (int j = 0; j < newArray.length; j++) {
                if (numArray[i] == digit) {
                    isExist = true;
                    break;
                }
            }
            if (!isExist) {
                newArray[index] = numArray[i];
                index++;
                counter++;
            } else {
                isExist = false;
            }
        }
        int[] finalArray = new int[counter];
        for (int i = 0; i < finalArray.length; i++) {
            finalArray[i] = newArray[i];
        }
        for (int i = 0; i < finalArray.length; i++) {
            finalNum += finalArray[i] * Math.pow(10, counter - i);
        }
        finalNum = finalNum / 10;
        System.out.println(finalNum);
        return finalNum;
    }
}



