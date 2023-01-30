import java.util.Arrays;
import java.util.Scanner;

public class exercises2 {
    public static void main(String[] args) {
        int[] numbers = {12, 56, 39, 13, 21, 74};
        int[] numbers2 = {156, 102};
        int num = 2;
        String str = "abbbcc";
        String str2 = "ABCDABCDABCD";
        double[] doubles = {1.4, 2.0, 7.2};
        String[] stringArray = {"AfdsfBA", "ASabcdefSA", "SKabcKS", "AedddfB"};

        //System.out.println(exam1(numbers, num));
        exam14(stringArray);

    }

    public static int exam1(int[] numbers, int num) {
        int numberOfBlocks = 0;
        int counter = 1;
        int counterBiggest = 0;
        int index = 0;
        for (int i = 0; i < numbers.length - 1; i++) {
            if (numbers[i] == numbers[i + 1]) {
                counter++;
            } else {
                if (counter > num) {
                    numberOfBlocks++;
                }
                if (counter > counterBiggest) {
                    counterBiggest = counter;
                    index = i;
                }
                counter = 1;
            }
            if (i == numbers.length - 2) {
                if (counter > num) {
                    numberOfBlocks++;
                }
                if (counter > counterBiggest) {
                    counterBiggest = counter;
                    index = i;
                }
            }

        }
        System.out.println("the biggest block = " + numbers[index]);
        return numberOfBlocks;
    }

    public static int exam3(String str) {
        int sum = 0;
        int digit1 = Character.getNumericValue(str.charAt(0));
        int digit2 = Character.getNumericValue(str.charAt(2));
        int digit3 = Character.getNumericValue(str.charAt(4));
        char sign1 = str.charAt(1);
        char sign2 = str.charAt(3);
        if (sign1 == '*' && sign2 == '*') {
            sum = digit1 * digit2 * digit3;
        }
        if (sign1 == '*' && sign2 == '+') {
            sum = digit1 * digit2 + digit3;
        }
        if (sign1 == '*' && sign2 == '-') {
            sum = digit1 * digit2 - digit3;
        }
        if (sign1 == '+' && sign2 == '*') {
            sum = digit1 + digit2 * digit3;
        }
        if (sign1 == '+' && sign2 == '-') {
            sum = digit1 + digit2 - digit3;
        }
        if (sign1 == '+' && sign2 == '-') {
            sum = digit1 + digit2 - digit3;
        }
        if (sign1 == '-' && sign1 == '*') {
            sum = digit1 - digit2 * digit3;
        }
        if (sign1 == '-' && sign2 == '+') {
            sum = digit1 - digit2 + digit3;
        }
        if (sign1 == '-' && sign2 == '-') {
            sum = digit1 - digit2 - digit3;
        }
        return sum;
    }

    public static boolean[] exam4(double[] doubleArray) {
        boolean[] booleanArray = new boolean[doubleArray.length];
        for (int i = 0; i < doubleArray.length; i++) {
            if (doubleArray[i] % 1 == 0) {
                booleanArray[i] = true;
            }
        }
        System.out.println(Arrays.toString(booleanArray));
        return booleanArray;
    }

