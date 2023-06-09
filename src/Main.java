public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        int kredit = 1_000_000;
        int srok = 36;
        double proc = 9.99;
        int platej = (int) service.calculate(proc, srok, kredit);
        System.out.println(platej);
    }
}