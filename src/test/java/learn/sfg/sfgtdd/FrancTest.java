package learn.sfg.sfgtdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FrancTest {
    @Test
    void testMultiplication() {
        Franc five = new Franc(5);
        Franc product = five.times(2);
        assertEquals(new Franc(10), product);
        product = five.times(3);
        assertEquals(new Franc(15), product);
    }

    @Test
    void testEquality() {
        Franc five1 = new Franc(5);
        Franc five2 = new Franc(5);
        assertEquals(five1, five2);
        assertEquals(five2, five1);
        assertNotEquals(five1, new Franc(6));
    }
}
