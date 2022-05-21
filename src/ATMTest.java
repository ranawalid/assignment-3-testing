
import org.junit.jupiter.api.Test;
import static org.junit.Assert.*;
public class ATMTest {
    @Test
    public void check() {
        ATMMACHINE atm = new ATMMACHINE();
        assertEquals(1,atm.withdraw(20));
    }
    @Test
    public void check1() {
        ATMMACHINE atm1 = new ATMMACHINE();
        assertEquals(1,atm1.withdraw(20000));
    }
    @Test
    public void check2() {
        ATMMACHINE atm2 = new ATMMACHINE();
        assertEquals(0,atm2.withdraw(20));
    }
}