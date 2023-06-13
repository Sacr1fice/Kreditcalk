public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        int credit = 1_000_000;
        int time = 24;
        double percent = 9.99;
        int payment = (int) service.calculate(percent, time, credit);
        System.out.println(payment);
    }
}