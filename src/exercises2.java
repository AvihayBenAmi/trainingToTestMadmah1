public class exercises2 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 5, 5, 5, 4, 4, 4};
        int num = 2;
        System.out.println(exam1(numbers, num));

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

}
