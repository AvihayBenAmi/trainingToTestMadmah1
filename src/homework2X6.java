import java.util.Scanner;

public class homework2X6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String quadric;
        boolean checkValid = false;
        int parameterA = 0;
        int parameterB = 0;
        int parameterC = 0;
        System.out.println("Enter you quadric in format");
        quadric = scanner.nextLine();
        checkValid = validate(quadric);
        if (checkValid) {
            parameterA = parameterA(quadric);
            parameterB = parameterB(quadric);
            parameterC = parameterC(quadric);
            calculate(parameterA, parameterB, parameterC);
        } else {
            System.out.println("the quadric you entered is not by the format");
        }
    }
    public static boolean validate(String quadric) {
        boolean check = false;
        String valid1 = "x^2+";
        String valid2 = "x^2-";
        String valid3 = "x+";
        String valid4 = "x-";
        String valid5 = "=0";
        if (quadric.contains(valid1) || quadric.contains(valid2)) {
            if (quadric.contains(valid3) || quadric.contains(valid4)) {
                if (quadric.contains(valid5)) {
                    check = true;
                }
            }
        }
        return check;
    }

    public static int parameterA(String quadric) {
        int aParameter = 0;
        int index = 0;
        String subS = "";
        index = quadric.indexOf("x^2");
        subS = quadric.substring(0, index);
        if (subS.equals("-")) {
            aParameter = -1;
        } else if (subS.equals("")){
            aParameter = 1;
    }
        else {
            aParameter = Integer.parseInt(subS);
        }
        return aParameter;
    }

    public static int parameterB(String quadric) {
        int bParameter = 0;
        int index2 = 0;
        int indexx = 0;
        String subS = "";
        index2 = quadric.indexOf("x^2");
        subS = quadric.substring(index2 + 3, quadric.length());
        indexx = subS.indexOf("x");
        subS = subS.substring(0, indexx);
        if (subS.equals("-")) {
            bParameter = -1;
        } else if(subS.equals("")) {
            bParameter=1;
        }
        else{
        bParameter = Integer.parseInt(subS);}
        return bParameter;
    }

    public static int parameterC(String quadric) {
        int cParameter = 0;
        int index2 = 0;
        int indexx = 0;
        int index0 = 0;
        String subS = "";
        index2 = quadric.indexOf("x^2");
        subS = quadric.substring(index2 + 3, quadric.length());
        indexx = subS.indexOf("x");
        subS = subS.substring(indexx + 1, subS.length());
        index0 = subS.indexOf("=0");
        subS = subS.substring(0, index0);
        if (subS.equals("-")) {
            cParameter = -1;
        } else if(subS.equals("")) {
            cParameter=1;
        }
        else{ cParameter = Integer.parseInt(subS);}
        return cParameter;
    }

    public static void calculate(int parameterA, int parameterB, int parameterC) {
        double sqrt = 0;
        double x1 = 0;
        double x2 = 0;
        sqrt = (Math.pow(parameterB, 2)) - 4 * (parameterA * parameterC);
        if (sqrt > 0) {
            x1 = (-parameterB + (Math.sqrt(sqrt))) / (2 * parameterA);
            x2 = (-parameterB - (Math.sqrt(sqrt))) / (2 * parameterA);
            if (x1 == x2) {
                System.out.println("There is one solotion to this quadric: x1=" + x1);
            } else {
                System.out.println("There is tow solotions to this quadric: x1: " + x1 + " x2: " + x2);
            }
        } else {
            System.out.println("There are no solotions to this quadric");
        }
    }
}
