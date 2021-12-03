package learn.sfg.sfgtdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DollarTest {

    @Test
    void testMultiplication() {
        Money fiveDollars = Money.dollar(5);
        assertEquals(Money.dollar(10), fiveDollars.times(2));
        assertEquals(Money.dollar(15), fiveDollars.times(3));
    }

    @Test
    void testEquality() {
        Money fiveDollars1 = Money.dollar(5);
        Money fiveDollars2 = Money.dollar(5);
        assertEquals(fiveDollars1, fiveDollars2);
        assertEquals(fiveDollars2, fiveDollars1);
        assertNotEquals(fiveDollars1, Money.dollar(6));
        assertNotEquals(fiveDollars1, Money.franc(5));
    }
}