    public static int[] exam5(String str) {
        int[] array = new int[2];
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
                array[1]++;
            } else {
                array[0]++;
            }
        }
        System.out.println(Arrays.toString(array));
        return array;
    }

    public static String exam6(String[] stringArray) {
        String answer = "";
        int longest = 0;
        int temp = 0;
        int tempIndex = 0;
        int index = 0;
        for (int i = 0; i < stringArray.length; i++) {
            if (!stringArray[i].contains(" ")) {
                temp = stringArray[i].length();
                tempIndex = i;
            }
            if (longest < temp) {
                longest = temp;
                index = tempIndex;
            }
        }
        answer = stringArray[index];
        System.out.println(answer);
        return answer;
    }

    public static boolean exam7(int[] array) {
        int length = array.length;
        int tempSum = 0;
        int tempnum = 0;
        boolean answer = false;
        for (int i = 0; i < array.length; i++) {
            tempnum = array[i];
            while (tempnum != 0) {
                tempSum += tempnum % 10;
                tempnum = tempnum / 10;
            }
            if (tempSum == length) {
                answer = true;
            } else {
                answer = false;
            }
            tempnum = 0;
            tempSum = 0;
        }
        System.out.println(answer);
        return answer;
    }

    public static void exam8(String[] strings) {
        for (int i = 0; i < strings.length; i++) {
            if (strings[i].length() % 2 == 0) {
                System.out.println(strings[i].charAt(0));
            } else {
                System.out.println(strings[i].charAt(strings[i].length() - 1));
            }
        }
    }

    public static boolean exam9(int[] array) {
        boolean answer = false;
        int half1Sum = 0;
        int half2Sum = 0;
        int minNum = 0;
        int maxNum = 0;
        if (array.length > 4 && array.length % 2 == 0) {
            for (int i = 0; i < array.length / 2; i++) {
                half1Sum += array[i];
                if (minNum > array[i]) {
                    minNum = array[i];
                }
            }
            for (int i = array.length / 2; i < array.length; i++) {
                half2Sum += array[i];
                if (maxNum < array[i]) {
                    maxNum = array[i];
                }
            }
            if (half1Sum == half2Sum && minNum < maxNum) {
                answer = true;
            }
        }
        System.out.println(answer);
        return answer;
    }

    public static String exam10(String str) {
        String answer = "";
        String[] strings;
        strings = str.split(" ");
        for (int i = 0; i < strings.length - 1; i++) {
            answer += strings[i].charAt(0) + ".";
        }
        answer += strings[strings.length - 1].charAt(0);
        System.out.println(answer);
        return answer;
    }

    public static int exam11(String s1, String s2) {
        int s = -1;
        int s1Length = s1.length();
        int s2Length = s2.length();
        String tempString = "";
        if ((s2Length / s1Length) % 1 == 0) {
            int tempS = s2Length / s1Length;
            for (int i = 0; i < tempS; i++) {
                tempString += s1;
            }
            if (tempString.equals(s2)) {
                s = tempS;
            }
        }
        return s;
    }

    public static int exam12(int[] array1, int[] array2) {
        int maxCounter = 0;
        int maxCloser = 0;
        int index = 0;
        for (int i = 0; i < array1.length; i++) {
            int tempNum = array1[i];
            int tempSum = 0;
            while (tempNum != 0) {
                tempSum += tempNum % 10;
                tempNum = tempNum / 10;
            }
            for (int j = 0; j < array2.length; j++) {
                int tempNumB = array2[j];
                int tempSumB = 0;
                while (tempNumB != 0) {
                    tempSumB += tempNumB % 10;
                    tempNumB = tempNumB / 10;
                }
                if (tempSum == tempSumB) {
                    maxCloser++;
                }
            }
            if (maxCounter < maxCloser) {
                maxCounter = maxCloser;
                index = i;
            }
        }
        System.out.println(index);
        return index;
    }

    public static String exam13(String str) {
        String answer = "";
        int counter = 0;
        int tempCounter = 0;
        char tempChar = ' ';
        char ch = ' ';
        do {
            for (int i = 0; i < str.length(); i++) {
                for (int j = 0; j < str.length(); j++) {
                    if (str.charAt(i) == str.charAt(j)) {
                        tempCounter++;
                        tempChar = str.charAt(i);
                    }
                }
                if (tempCounter > counter) {
                    counter = tempCounter;
                    ch = tempChar;
                }
                tempCounter = 0;
                tempChar = ' ';
            }
            answer += Character.toString(ch);
            String tempStr = "";
            for (int s = 0; s < str.length(); s++) {
                if (str.charAt(s) != ch) {
                    tempStr += str.charAt(s);
                }
            }
            str = tempStr;
            tempStr = "";
            ch = ' ';
            counter = 0;
        }
        while (str != "");
        return answer;
    }

    public static String exam14(String[] strings) {
        String answer = "";
        int index = 0;
        int biggestCunter = 0;
        for (int i = 0; i < strings.length; i++) {
            String tempString = "";
            int smallLetterCounter = 0;
            boolean isPallindrum = false;
            int length = strings[i].length();
            for (int j = 0; j <= length - 1; j++) {
                if ((strings[i].charAt(j) >= 'A') && (strings[i].charAt(j) <= 'Z')) {
                    tempString += Character.toString(strings[i].charAt(j));
                } else {
                    smallLetterCounter++;
                }
            }
            for (int s = 0; s < tempString.length() / 2; s++) {
                if (tempString.charAt(s) == tempString.charAt(tempString.length() - 1 - s)) {
                    isPallindrum = true;
                }
            }
            if (isPallindrum && smallLetterCounter > biggestCunter) {
                biggestCunter = smallLetterCounter;
                index = i;
            }
        }
        answer = strings[index];
        System.out.println(answer);
        return answer;
    }
}


