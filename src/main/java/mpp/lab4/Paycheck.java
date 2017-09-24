package temp.lab4;

public class Paycheck {
    private final double grossPay;
    private final double fica;
    private final double state;
    private final double local;
    private final double medicare;
    private final double socialSecurity;

    public Paycheck(final double grossPay, final double fica, final  double state,
                    final double local, final  double medicare, final double socialSecurity){
        this.grossPay = grossPay;
        this.fica = fica;
        this.state = state;
        this.local = local;
        this.medicare = medicare;
        this.socialSecurity = socialSecurity;
    }

    public double getGrossPay() {
        return grossPay;
    }

    public double getFica() {
        return fica;
    }

    public double getState() {
        return state;
    }

    public double getLocal() {
        return local;
    }

    public double getMedicare() {
        return medicare;
    }

    public double getSocialSecurity() {
        return socialSecurity;
    }

    private double getAllTaxCut(){
        return fica + socialSecurity + medicare + state + local;
    }

    public double getNetPay(){
        return grossPay - grossPay * getAllTaxCut();
    }
}
