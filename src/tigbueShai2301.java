import java.util.Arrays;
// שאלה 1: (15 דקות)
//   // הגדרה: בלוק של מערך הוא רצף של תאים סמוכים שהערכים שלהם זהים.
//   //         לדוגמה: במערך הבא {3,2,2,2,5,6,6,1,3,3,3,3,1,2} ישנם שלושה בלוקים:
//   // {2,2,2}
//    {6,6}
//    {3,3,3,3}

public class tigbueShai2301 {
    public static void main(String[] args) {
        int[] array = {3, 2, 2, 2, 5, 6, 6, 1, 3, 3, 3, 3, 1, 2}; //{3,1,2,3,5,1,6,2,1,1,3,4,1,1,2,1}
        int num = 3;
        sequenceOfIdenticalValues(array, num);
        biggerSumOfIdenticalValues(array);
    }
    public static int sequenceOfIdenticalValues(int[] numbers, int num) {
        int countBlock = 1;
        int counter = 0;
        for (int i = 0; i < numbers.length - 1; i++) {
            if (numbers[i] == numbers[i + 1]) {
                countBlock++;
            } else {
                if (countBlock > 0) {
                    if (countBlock >= num) counter++;
                    countBlock = 1;
                }
            }
        }
        if (countBlock > 0) {
            if (countBlock >= num) counter++;
            countBlock = 1;
        }

        System.out.println(counter);
        return counter;
    }


    public static int[] biggerSumOfIdenticalValues(int[] numbers) {
        int countBlock = 1;
        int sum = 0;
        int biggerSum = 0;
        int index = -1;
        int araaycount = 1;
        for (int i = 0; i < numbers.length - 1; i++) {
            if (numbers[i] == numbers[i + 1]) {
                sum += numbers[i];
                countBlock++;
            } else {
                if (countBlock > 0) {
                    if (sum > biggerSum) {
                        biggerSum = sum;
                        index = numbers[i];
                        araaycount = countBlock;
                    }
                }
                countBlock = 1;
            }

        }
        int[] arrayNew = new int[araaycount];
        for (int i = 0; i < arrayNew.length; i++) {
            arrayNew[i] = index;
            System.out.print(arrayNew[i]);
        }
        return arrayNew;
    }
//    public static void blockx1(int[] array, int num) {
//        // int[] newArray = new int[];
//
//        int indexSatrt = 0;
//        int counter = 0;
//        int indexEnd = 0;
//        for (int i = 0; i < array.length - 1; i++) {
//            if (array[i] == array[i + 1]) {
//                indexSatrt = i;
//                counter++;
//                while (array[indexSatrt] == array[i + 1]) {
//                    indexEnd = i;
//                    break;
//                }
//            }
//        }
//        System.out.println(indexSatrt + " " + indexEnd);
//        //return blocks;
    }

//    public static int[] exam2(int num1, int num2, int num3){   //{1,5,7}.....{1,5,7,6,8,12,13}
//        int[] newArray={num1,num2,num3,num1+num2+num3,num1+num2,num1+num3,num2+num3};
//        newArray[0]=num1;
//        newArray[1]=num2;
//        newArray[2]=num3;
//        newArray[3]=num1+num2+num3;
//
//        for(int i=3;i<newArray.length;i++){
//            for(int j=0; j<=2;j++){
//            newArray[i]=newArray[j]+newArray[j+1];//
//        }

//        String[] blocks=new String[counetr];
//        for(int i=0;i<blocks.length;i++){
//            for(int j=0; j< array.length;j++){
//                while (array[j]==array[j+1]){
//                    indexSatrt=j;
//                    indexEnd=j+1;
//                }
//                blocks[i]+=array[j];
//            }
//        }

// }
