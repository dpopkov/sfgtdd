package learn.sfg.sfgtdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MoneyTest {

    @Test
    void testMultiplication() {
        Money fiveDollars = Money.dollar(5);
        assertEquals(Money.dollar(10), fiveDollars.times(2));
        assertEquals(Money.dollar(15), fiveDollars.times(3));

        Money fiveFrancs = Money.franc(5);
        assertEquals(Money.franc(10), fiveFrancs.times(2));
        assertEquals(Money.franc(15), fiveFrancs.times(3));
    }

    @Test
    void testEquality() {
        Money fiveDollars = Money.dollar(5);
        assertEquals(fiveDollars, Money.dollar(5));
        assertNotEquals(fiveDollars, Money.dollar(6));
        assertNotEquals(fiveDollars, Money.franc(5));

        Money fiveFrancs = Money.franc(5);
        assertEquals(fiveFrancs, Money.franc(5));
        assertNotEquals(fiveFrancs, Money.franc(6));
        assertNotEquals(fiveFrancs, Money.dollar(5));
    }

    @Test
    void testCurrency() {
        assertEquals("USD", Money.dollar(1).currency());
        assertEquals("CHF", Money.franc(1).currency());
    }
}
