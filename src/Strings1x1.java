import java.util.Scanner;

public class Strings1x1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String id;
        boolean answer = false;
        System.out.println("Enter ID number");
        id = scanner.nextLine();
        answer = checkId(id);
        System.out.println(answer);
    }

    public static boolean checkId(String id) {
        boolean answer = false;
        int[] idNum = new int[id.length()];
        int[] weight = {1, 2, 1, 2, 1, 2, 1, 2};
        //int[] sum=new int[idNum.length-1];
        int sum = 0;
        if (id.length() == 9) {
            for (int j = 0; j < id.length(); j++) {
                if (id.charAt(j) < '0' || id.charAt(j) > '9') {
                    answer = false;
                    break;
                }
            }
            for (int i = 0; i < id.length(); i++) {
                char ch = id.charAt(i);
                idNum[i] = ch - 48;
            }
            for (int k = 0; k < weight.length; k++) {
                if (idNum[k] * weight[k] <= 9) {
                    sum += idNum[k] * weight[k];
                } else {
                    int temp = ((idNum[k] * weight[k]) % 10) + ((idNum[k] * weight[k] / 10 % 10));
                    sum += temp;
                }
            }
            if (sum - sum % 10 + 10 - sum == idNum[idNum.length - 1]) {
                answer = true;
            }
        } else {
            answer = false;
        }
        return answer;
    }
}