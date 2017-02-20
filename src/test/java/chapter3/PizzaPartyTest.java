package chapter3;

import org.junit.Test;

import static org.junit.Assert.*;
import static chapter3.PizzaParty.*;

public class PizzaPartyTest {
    @Test
    public void slicesPerPersonTest() {
        int expected = 2;
        int result = getSlicesPerPerson(8, 16);
        assertEquals(expected, result);

        expected = 1;
        result = getSlicesPerPerson(9, 16);
        assertEquals(expected, result);
    }

    @Test
    public void getLeftOversTest() {
        int expected = 7;
        int result = getLeftovers(9, 16);
        assertEquals(expected, result);

        expected = 0;
        result = getLeftovers(8, 16);
        assertEquals(expected, result);w
    }
}