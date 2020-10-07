package fr.enedis.kata;

import org.junit.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringCalculatorTest {

    // Right tests here

    StringCalculator calculator = new StringCalculator();

    @Test
    public void emptyStringShouldReturnZero() {

        assertEquals(calculator.add(""), 0," empty or null string should return 0");
    }

    @Test
    public void oneNumberShouldReturnItSelf() {

        assertEquals(calculator.add("3"), 3,"number should return it self");
    }

    @Test
    public void twoNumberShouldAdded() {

        assertEquals(calculator.add("1,2"), 3,"1,2 should return 3");
    }
}
