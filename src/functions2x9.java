import javax.annotation.processing.SupportedSourceVersion;
import java.util.Scanner;

public class functions2x9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice = menu();
        switch (choice) {
            case 1 -> distanceBetweenTowPoints();
            case 2 -> lengthOfTheRestTriangle();
            case 3 -> perimeterAndAreaCircle();
            case 4 -> squareArea(choice);
            case 5 -> squareArea(choice);
        }
    }

    public static int menu() {
        Scanner scanner = new Scanner(System.in);
        int choice = 0;
        do {
            System.out.println("Welcome to GeoMath Calculator!\nplease enter your choice:\n" +
                    "1. distance between tow points\n" +
                    "2. Calculate the length of the rest in a right triangle\n" +
                    "3. Calculate the perimeter and area of a circle\n" +
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
        menu();
    }

    public static void lengthOfTheRestTriangle() {
        Scanner scanner = new Scanner(System.in);
        double a;
        double b;
        double c;
        System.out.println("Enter A rib");
        a = scanner.nextInt();
        System.out.println("Enter B rib");
        b = scanner.nextInt();
        c = ((Math.pow(a, 2)) + (Math.pow(b, 2)));
        c = Math.sqrt(c);
        System.out.println("The rest of Triangle is =" + c);
        menu();
    }

    public static void perimeterAndAreaCircle() {
        Scanner scanner = new Scanner(System.in);
        int radius;
        double perimeter;
        double area;
        System.out.println("Enter Radius");
        radius = scanner.nextInt();
        perimeter = 2 * Math.PI * radius;
        area = Math.PI * radius * radius;
        System.out.println("The circle perimeter is =" + perimeter + "\n" +
                "The circle area is =" + area);
        menu();
    }

    public static void squareArea(int choice) {
        Scanner scanner = new Scanner(System.in);
        int ribA;
        int ribB;
        int area;
        System.out.println("Enter rib");
        ribA = scanner.nextInt();
        if (choice == 4) {
            area = ribA * ribA;
            System.out.println("The square area is = " + area);
            menu();
        }
        if (choice == 5) {
            System.out.println("Enter rib B rectangle");
            ribB = scanner.nextInt();
            area = ribA * ribB;
            System.out.println("The rectangle area is = " + area);
            menu();
        }
    }
}
