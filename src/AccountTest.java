import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AccountTest {

    @Test
    void updateBalance() {
        Account account = new Account();
        account.updateBalance(-1001);
        assertEquals(0, account.getTotalBalance());
    }
}