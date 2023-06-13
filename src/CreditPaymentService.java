import static java.lang.Math.pow;

public class CreditPaymentService {
    public double calculate(double percent, int time, int credit) {
        int payment;
        double month_percent = percent / 1200;
        double coefficient = month_percent * pow(1 + month_percent, time) / (pow(1 + month_percent, time) - 1);
        payment = (int) (credit * coefficient);
        return payment;
    }
}