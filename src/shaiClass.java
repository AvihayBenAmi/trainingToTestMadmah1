public class shaiClass {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        String[] name = {"aaaBBBAAAbbbZZzz", "aabbaaAA", "asBShf"};
        char ch = 'a';
        mostSpecialString(name, ch);
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
}
