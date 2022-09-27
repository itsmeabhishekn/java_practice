public class BankAccount {
    private String owner;
    private double balance;

    public BankAccount(String owner,double startingBalance){
        this.owner = owner;
        this.balance = Math.max(0,startingBalance);
    }

    public String getOwner(){
        return owner;
    }

    public double getBalance(){
        return balance;
    }

    public double deposit(double amountToDeposit) {
        if (amountToDeposit > 0) {
            this.balance = this.balance + amountToDeposit;

        }
        return amountToDeposit;
    }

    public double withDraw(double amountToWithdraw){
        if(amountToWithdraw<=this.balance){
            this.balance=  this.balance-amountToWithdraw;
        }
        return 0;
    }


}
