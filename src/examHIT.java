import java.util.Scanner;

public class examHIT {
    public static void main(String[] args) {
        System.out.println(exam1());

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
}
