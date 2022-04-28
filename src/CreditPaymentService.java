public class CreditPaymentService {
    public double calculate(int sum, int years) {
        int months = years * 12;
        double percent = 9.99;
        double monthlyPercent = percent / (100 * 12);

        double payment = sum * (monthlyPercent / (1 - Math.pow((1 + monthlyPercent), -months)));
        return payment;
    }
}
