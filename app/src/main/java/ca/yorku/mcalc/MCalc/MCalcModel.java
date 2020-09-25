// Student: Quang Tran (ID: 217 078 205).
// This lab was done individually.

package ca.yorku.mcalc.MCalc;

public class MCalcModel
{
    private double p;      // principle
    private int n;         // amortization (converted into months)
    private double r;       // interest rate (monthly)

    public MCalcModel(String a, String b, String c) {
        p = Double.parseDouble(a);        // accept input a and convert it to double p
        n = Integer.parseInt(b) * 12;
        r = (Double.parseDouble(c) / 12) / 100;     // accept input c (percent) and convert it to monthly percentage)
    }

    public String computePayment() {
        double result = 1;     // initial value of result - will be changed later
        double numerator = r * p;
        double denominator = 1 - (Math.pow(1 + r, -n));
        result = (numerator) / (denominator);
        return String.format("%,.2f", result);
    }
}

