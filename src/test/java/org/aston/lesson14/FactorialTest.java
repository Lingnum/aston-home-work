package org.aston.lesson14;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.expectThrows;

public class FactorialTest {

    @Test
    public void testFactorialOfZero() {
        assertEquals(Factorial.factorial(0), 1);
    }

    @Test
    public void testFactorialOfPositiveNumber() {
        assertEquals(Factorial.factorial(5), 120);
    }

    @Test
    public void testFactorialOfNegativeNumber() {
        expectThrows(IllegalArgumentException.class, () -> Factorial.factorial(-1));
    }

}
