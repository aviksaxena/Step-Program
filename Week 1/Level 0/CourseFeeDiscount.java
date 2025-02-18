import java.util.Scanner;

public class CourseFeeDiscount {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the student fee: ");
        double courseFee = input.nextDouble();
        System.out.print("Enter the university discount percentage: ");
        double discountPercentage = input.nextDouble();
        double discount = (discountPercentage / 100) * courseFee;
        double discountedPrice = courseFee - discount;
        System.out.println("Discounted amount: INR " + discount);
        System.out.println("Total price after discount: INR " + discountedPrice);
        input.close();
    }
}
