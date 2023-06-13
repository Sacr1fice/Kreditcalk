import static java.lang.Math.pow;

public class CreditPaymentService {
    public double calculate(double percent, int time, int credit) {
        int payment;
        double monthPercent = percent / 1200;
        double coefficient = monthPercent * pow(1 + monthPercent, time) / (pow(1 + monthPercent, time) - 1);
        payment = (int) (credit * coefficient);
        return payment;
    }
}