import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BankTest {
    Bank bank = new Bank();

    @Test
    void createAccount() {
        assertEquals(true, bank.createAccount(new Account("Mark")));
        assertEquals(false, bank.createAccount(new Account("Mark")));
    }
}