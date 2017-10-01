package mpp.standard.exam2.src.prob2;

public class SavingsAccount extends Account {
    private double balance;
    private double interestRate;
    private String acctId;

    public SavingsAccount(final String acctId, final double interestRate, final double startBalance){
        this.acctId = acctId;
        this.balance = startBalance;
        this.interestRate = interestRate;
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
        return balance + (interestRate * balance);
    }
}
