import java.util.Scanner;
class discount2 {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);
double fee, discountPercent;
System.out.print("Enter the total student fee (INR): ");
fee = input.nextDouble();
System.out.print("Enter the university discount percentage: ");
discountPercent = input.nextDouble();
double discount = (discountPercent / 100) * fee;
double finalFee = fee - discount;
System.out.println("The discount amount is INR " + discount + " and
final discounted fee is INR " + finalFee);
input.close();
}
}
