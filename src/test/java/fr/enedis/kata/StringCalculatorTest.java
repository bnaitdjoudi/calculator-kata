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

    @Test
    public void lotNumberShouldAdded() {

        assertEquals(calculator.add("1,2,3"), 6,"1,2,3 should return 6");
    }

    @Test
    public void supportNewLine() {

        assertEquals(6, calculator.add("1\n2,3"),"1\\n2,3 should return 6");
    }

    @Test
    public void differenteSeparatorLine() {

        assertEquals(3,calculator.add("//;\\n1;2"),"//;\\n1;2 should return 3");
    }

    @Test
    public void negativesValueException() {

        try {
            assertEquals(3, calculator.add("//;\\n1;2;-3;-4"), "should throw an exception");
        }catch (IllegalArgumentException e){
            assertEquals(new IllegalArgumentException(
                    "negatif value not allowed [-3, -4]").getCause(),e.getCause());
        }
    }
}
