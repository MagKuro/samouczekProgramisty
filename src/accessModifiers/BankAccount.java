package accessModifiers;

public class BankAccount implements Account {
    int amount;
    @Override
    public void deposit(int amount) {
        this.amount=this.amount+amount;
    }

    @Override
    public void withdraw(int amount) {
        this.amount=this.amount-amount;
    }
}
