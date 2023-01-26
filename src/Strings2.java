import java.util.Arrays;
import java.util.Scanner;

public class Strings2 {
    public static void main(String[] args) {
        String str1 = "I want it, I got it";
        String str2 = "sryg abccba gyrs";
        char[] chars = {'i', 'a', 't', 'c', 'n'};
        char ch = 'a';
        String[] strings = {"Vairiables", "Conditions", "Loops", "Funtctions", "Arrays", "Strings"};
        System.out.println(exam13(str1));
        //exam12();
    }

    public static String exam1() {
        Scanner scanner = new Scanner(System.in);
        String newName = "";
        System.out.println("Enter your first name");
        newName += scanner.nextLine() + " ";
        System.out.println("Enter your last name");
        newName += scanner.nextLine();
        return newName;
    }

    public static void exam2(String str1, String str2) {
        if (str1.length() > str2.length()) {
            System.out.println(str1);
        } else if (str2.length() > str1.length()) {
            System.out.println(str2);
        } else {
            System.out.println("The String are equal length");
        }
    }

    public static boolean exam3(String str1, String str2) {
        boolean answer = false;
        if (str1.length() == str2.length()) {
            for (int i = 0; i < str1.length(); i++) {
                if (str1.charAt(i) == str2.charAt(i)) {
                    answer = true;
                }
            }
        }
        return answer;
    }

    public static String exam4(String str1) {
        String normalNumber = "";
        String tempString = "";
        boolean check = false;
        int length = str1.length();
        if (length >= 10 && length <= 12) {
            for (int i = 0; i < str1.length(); i++) {
                if (str1.charAt(i) >= '0' && str1.charAt(i) <= '9') {
                    check = true;
                } else if (str1.charAt(3) == '-') {
                    check = true;
                } else {
                    check = false;
                }
            }
        } else {
            check = false;
        }
        if (check) {
            switch (length) {
                case 10 -> {
                    tempString = str1.substring(3, 10);
                    normalNumber = str1.substring(0, 3) + '-' + tempString;
                }
                case 11 -> {
                    String check11 = "05-";
                    tempString = str1.substring(0, 2) + str1.charAt(3);
                    if (tempString.equals(check11)) {
                        normalNumber = str1;

                    }
                }
                case 12 -> {
                    String check12 = "9725";
                    tempString = str1.substring(0, 4);
                    if (tempString.equals(check12)) {
                        normalNumber = "05" + str1.charAt(4) + "-" + str1.substring(5, 12);
                    }
                }
            }
        } else {
            normalNumber = "";
        }
        return normalNumber;
    }

    public static boolean exam5() {
        Scanner scanner = new Scanner(System.in);
        String checkPassword = "";
        boolean answer = false;
        int checkDigit = 0;
        int checkSign = 0;
        System.out.println("Enter you password");
        checkPassword = scanner.nextLine();
        if (checkPassword.length() >= 8 && checkPassword.length() <= 10) {
            for (int i = 0; i < checkPassword.length(); i++) {
                if (checkPassword.charAt(i) >= '0' && checkPassword.charAt(i) <= '9') {
                    checkDigit++;
                }
                if (checkPassword.charAt(i) == '%' || checkPassword.charAt(i) == '$' || checkPassword.charAt(i) == '_') {
                    checkSign++;
                }
            }
        }
        if (checkDigit > 0 && checkSign > 0) {
            answer = true;
        }
        return answer;
    }

    public static int exam6(String str1, char ch) {
        int answer = 0;
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) == ch) {
                answer++;
            }
        }
        return answer;
    }

    public static String exam7(String str1) {
        String theLongest = "";
        String[] words;
        int temp = 0;
        int index = 0;
        words = str1.split(" ");
        for (int i = 0; i < words.length; i++) {
            if (words[i].length() > temp) {
                temp = words[i].length();
                index = i;
            }
        }
        theLongest = words[index];
        return theLongest;
    }

    public static void exam8(String str1) {
        for (int i = 1; i <= str1.length(); i++) {
            System.out.print(str1.charAt(str1.length() - i));
        }
    }

    public static char exam9(String str1, char[] chars) {
        char theMost = 0;
        str1 = str1.toUpperCase();
        int counter = 0;
        int index = 0;
        for (int i = 0; i < chars.length; i++) {
            if ((chars[i] >= 'a') && (chars[i] <= 'z')) {
                chars[i] -= 32;
            }
            int tempcounter = 0;
            int tempindex = 0;
            for (int j = 0; j < str1.length(); j++) {
                if (chars[i] == str1.charAt(j)) {
                    tempcounter++;
                    tempindex = i;
                }
            }
            if (tempcounter > counter) {
                counter = tempcounter;
                index = tempindex;
            }
        }
        theMost = chars[index];
        return theMost;
    }

    public static boolean exam10(String str1) {
        String normalString = "";
        boolean answer = false;
        str1 = str1.toUpperCase();
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) >= 'A' && str1.charAt(i) <= 'Z') {
                normalString += str1.charAt(i);
            }
        }
        for (int i = 0; i < normalString.length(); i++) {
            if (normalString.charAt(i) == normalString.charAt(normalString.length() - 1 - i)) {
                answer = true;
            } else {
                answer = false;
                break;
            }
        }
        return answer;
    }

    public static String[] exam11(String[] strings, char ch) {
        String temp = "";
        temp += ch;
        int counter = 0;
        for (int i = 0; i < strings.length; i++) {
            if (strings[i].contains(temp)) {
                counter++;
            }
        }
        String[] answer = new String[counter];
        int k = 0;
        for (int i = 0; i < strings.length; i++) {
            if (strings[i].contains(temp)) {
                answer[k] = strings[i];
                k++;
            }
        }
        //System.out.println(Arrays.toString(answer));
        return answer;
    }

    public static void exam12() {
        Scanner scanner = new Scanner(System.in);
        String userName = "";
        boolean checkUsername = true;
        String temp = "*";
        String password = "";
        boolean checkPassword = true;
        do {
            System.out.println("Enter your user name");
            userName = scanner.nextLine();
            if (userName.contains(temp)) {
                checkUsername = false;
            } else {
                checkUsername = true;
            }
        }
        while (!checkUsername);
        do {
            System.out.println("Enter your password");
            password = scanner.nextLine();
            if (password.equals(userName)) {
                checkPassword = false;
            } else {
                int checkDigit = 0;
                int checkSign = 0;
                if (password.length() >= 8 && password.length() <= 10) {
                    for (int i = 0; i < password.length(); i++) {
                        if (password.charAt(i) >= '0' && password.charAt(i) <= '9') {
                            checkDigit++;
                        }
                        if (password.charAt(i) == '%' || password.charAt(i) == '$' || password.charAt(i) == '_') {
                            checkSign++;
                        }
                    }
                }
                if (checkDigit > 0 && checkSign > 0) {
                    checkPassword = true;
                } else {
                    checkPassword = false;
                }
            }
        }
        while (!checkPassword);
        System.out.println("Username: " + userName + " password: " + password);
    }

    public static String exam13(String str1) {
        String[] strings;
        str1 = str1.toLowerCase();
        strings = str1.split(" ");
        String newString = "";
        for (int i = 0; i < strings.length; i++) {
            newString += strings[i].charAt(0);
        }
        String totalString = "";
        for (int i = 0; i < newString.length(); i++) {
            for (int j = i + 1; j < newString.length(); j++) {
                if (newString.charAt(i) == newString.charAt(j)) {
                    break;
                } else {
                    totalString += newString.charAt(i);
                    break;
                }
            }
        }
        return newString;
    }
}
