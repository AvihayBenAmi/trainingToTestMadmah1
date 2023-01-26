import java.util.Random;
import java.util.Scanner;

public class Strings1x2 {
    public static void main(String[] args) {
        wordle();
    }

    public static void wordle() {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        String randomWord = "";
        String guessWord;
        String answer = "";
        for (int i = 0; i <= 4; i++) {
            char ch = (char) (random.nextInt(26) + 'A');
            randomWord += ch;
        }
        System.out.println("Guess Word please");
        guessWord = scanner.nextLine();
        if (guessWord.length() == 5) {
            for (int i = 0; i < guessWord.length(); i++) {
                if (guessWord.charAt(i) == randomWord.charAt(i)) {
                    answer += 'V';
                } else {
                    boolean isBeen = false;
                    for (int j = 0; j < guessWord.length(); j++) {
                        if (guessWord.charAt(i) == randomWord.charAt(j)) {
                            answer += 'X';
                            isBeen = true;
                            break;
                        }
                    }
                    if (!isBeen) {
                        answer += '_';
                        break;
                    }
                }
            }
        }
        System.out.println(answer);
    }
}
