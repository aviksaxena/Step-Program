import java.util.Scanner;

public class TriangleRun {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter side 1 in meters: ");
        double side1 = scanner.nextDouble();
        System.out.print("Enter side 2 in meters: ");
        double side2 = scanner.nextDouble();
        System.out.print("Enter side 3 in meters: ");
        double side3 = scanner.nextDouble();
        
        double perimeter = side1 + side2 + side3;
        double rounds = 5000 / perimeter;
        
        System.out.println("The athlete must complete " + Math.ceil(rounds) + " rounds to complete 5 km.");
    }
}
