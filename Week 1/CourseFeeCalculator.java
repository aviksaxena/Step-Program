public class CourseFeeCalculator {
    public static void main(String[] args) {
        double courseFee = 125000;
        double discount = courseFee * 0.10;
        double discountedPrice = courseFee - discount;
        System.out.println("Discounted amount: INR " + discount);
        System.out.println("Total price after discount: INR " + discountedPrice);
    }
}