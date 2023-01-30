import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class noa47 {
    public static void main(String[] args) {
        int num = 6;
        int num2 = 6;
        int[] arr1 = {2, 3, 1, 4, 5, 6};
        int[] arr2 = {4, 3, 5, 3, 2, 1, 8};
        String date = "Avihay ben ami 123";
        exam47(date);

    }

    public static double exam1(int radius) {
        double s = 0;
        s = (Math.pow(radius, 2)) * Math.PI;
        System.out.println(s);
        return s;
    }

    public static void exam3(int age) {
        if (age < 18) {
            System.out.println("minor");
        } else {
            System.out.println("Adult");
        }
    }

    public static void exam4(int age) {
        if (age < 18) {
            System.out.println("minor");
        } else if (age >= 18 && age <= 65) {
            System.out.println("Adult");
        } else {
            System.out.println("pensioner");
        }
    }

    public static int exam5(String date) {
        String[] dates;
        int season = -1;
        int month = 0;
        dates = date.split("-");
        System.out.println(dates[0]);
        System.out.println(dates[1]);
        System.out.println(dates[2]);
        month = Integer.parseInt(dates[1]);
        if (month >= 3 && month <= 5) {
            season = 1;
        }
        if (month >= 6 && month <= 8) {
            season = 2;
        }
        if (month >= 9 && month <= 11) {
            season = 3;
        }
        if (month == 12 || month == 1 || month == 2) {
            season = 4;
        }
        System.out.println(season);
        return season;
    }

    public static void exam6(int number) {
        Random random = new Random();
        for (int i = 0; i < number; i++) {
            int rnd = random.nextInt(1, 101);
            System.out.print(rnd + ", ");
        }
    }

    public static void exam7(int number) {
        Random random = new Random();
        int counter = 0;
        while (counter != number) {
            int rnd = random.nextInt(1, 101);
            if (rnd % 2 == 0) {
                counter++;
            }
            System.out.print(rnd + ", ");
        }
    }

    public static boolean exam8(String str) {
        boolean answer = true;
        for (int i = 0; i < str.length(); i++) {
            if (!(str.charAt(i) >= 'A' && str.charAt(i) <= 'Z')) {
                answer = false;
                break;
            }
        }
        System.out.println(answer);
        return answer;
    }

    public static int exam9(String str) {
        int counter = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
                counter++;
            }
        }
        System.out.println(counter);
        return counter;
    }

    public static void exam10(int num) {
        Scanner scanner = new Scanner(System.in);
        int user = 0;
        do {
            System.out.println("Enter number");
            user = scanner.nextInt();
        }
        while (user != num);
    }

    public static void exam11(int times, int value) {
        Scanner scanner = new Scanner(System.in);
        int userNumber = 0;
        int valueCounter = 0;
        do {
            System.out.println("Enter number");
            userNumber = scanner.nextInt();
            if (userNumber == value) {
                valueCounter++;
            }
        }
        while (times != valueCounter);
    }

    public static void exam12() {
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        int lastNum = 0;
        boolean check = false;
        do {
            System.out.println("Enter number");
            num = scanner.nextInt();
            if (lastNum == num) {
                check = true;
            } else {
                lastNum = num;
            }
        }
        while (!check);
    }

    public static void exam13() {
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        int counter = 0;
        int lastNum = 0;
        boolean check = false;
        do {
            System.out.println("Enter number");
            num = scanner.nextInt();
            if (lastNum == num) {
                counter++;
            } else {
                lastNum = num;
            }
        }
        while (counter < 2);
    }

    public static int[] exam14(int size) {
        int[] array = new int[size];
        return array;
    }

    public static int[] exam15(int size, int value) {
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = value;
        }
        System.out.println(Arrays.toString(array));
        return array;
    }

    public static int[] exam16(int size, int start) {
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = start + i;
        }
        System.out.println(Arrays.toString(array));
        return array;
    }

    public static int[] exam17(int size, int start) {
        int[] array = new int[size];
        int num = 1;
        for (int i = 0; i < array.length; i++) {
            array[i] = start * num;
            num++;
        }
        System.out.println(Arrays.toString(array));
        return array;
    }

    public static void exam18(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ", ");
        }
    }

    public static void exam19(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                System.out.print(array[i] + ", ");
            }
        }
    }

    public static int exam20(int[] array) {
        int counter = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                counter++;
            }
        }
        return counter;
    }

    public static int exam21(int[] array, int number) {
        int counter = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % number == 0) {
                counter++;
            }
        }
        return counter;
    }

    public static boolean exam22(int[] array, int number) {
        boolean isExist = false;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == number) {
                isExist = true;
            }
        }
        return isExist;
    }

    public static int exam23(int[] array, int number) {
        int counter = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == number) {
                counter++;
            }
        }
        return counter;
    }

    public static int exam24(int[] array) {
        int value = 0;
        boolean checkIfNull = true;
        if (array[0] > array[array.length - 1]) {
            value = 1;
        }
        if (array[array.length - 1] > array[0]) {
            value = 2;
        }
        if (array[array.length - 1] == array[0]) {
            value = 3;
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] != 0) {
                checkIfNull = false;
                break;
            }
        }
        if (checkIfNull) {
            value = 4;
        }
        return value;
    }

    public static int exam25(int[] array) {
        int highNum = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > highNum) {
                highNum = array[i];
            }
        }
        return highNum;
    }

    public static int exam26(int[] array) {
        int lowNum = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < lowNum) {
                lowNum = array[i];
            }
        }
        return lowNum;
    }

    public static int exam27(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }

    public static int exam28(int[] array) {
        int avg = 0;
        for (int i = 0; i < array.length; i++) {
            avg += array[i];
        }
        avg = avg / array.length;
        return avg;
    }

    public static void exam29(int[] array) {
        int avg = 0;
        for (int i = 0; i < array.length; i++) {
            avg += array[i];
        }
        avg = avg / array.length;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > avg) {
                System.out.print(array[i] + ", ");
            }
        }
    }

    public static int exam30(int[] array) {
        int avg = 0;
        int counter = 0;
        for (int i = 0; i < array.length; i++) {
            avg += array[i];
        }
        avg = avg / array.length;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < avg) {
                counter++;
            }
        }
        return counter;
    }

    public static int[] exam31(int[] array) {
        int avg = 0;
        int counter = 0;
        for (int i = 0; i < array.length; i++) {
            avg += array[i];
        }
        avg = avg / array.length;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < avg) {
                counter++;
            }
        }
        int[] newArray = new int[counter];
        int k = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < avg) {
                newArray[k] = array[i];
                k++;
            }
        }
        return newArray;
    }

    public static int[] exam32(int[] array, int number) {
        int[] newArray = new int[array.length - 1];
        int k = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != number) {
                newArray[k] = array[i];
                k++;
            }
        }
        return newArray;
    }

    public static int[] exam33(int[] array, int number) {
        int counter = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % number == 0) {
                counter++;
            }
        }
        int[] newArray = new int[array.length - counter];
        int k = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % number != 0) {
                newArray[k] = array[i];
                k++;
            }
        }
        return newArray;
    }

    public static int exam34(int[] array) {
        int maxNum = 0;
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > maxNum) {
                maxNum = array[i];
                index = i;
            }
        }
        array[index] = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > maxNum) {
                maxNum = array[i];
            }
        }
        return maxNum;
    }

    public static int exam35(int[] arr1, int[] arr2) {
        int sumArr1 = 0;
        int sumArr2 = 0;
        int maxSum = 0;
        for (int i = 0; i < arr1.length; i++) {
            sumArr1 += arr1[i];
        }
        for (int i = 0; i < arr2.length; i++) {
            sumArr2 += arr2[i];
        }
        if (sumArr1 > sumArr2) {
            maxSum = sumArr1;
        } else {
            maxSum = sumArr2;
        }
        return maxSum;
    }

    public static int[] exam36(int[] arr1, int[] arr2) {
        int[] newArray = new int[arr1.length];
        for (int i = 0; i < arr1.length; i++) {
            newArray[i] = arr1[i] + arr2[i];
        }
        return newArray;
    }

    public static int[] exam37(int[] arr1, int[] arr2) {
        int[] newArr1 = new int[0];
        int[] newArr2 = new int[0];
        if (arr1.length > arr2.length) {
            newArr2 = new int[arr1.length];
            newArr1 = arr1;
            for (int i = 0; i < arr2.length; i++) {
                newArr2[i] = arr2[i];
            }
        }
        if (arr2.length > arr1.length) {
            newArr1 = new int[arr2.length];
            newArr2 = arr2;
            for (int i = 0; i < arr1.length; i++) {
                newArr1[i] = arr1[i];
            }
        }
        int[] newArray = new int[newArr1.length];
        for (int i = 0; i < newArr1.length; i++) {
            newArray[i] = newArr1[i] + newArr2[i];
        }
        System.out.println(Arrays.toString(newArray));
        return newArray;
    }

    public static int[] exam38(int[] arr1, int[] arr2) {
        int[] newArray = new int[2];
        int maxNum = 0;
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] > maxNum) {
                maxNum = arr1[i];
            }
        }
        newArray[0] = maxNum;
        maxNum = 0;
        for (int i = 0; i < arr2.length; i++) {
            if (arr2[i] > maxNum) {
                maxNum = arr2[i];
            }
        }
        newArray[1] = maxNum;
        System.out.println(Arrays.toString(newArray));
        return newArray;
    }

    public static boolean exam39(int[] array) {
        boolean isUp = true;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                isUp = false;
                break;
            }
        }
        System.out.println(isUp);
        return isUp;
    }

    public static boolean exam40(int[] array) {
        boolean isFollowing = true;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] + 1 != array[i + 1]) {
                isFollowing = false;
                break;
            }
        }
        System.out.println(isFollowing);
        return isFollowing;
    }

    public static int exam41(int[] array) {
        int counter = 1;
        int maxCounter = 0;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] + 1 == array[i + 1]) {
                counter++;
            } else {
                if (counter > maxCounter) {
                    maxCounter = counter;
                }
                counter = 1;
            }
            if (counter > maxCounter) {
                maxCounter = counter;
            }
        }
        System.out.println(maxCounter);
        return maxCounter;
    }

    public static int exam42(int[] array) {
        int counter = 1;
        int maxCounter = 0;
        for (int i = 0; i < array.length - 1; i++) {
            if ((array[i] % 2 == 0 && array[i + 1] % 2 == 0) && (array[i] + 2 == array[i + 1])) {
                counter++;
            } else {
                if (counter > maxCounter) {
                    maxCounter = counter;
                }
                counter = 1;
            }
            if (counter > maxCounter) {
                maxCounter = counter;
            }
        }
        System.out.println(maxCounter);
        return maxCounter;
    }

    public static boolean exam43(int[] arr1, int[] arr2) {
        boolean answer = true;
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[arr2.length - 1 - i]) {
                answer = false;
                break;
            }
        }
        System.out.println(answer);
        return answer;
    }

    public static boolean exam44(int[] arr1, int[] arr2) {
        boolean answer = true;
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] <= arr2[i]) {
                answer = false;
                break;
            }
        }
        return answer;
    }

    public static int[] exam45(int size) {
        Random random = new Random();
        int[] array = new int[size];
        int rnd1 = 0;
        int rnd2 = 0;
        rnd1 = random.nextInt(1, 11);
        rnd2 = random.nextInt(1, 11);
        array[0] = rnd1;
        array[1] = rnd2;
        for (int i = 2; i < array.length; i++) {
            array[i] = array[i - 1] + array[i - 2];
        }
        System.out.println(Arrays.toString(array));
        return array;
    }

    public static int exam46(int[] arr1, int[] arr2, int num) {
        int counter = 0;
        int[] newArr1 = new int[0];
        int[] newArr2 = new int[0];
        if (arr1.length > arr2.length) {
            newArr2 = new int[arr1.length];
            newArr1 = arr1;
            for (int i = 0; i < arr2.length; i++) {
                newArr2[i] = arr2[i];
            }
        }
        if (arr2.length > arr1.length) {
            newArr1 = new int[arr2.length];
            newArr2 = arr2;
            for (int i = 0; i < arr1.length; i++) {
                newArr1[i] = arr1[i];
            }
        }
        int[] newArray = new int[newArr1.length];
        for (int i = 0; i < newArr1.length; i++) {
            newArray[i] = newArr1[i] + newArr2[i];
            if (newArray[i] == num) {
                counter++;
            }
        }
        System.out.println(counter);
        return counter;
    }

    public static int[] exam47(String str) {
        String[] strings;
        strings = str.split(" ");
        int[] newArray = new int[strings.length];
        for (int i = 0; i < strings.length; i++) {
            newArray[i] = strings[i].length();
        }
        System.out.println(Arrays.toString(newArray));
        return newArray;
    }
}
