import static java.lang.Math.pow;

public class CreditPaymentService {
    public double calculate (double proc , int srok, int kredit) {
        int platej;
        double mesproc = proc / 1200;
        double koeff = mesproc * pow(1+mesproc,srok) / (pow(1+mesproc,srok)-1);
        platej = (int) (kredit * koeff);
        return platej;
    }
}