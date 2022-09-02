import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AccountTest {

    Account account = new Account("malene");
    Account account1 = new Account("palle",100);


    @Test
    void deposit() {
        assertEquals(100, account.deposit(100));
        assertEquals(200, account.deposit(100));
        assertEquals(200, account.deposit(-100));
    }

    @Test
    void withdraw() {
        assertEquals(100, account1.withdraw(-100));
        assertEquals(100, account1.withdraw(1000));
        assertEquals(0, account1.withdraw(100));
    }
}