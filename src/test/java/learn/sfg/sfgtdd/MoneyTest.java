package learn.sfg.sfgtdd;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MoneyTest {

    private Bank bank;
    private Money fiveDollars;
    private Money tenFrancs;

    @BeforeEach
    void setup() {
        bank = new Bank();
        bank.addRate("CHF", "USD", 2);
        fiveDollars = Money.dollar(5);
        tenFrancs = Money.franc(10);
    }

    @Test
    void testMultiplication() {
        assertEquals(Money.dollar(10), fiveDollars.times(2));
        assertEquals(Money.dollar(15), fiveDollars.times(3));

        Money fiveFrancs = Money.franc(5);
        assertEquals(Money.franc(10), fiveFrancs.times(2));
        assertEquals(Money.franc(15), fiveFrancs.times(3));
    }

    @Test
    void testEquality() {
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

    @Test
    void testSimpleAddition() {
        Expression sum = fiveDollars.plus(fiveDollars);
        Money reduced = bank.reduce(sum, "USD");
        assertEquals(Money.dollar(10), reduced);
    }

    @Test
    void testPlusReturnsSum() {
        Sum sum = (Sum) fiveDollars.plus(fiveDollars);
        assertEquals(fiveDollars, sum.augend);
        assertEquals(fiveDollars, sum.addend);
    }

    @Test
    void testReduceSum() {
        Expression sum = new Sum(Money.dollar(3), Money.dollar(4));
        Money result = bank.reduce(sum, "USD");
        assertEquals(Money.dollar(7), result);
    }

    @Test
    void testReduceMoney() {
        Money result = bank.reduce(Money.dollar(1), "USD");
        assertEquals(Money.dollar(1), result);
    }

    @Test
    void testReduceMoneyToDifferentCurrency() {
        Money result = bank.reduce(Money.franc(2), "USD");
        assertEquals(Money.dollar(1), result);
    }

    @Test
    void testIdenticalRate() {
        assertEquals(1, new Bank().rate("USD", "USD"));
        assertEquals(1, new Bank().rate("CHF", "CHF"));
    }

    @Test
    void testMixedAdditions() {
        Money result = bank.reduce(fiveDollars.plus(tenFrancs), "USD");
        assertEquals(Money.dollar(10), result);
    }

    @Test
    void testSumPlusMoney() {
        Expression sum = new Sum(fiveDollars, tenFrancs).plus(fiveDollars);
        Money result = bank.reduce(sum, "USD");
        assertEquals(Money.dollar(15), result);
    }

    @Test
    void testSumTimes() {
        Expression sum = new Sum(fiveDollars, tenFrancs).times(2);
        Money result = bank.reduce(sum, "USD");
        assertEquals(Money.dollar(20), result);
    }
}
