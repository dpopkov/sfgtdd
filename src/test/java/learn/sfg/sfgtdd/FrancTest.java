package learn.sfg.sfgtdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FrancTest {
    @Test
    void testMultiplication() {
        Money fiveFrancs = Money.franc(5);
        assertEquals(Money.franc(10), fiveFrancs.times(2));
        assertEquals(Money.franc(15), fiveFrancs.times(3));
    }

    @Test
    void testEquality() {
        Money fiveFrancs1 = Money.franc(5);
        Money fiveFrancs2 = Money.franc(5);
        assertEquals(fiveFrancs1, fiveFrancs2);
        assertEquals(fiveFrancs2, fiveFrancs1);
        assertNotEquals(fiveFrancs1, Money.franc(6));
        assertNotEquals(fiveFrancs1, Money.dollar(5));
    }

    @Test
    void testCurrency() {
        assertEquals("CHF", Money.franc(1).currency());
    }
}
