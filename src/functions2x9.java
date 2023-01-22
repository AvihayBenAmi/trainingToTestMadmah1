import java.util.Scanner;

public class functions2x9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice = menu();
        switch (choice) {
            case 1 -> distanceBetweenTowPoints();
            //case 2 -> lengthOfTheRestTriangle();
            //case 3 -> circumferenceAndAreaCircle();
            //case 4 -> squareArea();
            //case 5 -> rectangleArea();
        }
    }

    public static int menu() {
        Scanner scanner = new Scanner(System.in);
        int choice = 0;
        do {
            System.out.println("Welcome to GeoMath Calculator!\nplease enter your choice:\n" +
                    "1. distance between tow points\n" +
                    "2. Calculate the length of the rest in a right triangle\n" +
                    "3. Calculate the circumference and area of a circle\n" +
                    "4. Calculate square area\n" +
                    "5. Calculate rectangle area\n" +
                    "6. Exit");
            choice = scanner.nextInt();
        }
        while (choice < 1 || choice > 6);
        return choice;
    }

    public static void distanceBetweenTowPoints() {
        Scanner scanner = new Scanner(System.in);
        double x1;
        double y1;
        double x2;
        double y2;
        double distance;
        System.out.println("Enter x1 parameter");
        x1 = scanner.nextInt();
        System.out.println("Enter y1 parameter");
        y1 = scanner.nextInt();
        System.out.println("Enter x2 parameter");
        x2 = scanner.nextInt();
        System.out.println("Enter y2 parameter");
        y2 = scanner.nextInt();
        distance = (Math.pow((x1 - x2), 2)) + (Math.pow((y1 - y2), 2));
        distance = Math.sqrt(distance);
        System.out.println("The distance between (x1,y1),(x2,y2) is " + distance);
    }
}
