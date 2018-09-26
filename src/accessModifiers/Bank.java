package accessModifiers;

public class Bank implements BankTransfer {
    public final int TRANSFER_FEE=1;
    @Override
    public void transfer(BankAccount from, BankAccount to, int amount) {
        from.withdraw(amount + TRANSFER_FEE);
        to.deposit(amount);
    }
}
