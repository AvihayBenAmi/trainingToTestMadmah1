import java.util.Random;
import java.util.Scanner;

public class homework2X7 {
    public static void main(String[] args) {
        int userRace = 0;
        int userTurns = 0;
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        do {
            System.out.println("please choose between the options: \n" +
                    "1. easy - 20 opportunities \n" +
                    "2. medium - 15 opportunities \n" +
                    "3. hard - 10 opportunities \n" +
                    "4. surprise - random between 5-25 opportunities ");
            userRace = scanner.nextInt();
        }
        while (userRace < 1 || userRace > 4);
        switch (userRace) {
            case 1 -> userTurns = 20;
            case 2 -> userTurns = 15;
            case 3 -> userTurns = 10;
            case 4 -> userTurns = random.nextInt(5, 25);
        }
        boolean ifWinner=false;
        String rnd = randomCode();
        String userGuess="";
        while (userTurns > 0||!ifWinner) {
            userGuess= userGuessValid();
            int ifDoubleDigit = checkIfDouble(userGuess);
            if (ifDoubleDigit == 1) {
                System.out.println("You enter number twice in your guess you abort 2 opportunities");
                userTurns -= 2;
            }
            userTurns--;
            ifWinner=game(rnd,userGuess);
            if(!ifWinner&&userRace!=4){
                System.out.println("You left "+userTurns+ " turns");
            }
            if(ifWinner){
                System.out.println("congrates, you won!");
                break;
            }
        }
        if(userTurns==0){
            System.out.println("You lose, the code is "+rnd);

        }

    }

    public static String randomCode() {
        Random random = new Random();
        String code = "";
        boolean check = true;
        do {
            for (int i = 0; i < 4; i++) {
                check = true;
                code += random.nextInt(1, 6);
            }
            for (int i = 0; i < code.length(); i++) {
                for (int j = i + 1; j < code.length(); j++) {
                    if (code.charAt(j) == code.charAt(i)) {
                        check = false;
                        break;
                    }
                }
                if (!check) {
                    code = "";
                    break;
                }
            }
        }
        while (!check);
        return code;
    }

    public static String userGuessValid() {
        boolean answer = true;
        String userGuess = "";
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Enter a 4 Digit Number, the digits between 1-6");
            userGuess = scanner.nextLine();
            if (userGuess.length() != 4) {
                answer = false;
            } else {
                for (int i = 0; i < userGuess.length(); i++) {
                    if (userGuess.charAt(i) < 1 && userGuess.charAt(i) > 6) {
                        answer = false;
                        break;
                    }
                }
            }
        }
        while (!answer);
        return userGuess;
    }

    public static int checkIfDouble(String userGuess){
        int checkIfDouble=0;
        for (int i = 0; i < userGuess.length(); i++) {
            for (int j = i + 1; j < userGuess.length(); j++) {
                if (userGuess.charAt(j) == userGuess.charAt(i)) {
                    checkIfDouble = 1;
                    break;
                }
            }
            if (checkIfDouble == 1) {
                break;
            }
        }
        return checkIfDouble;
    }

    public static boolean game(String randomCode, String userGuess){
        boolean answer=false;
        int currectCounter = 0;
        int approxCounter = 0;
        for (int i = 0; i < userGuess.length(); i++) {
            if (userGuess.charAt(i) == randomCode.charAt(i)) {
                currectCounter++;
            }
        }
        for(int i=0;i<userGuess.length();i++){
            for(int j=1;j<userGuess.length();j++) {
                if (randomCode.charAt(i) != userGuess.charAt(i)) {
                    if (randomCode.charAt(i) == userGuess.charAt(j)) {
                        approxCounter++;
                    }
                }
            }
        }
        System.out.println(currectCounter+" currect, and "+approxCounter+" approx");
        if(currectCounter==4){
            answer=true;
        }
        return answer;
    }
}
