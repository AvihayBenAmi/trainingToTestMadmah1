import java.util.Random;
import java.util.Scanner;

public class functions2x8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int player1turns = 0;
        int player2turns = 0;
        boolean player1=false;
        boolean player2=false;
        int randomNumber = randomNumber();
        System.out.println(randomNumber);
        do {
            player1turns++;
            player1=turn(1,randomNumber);
            if(player1){
                System.out.println("After "+player1turns+" turns");
                break;
            }
            player2turns++;
            player2=turn(2,randomNumber);
            if(player2){
                System.out.println("After "+player2turns+" turns");
                break;
            }
        }
        while (!player1||!player2);
    }

    public static int randomNumber() {
        Random random = new Random();
        int randomNumber = 0;
        randomNumber = random.nextInt(1, 1000);
        return randomNumber;
    }

    public static boolean turn(int playerNumber, int randomNumber) {
        Scanner scanner = new Scanner(System.in);
        int playerGuess = 0;
        boolean isWon = false;
        System.out.println("Player " + playerNumber + ", guess a number");
        playerGuess = scanner.nextInt();
        if (playerGuess == randomNumber) {
            System.out.print("Player " + playerNumber + ", you won! ");
            isWon = true;
        } else {
            if (playerGuess > randomNumber) {
                System.out.println("your number that you guess is bigger than thr random number");
            } else {
                System.out.println("your number that you guess is smaller than thr random number");
            }
        }
        return isWon;
    }
}
