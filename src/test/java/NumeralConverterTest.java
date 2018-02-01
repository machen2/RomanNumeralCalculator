import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NumeralConverterTest {
    NumeralConverter numeralConverter;

    @Before
    public void setUp() {
        numeralConverter = new NumeralConverter();
    }

    @Test
    public void givenIItReturns1() {
        assertEquals(1, numeralConverter.convertToInteger("I"));
    }

    @Test
    public void givenIIItReturns2() {
        assertEquals(2, numeralConverter.convertToInteger("II"));
    }

    @Test
    public void givenIIIItReturns3() {
        assertEquals(3, numeralConverter.convertToInteger("III"));
    }

    @Test
    public void givenIVItReturns4() {
        assertEquals(4, numeralConverter.convertToInteger("IV"));
    }

    @Test
    public void givenVItReturns5() {
        assertEquals(5, numeralConverter.convertToInteger("V"));
    }

    @Test
    public void givenVIItReturns6() {
        assertEquals(6, numeralConverter.convertToInteger("VI"));
    }

    @Test
    public void givenVIIItReturns7() {
        assertEquals(7, numeralConverter.convertToInteger("VII"));
    }

    @Test
    public void givenXItReturns10() {
        assertEquals(10, numeralConverter.convertToInteger("X"));
    }

    @Test
    public void givenIXItReturns9() {
        assertEquals(9, numeralConverter.convertToInteger("IX"));
    }

    @Test
    public void givenXIItReturns11() {
        assertEquals(11, numeralConverter.convertToInteger("XI"));
    }

    @Test
    public void givenXXItReturns20() {
        assertEquals(20, numeralConverter.convertToInteger("XX"));
    }

    @Test
    public void givenLItReturns50() {
        assertEquals(50, numeralConverter.convertToInteger("L"));
    }

    @Test
    public void givenILItReturns49() {
        assertEquals(49, numeralConverter.convertToInteger("IL"));
    }

    @Test
    public void givenCItReturns100() {
        assertEquals(100, numeralConverter.convertToInteger("C"));
    }

    @Test
    public void givenDItReturns500() {
        assertEquals(500, numeralConverter.convertToInteger("D"));
    }

    @Test
    public void givenMItReturns1000() {
        assertEquals(1000, numeralConverter.convertToInteger("M"));
    }

}
