import java.util.Arrays;
import java.util.Scanner;

public class homework2 {
    public static void main(String[] args) {
        int[] array = {10,9,8,11,10,9,4,2,1};
        exam4(array);
    }

    public static void exam1() {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[10];
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Enter number");
            numbers[i] = scanner.nextInt();
            sum += numbers[i];
        }
        sum = sum / 10;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > sum) {
                System.out.print(numbers[i] + ", ");
            }
        }
    }

    public static int[] exam3(int[] array) {
        int duplicateCounter = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < +i; j++) {
                if (i != j) {
                    if (array[j] == array[i]) {
                        duplicateCounter++;
                        break;
                    }
                }
            }
        }
        int[] noDuplicates = new int[array.length - duplicateCounter];
        noDuplicates[0] = array[0];
        int seen = 0;
        int k = 1;
        for (int i = 1; i < array.length; i++) {
            for (int j = 0; j <= k; j++) {
                if (array[i] == array[j]) {
                    seen++;
                }
            }
            if (seen == 0) {
                noDuplicates[k] = array[i];
                k++;
            }
            seen = 0;
        }
        System.out.println(Arrays.toString(noDuplicates));
        return noDuplicates;
    }
    public static int exam4(int[] array){
        int index=0;
        for(int i=0;i<array.length;i++){
            if(array[i]>array[i+1]){
                index=i;
                break;
            }
        }
        for(int i=index;i<array.length-1;i++){
            if(array[i]<array[i+1]) {
                index = -1;
                break;
            }
        }
        System.out.println(index);
        return index;
    }
}
