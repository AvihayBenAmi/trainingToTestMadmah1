import java.util.Arrays;

public class testshai {
    public static void main(String[] args) {
        int n = 17;
        int[] array = {1, 2, 3, 4, 1, 4, 5, 2, 5};
        int[] array2 = {1, 2, 3, 4, 1, 4, 5, 2, 5, 6};
        examPrime(n);

    }

    public static int exam1(int n) {
        int newNum = 0;
        //int tempNum=n;
        //int counter=0;
        String temp = "";
        String temp2 = "";
        while (n != 0) {
            temp += n % 10;
            n = n / 10;
        }
        for (int i = 0; i < temp.length(); i += 2) {
            temp2 += temp.charAt(temp.length() - 2 - i);
            temp2 += temp.charAt(temp.length() - 1 - i);
        }
//        while(tempNum!=0){
//            counter++;
//            tempNum=tempNum/10;
//        }
//        int[] tempArray=new int[counter];
//        for(int i=1;i<=tempArray.length;i++){
//            tempArray[tempArray.length-i]=n%10;
//            n=n/10;
//        }
//        int[] tempArray2=new int[tempArray.length];
//        for(int i=0;i<tempArray.length;i+=2){
//            tempArray2[i]=tempArray[i+1];
//            tempArray2[i+1]=tempArray[i];
//        }
//        String temp="";
//        for(int i=0;i<tempArray2.length;i++){
//            temp+=tempArray2[i];
//        }
        newNum = Integer.parseInt(temp2);
        System.out.println(newNum);
        return newNum;
    }

    public static int exam2(int[] array) {
        int counter = 1;
        int bigCounter = 0;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] < array[i + 1]) {
                counter++;
            } else {
                if (counter > 1) {
                    bigCounter++;
                    counter = 1;
                }
            }
        }
        if (counter > 1) {
            bigCounter++;
            counter = 1;
        }
        System.out.println(bigCounter);
        return bigCounter;
    }

    public static int exam2x2(int[] array) {
        int counter = 1;
        int bigCounter = 0;
        int index = 0;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] < array[i + 1]) {
                counter++;
            } else {
                if (counter > bigCounter) {
                    if (counter > bigCounter) {
                        bigCounter = counter;
                        index = i;
                        counter = 0;
                    }
                }
            }
            if (i == array.length - 1) {
                if (counter > 1) {
                    bigCounter++;
                    counter = 1;
                }
            }
        }
        int[] biggest = new int[bigCounter];
        for (int i = 0; i < biggest.length; i++) {
            biggest[i] = array[index - bigCounter + i + 1];
        }
        System.out.println(Arrays.toString(biggest));
        return bigCounter;
    }

    public static int[] exam2x3(int[] arr1, int[] arr2) {
        int[] shortArr1 = checkShortestArray(arr1);
        int[] shortArr2 = checkShortestArray(arr2);
        int[] answer;
        if (shortArr1.length < shortArr2.length) {
            answer = new int[shortArr1.length];
            answer = shortArr1;
        } else if (shortArr2.length < shortArr1.length) {
            answer = new int[shortArr2.length];
            answer = shortArr2;
        } else {
            answer = null;
        }
        System.out.println(Arrays.toString(answer));
        return answer;
    }

    public static int[] checkShortestArray(int[] arr) {
        int counter = 1;
        int smallCounter = 0;
        int index = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] < arr[i + 1]) {
                counter++;
            } else {
                if (smallCounter == 0) {
                    smallCounter = counter;
                    counter = 1;
                    index = i;
                } else if (counter < smallCounter) {
                    smallCounter = counter;
                    index = i;
                    counter = 1;
                }
            }
            if (i == arr.length - 2) {
                if (counter < smallCounter) {
                    smallCounter = counter;
                    index = i;
                }
            }
        }
        int[] shorttest = new int[smallCounter];
        for (int i = 0; i < shorttest.length; i++) {
            shorttest[i] = arr[index - smallCounter + i + 1];
        }
        //System.out.println(Arrays.toString(shorttest));
        return shorttest;
    }

    public static boolean isPr(int number) {
        boolean isPrime = true;
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }

    public static int[] examPrime(int number) {
        int k = 0;
        int counter = 0;
        for (int i = 2; i < number; i++) {
            if (isPr(i)) {
                counter++;
            }
        }
        int[] primeNumbers = new int[counter];
        for (int i = 2; i < number; i++) {
            if (isPr(i)) {
                primeNumbers[k] = i;
                k++;
            }
        }
        k = 0;
        int[] newArray = new int[counter];
        counter = 0;
        int originalNumber = 0;
        int tempNumber = number;
        while (number > 1 && number != originalNumber) {
            originalNumber = number;
            for (int i = 0; i < primeNumbers.length; i++) {
                if ((number % primeNumbers[i]) == 0) {
                    newArray[k] = primeNumbers[i];
                    k++;
                    number = number / primeNumbers[i];
                    counter++;
                }
            }
        }
        int [] answer=new int[1];
        if (number > 1) {
            answer[0] =tempNumber;
        } else {
            answer = new int[counter];
            k = 0;
            for (int i = 0; i < newArray.length; i++) {
                if (newArray[i] != 0) {
                    answer[k] = newArray[i];
                    k++;
                }
            }
        }
        System.out.println(Arrays.toString(answer));
        return answer;
    }
}