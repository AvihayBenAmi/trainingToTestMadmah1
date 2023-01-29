import java.util.Scanner;

public class examHIT {
    public static void main(String[] args) {
        String str = "bssdffFdcrrrtttii";
        noDuplicate(str);
        System.out.println();
        //commonMaxDenominator(array2);
        //System.out.println(exam2(array1,array2,num));
        fixText(str);
        System.out.println();
        exam4(str);

    }

    public static int exam1() {
        Scanner scanner = new Scanner(System.in);
        int flag = 0;
        int number;
        int counter = 0;
        boolean smaller = false;
        do {
            System.out.println("Enter number");
            number = scanner.nextInt();
        }
        while (number < 9);
        int temp = number;
            while (temp > 0) {
                counter++;
                temp /= 10;
            }
        temp = number;
        int[] array = new int[counter];
        for (int i = 0; i < array.length; i++) {
            array[i] = temp % 10;
            temp /= 10;
        }//number = 1234 array = /4321
        for (int i = 0; i < array.length-1; i++) {
            if(array[i]<array[i+1]){
                flag = -1;
                smaller = true;
            }else{
                flag = 0;
                smaller = false;
                break;
            }
        }if(!smaller){
            for (int i = 0; i < array.length-1; i++) {
                if(array[i]>array[i+1]){
                    flag = 1;
                }else{
                    flag = 0;
                    break;
                }
            }
        }
        return flag;
    }

    public static int exam2(int[] array1, int[] array2, int num) {
        boolean check = true;
        int location = 0;
        boolean isBigger = true;
        if (array1.length == num) {
            isBigger = false;
        }
        for (int i = 0; i < num; i++) {
            if (array1[i] != array2[i]) {
                check = false;
                if (isBigger) {
                    location = array1[i];
                } else {
                    location = array2[i];
                }
                break;
            }
        }
        if (check) {
            if (isBigger) {
                location = array1[array2.length - 1];
            } else {
                location = array2[array1.length - 1];
            }
        }
        return location;
    }

    public static void exam3() {
        int num;
        String str = "5*5";


    }

    public static int commonMaxDenominator(int[] numbers) {
        int minDenominator = minNum(numbers);
        boolean check;
        do {
            check = true;
            for (int i = 0; i < numbers.length; i++) {
                if (numbers[i] % minDenominator != 0) check = false;
            }
            if (!check) minDenominator--;
        } while (!check);
        System.out.println(minDenominator);
        return minDenominator;
    }

    public static int minNum(int[] numbers) {
        int minNum = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (minNum > numbers[i]) minNum = numbers[i];
        }
        return minNum;
    }


    public static int divisior(int[] array) {
        int lowest = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < lowest) {
                lowest = array[i];
            }
        }
        int lowestDenominator = 1;
        for (int i = lowest; i > 0; i--) {
            int counter = 0;
            for (int t = 0; t < array.length; t++) {
                if (array[t] % i == 0) {
                    counter++;
                } else {
                    counter = 0;
                    break;
                }
            }
            if (counter == array.length) {
                lowestDenominator = i;
                break;
            }
        }
        return lowestDenominator;

    }

    public static String fixText(String text) {
        String newText = "";
        for (int i = 0; i < text.length() - 1; i++) {
                if (text.charAt(i) != text.charAt(i + 1)) {
                    newText += text.charAt(i);
                } else if (i + 1 == text.length() - 1) newText += text.charAt(i);
        }
        System.out.println(newText);
        return newText;
    }



        public static String exam4(String str1){
            String newString = "";
            for (int i = 0; i < str1.length() - 1; i++) {
                if (str1.charAt(i) != str1.charAt(i + 1)) {
                    newString += str1.charAt(i);}
                    else if((i+1==str1.length() - 1)){
                        newString += str1.charAt(i);
                }
            }
            System.out.println(newString);
            return newString;
        }
    public static String noDuplicate(String str){
        String newString ="";
        int j = 0;
        for(int i = 0;i<str.length();i++){
            if(str.charAt(i)!=newString.charAt(j)){
                newString+=str.charAt(i);
                j++;
            }
        }
        System.out.print(newString);

        return newString;
    }
    public static String letterInText(String text){
        String [] newText=text.split(" ");
        String firstLetter="";
        boolean check=true;
        for(int i=0;i<newText.length;i++){
            for(int t=0;t<firstLetter.length();t++){
                if(newText[i].charAt(0)==firstLetter.charAt(t)){
                    check=false;
                }
            }
            if(check){
                firstLetter+=newText[i].charAt(0);
            }
            check=true;
        }
        System.out.println(firstLetter);
        return firstLetter;
    }

}
