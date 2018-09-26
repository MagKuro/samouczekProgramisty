package accessModifiers;

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

public class BankAccountTest {
    private BankAccount bankAccount;

    @Before
    public void setUp(){
        bankAccount = new BankAccount();
}

    @Test
    public void depositAdd300to1000() {
        bankAccount.amount = 1000;
        bankAccount.deposit(300);
        assertEquals(1300, bankAccount.amount);
    }
}