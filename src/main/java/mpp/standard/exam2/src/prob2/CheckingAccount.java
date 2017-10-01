package mpp.standard.exam2.src.prob2;

public class CheckingAccount extends Account{

    private double balance;
    private double monthlyFee;
    private String acctId;

    public CheckingAccount(final String acctId, final double monthlyFee, final double startBalance){
        this.acctId = acctId;
        this.monthlyFee = monthlyFee;
        this.balance = startBalance;
    }

    @Override
    public String getAccountId() {
        return acctId;
    }

    @Override
    public double getbalance() {
        return balance;
    }

    @Override
    public double computeUpdatedBalance() {
        return balance - monthlyFee;
    }
}
