package test;

import static org.junit.Assert.fail;
import main.BalancedBrackets;
import org.junit.Test;

import static org.junit.Assert.*;

public class BalancedBracketsTest {

    // expected, actual, delta

    //TODO: add tests here
    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }

    @Test
    public void hasBalancedBracketsShouldReturnTrueWhenGivenEmptyArray() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }

    @Test
    public void checkIfBracketsAreReversed() {
        String spec = "a pair of reversed brackets returns false";
        String testData = "][";
        boolean result = BalancedBrackets.hasBalancedBrackets(testData);
        assertFalse(spec, result);
    }
    @Test
    public void singleClosingBracket() {
        String spec = "a aingle closing bracket returns false";
        String testData = "]";
        boolean result = BalancedBrackets.hasBalancedBrackets(testData);
        assertFalse(spec, result);
    }

    @Test
    public void singleOpeningBracket() {
        String spec = "a aingle opening bracket returns false";
        String testData = "[";
        boolean result = BalancedBrackets.hasBalancedBrackets(testData);
        assertFalse(spec, result);
    }

}
