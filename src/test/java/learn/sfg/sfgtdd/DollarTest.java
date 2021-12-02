package learn.sfg.sfgtdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DollarTest {

    @Test
    void testMultiplication() {
        Dollar five = new Dollar(5);
        Dollar product = five.times(2);
        assertEquals(new Dollar(10), product);
        product = five.times(3);
        assertEquals(new Dollar(15), product);
    }

    @Test
    void testEquality() {
        Dollar five1 = new Dollar(5);
        Dollar five2 = new Dollar(5);
        assertEquals(five1, five2);
        assertEquals(five2, five1);
        assertNotEquals(five1, new Dollar(6));
        assertNotEquals(five1, new Franc(5));
    }
}
