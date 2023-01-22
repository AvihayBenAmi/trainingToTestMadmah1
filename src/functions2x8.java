import java.util.Random;
import java.util.Scanner;

public class functions2x8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int player1turns = 0;
        int player1Guess = 0;
        int player2turns = 0;
        int player2Guess = 0;
        int randomNumber = randomNumber();
        System.out.println(randomNumber);
        do {
            System.out.println("Player 1, guess a number");
            player1Guess = scanner.nextInt();
            player1turns++;
            if (player1Guess == randomNumber) {
                System.out.println("Player 1, you won! after " + player1turns + " turns");
                break;
            } else {
                if (player1Guess > randomNumber) {
                    System.out.println("your number that you guess is bigger than thr random number");
                } else {
                    System.out.println("your number that you guess is smaller than thr random number");
                }
            }
            System.out.println("Player 2, guess a number");
            player2Guess = scanner.nextInt();
            player1turns++;
            if (player2Guess == randomNumber) {
                System.out.println("Player 2, you won! after " + player2turns + " turns");
                break;
            } else {
                if (player2Guess > randomNumber) {
                    System.out.println("your number that you guess is bigger than thr random number");
                } else {
                    System.out.println("your number that you guess is smaller than thr random number");
                }
            }
        }
        while ((player1Guess != randomNumber) || (player2Guess != randomNumber));
    }

    public static int randomNumber() {
        Random random = new Random();
        int randomNumber = 0;
        randomNumber = random.nextInt(1, 1000);
        return randomNumber;
    }

}
