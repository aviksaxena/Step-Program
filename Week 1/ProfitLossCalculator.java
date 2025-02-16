public class ProfitLossCalculator {
    public static void main(String[] args) {
        double costPrice = 129;
        double sellingPrice = 191;
        double profitOrLoss = sellingPrice - costPrice;
        double percentage = (profitOrLoss / costPrice) * 100;
        System.out.println("Profit/Loss: " + profitOrLoss);
        System.out.println("Percentage: " + percentage + "%");
    }
}
