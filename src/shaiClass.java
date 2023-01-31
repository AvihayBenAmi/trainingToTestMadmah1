import java.util.Arrays;

public class shaiClass {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int[] arr2 = {2, 3, 4, 5, 1};
        String[] name = {"aaaBBBAAAbbbZZzz", "aabbaaAA", "asBShf"};
        char ch = 'a';
        fastestCircularTransformation(arr2, arr);
    }

    public static int printHighest(int[] array) {
        int maxNum = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > maxNum) {
                maxNum = array[i];
            }
        }
        return maxNum;
    }

    public static double getMedian(int[] series) {
        int smallCounter = 0;
        int bigCounter = 0;
        int tempMaxNum = 0;
        double answer = 0;
        for (int i = 0; i < series.length; i++) {
            for (int j = 0; j < series.length; j++) {
                if (series[j] > series[i]) {
                    bigCounter++;
                }
                if (series[j] < series[i]) {
                    smallCounter++;
                }
            }
            if (bigCounter == smallCounter && series.length % 2 != 0) {
                answer = series[i];
            }
            if (series.length % 2 == 0 && bigCounter == smallCounter - 1 || bigCounter - 1 == smallCounter) {
                answer += series[i];
            }
            bigCounter = 0;
            smallCounter = 0;
        }
        if (series.length % 2 == 0) {
            answer = answer / 2;
        }
        System.out.println(answer);
        return answer;
    }

    public static boolean isTriangleText(String text) {
        boolean answer = false;
        String tempString = "";
        int k = 0;
        int num = text.length() / 3;
        String[] strings = new String[3];
        for (int i = 0; i < strings.length; i++) {
            for (int j = 0; j < text.length(); j += num) {
                strings[i] = text.substring(j, j + num);
            }
        }
        if (strings[0].equals(strings[1]) && strings[1].equals(strings[2])) {
            answer = true;
        }
        System.out.println(answer);
        return answer;
    }

    public static boolean isSpecialString(String str) {
        boolean answer = true;
        int counter = 0;
        int capitalLetterCounter = 0;
        int smallLetterCounter = 0;
        for (int i = 0; i < str.length(); i++) {
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
                    if (str.charAt(j) == str.charAt(i)) {
                        capitalLetterCounter++;
                        str.replace(str.charAt(j), ' ');
                    }
                    if (str.charAt(j) == str.charAt(i) + 32) {
                        smallLetterCounter++;
                        str.replace(str.charAt(j), ' ');
                    }
                }
                if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
                    if (str.charAt(j) == str.charAt(i)) {
                        smallLetterCounter++;
                        str.replace(str.charAt(j), ' ');
                    }
                    if (str.charAt(j) == str.charAt(i) - 32) {
                        capitalLetterCounter++;
                        str.replace(str.charAt(j), ' ');
                    }
                }
            }
            if ((capitalLetterCounter + smallLetterCounter) % 2 != 0) {
                answer = false;
                break;
            }
            capitalLetterCounter = 0;
            smallLetterCounter = 0;
        }
        return answer;

    }

    public static String mostSpecialString(String[] strings, char find) {
        boolean checkIfSpecial = false;
        int counter = 0;
        int maxCounter = 0;
        int index = 0;
        String answer = "";
        for (int i = 0; i < strings.length; i++) {
            checkIfSpecial = isSpecialString(strings[i]);
            if (checkIfSpecial) {
                for (int j = 0; j < strings[i].length(); j++) {
                    if (strings[i].charAt(j) == find) {
                        counter++;
                    }
                }
                if (counter > maxCounter) {
                    maxCounter = counter;
                    index = i;
                }
                counter = 0;
            }
        }
        answer = strings[index];
        System.out.println(answer);
        return answer;
    }

    public static int[] turnRight(int[] array) {
        int[] newArray = new int[array.length];
        newArray[0] = array[array.length - 1];
        for (int i = 0; i < newArray.length - 1; i++) {
            newArray[i + 1] = array[i];
        }
        //System.out.println(Arrays.toString(newArray));
        return newArray;
    }

    public static int[] turnLeft(int[] array) {
        int[] newArray = new int[array.length];
        newArray[array.length - 1] = array[0];
        for (int i = 0; i < newArray.length - 1; i++) {
            newArray[i] = array[i + 1];
        }
        //System.out.println(Arrays.toString(newArray));
        return newArray;
    }

    public static int fastestCircularTransformation(int[] original, int[] target) {
        int counterleft = 0;
        int counterRight = 0;
        int[] tempOriginal = new int[original.length];
        int answer = 0;
        tempOriginal = original;
        boolean check = false;
        if (original.length == target.length) {
            while (!check) {
                tempOriginal = turnLeft(tempOriginal);
                counterleft++;
                check = ifEquals(tempOriginal, target);
                if (counterleft > 6) {
                    break;
                }
            }
            check = false;
            while (!check) {
                tempOriginal = turnRight(tempOriginal);
                counterRight++;
                check = ifEquals(tempOriginal, target);
                if (counterRight > 6) {
                    break;
                }
            }
        }
        if (counterleft >= 6 || counterRight >= 6) {
            answer = 0;
        }
        if (counterleft < counterRight) {
            answer = 1;
        }
        if (counterRight < counterleft) {
            answer = 2;
        }
        if (counterleft == counterRight && counterleft < 6 && counterRight < 6) {
            answer = 3;
        }
        System.out.println(answer);
        return answer;
    }

    public static boolean ifEquals(int[] arr1, int[] arr2) {
        boolean answer = true;
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                answer = false;
            }
        }
        return answer;

    }
}
