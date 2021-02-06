package hermetization;
//aby nie można było podmienić w miejsce GringotBank klasyt wyprowadzonej z niej
//należy dodać final przed klasą
//public class GringotBank extends Bank {


public class GringotBank extends Bank {
    private int balance;
    @Override
    public String credit(int amount) {
        if(amount < 0){
            return "No change. Invalid amount";
        }
        balance += amount;
        return "Account changed";
    }

    @Override
    public String debit(int amount) {
        if(amount < 0){
            return "No change. Invalid amount.";
        }
        if (balance - amount < 0){
            return "No change. Not enough balance.";
        }
        balance -= amount;
        return "Account changed";
    }

    @Override
    public int balance() {
        return balance;
    }
}
