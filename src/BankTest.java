import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BankTest {

    Bank bank = new Bank();


    @Test
    void createAccount() {
        assertEquals(true, bank.CreateAccount(new Account("Mark")));
        assertEquals(false, bank.CreateAccount(new Account("Mark")));

    }
}