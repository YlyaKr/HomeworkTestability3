public class Main {
    public static void main(String[] args) {

        CreditPaymentService service = new CreditPaymentService();

        double payment1 = service.calculate(1_000_000, 1);
        System.out.println("Ежемесячный платеж составляет: " + String.format("%.0f", payment1));

        double payment2 = service.calculate(1_000_000, 2);
        System.out.println("Ежемесячный платеж составляет: " + String.format("%.0f", payment2));

        double payment3 = service.calculate(1_000_000, 3);
        System.out.println("Ежемесячный платеж составляет: " + String.format("%.0f", payment3));
    }
}