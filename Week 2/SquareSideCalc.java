import java.util.Scanner;

public class SquareSideCalc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the perimeter of the square: ");
        double perimeter = scanner.nextDouble();
        double side = perimeter / 4;
        System.out.println("The side of the square is: " + side);
        scanner.close();
    }
}
