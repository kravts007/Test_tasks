package Task_1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class NumberFormatterTest {
    @Test
    public void testParseInt1() {
        //actual result
        String string1 = "+0";
        //expected result
        int result1 = 0;
        Assertions.assertEquals(result1, NumberFormatter.parseInt(string1));
    }

    @Test
    public void testParseInt2() {
        //actual result
        String string2 = "-12345";
        //expected result
        int result2 = -12345;
        Assertions.assertEquals(result2, NumberFormatter.parseInt(string2));
    }

    @Test
    public void testParseInt3() {
        //actual result
        String string3 = "-54321";
        //expected result
        int result3 = -54321;
        Assertions.assertEquals(result3, NumberFormatter.parseInt(string3));
    }

    @Test
    public void testParseInt4() {
        //actual result
        String string4 = "+6321";
        //expected result
        int result4 = 6321;
        Assertions.assertEquals(result4, NumberFormatter.parseInt(string4));
    }

    @Test
    public void testParseInt5() {
        //actual result
        String string5 = "+852469";
        //expected result
        int result5 = 852469;
        Assertions.assertEquals(result5, NumberFormatter.parseInt(string5));
    }

    @Test
    public void testParseInt6() {
        //actual result
        String string6 = "-45";
        //expected result
        int result6 = -45;
        Assertions.assertEquals(result6, NumberFormatter.parseInt(string6));
    }

    @Test
    public void testParseInt7() {
        //actual result
        String string7 = "+1";
        //expected result
        int result7 = 1;
        Assertions.assertEquals(result7, NumberFormatter.parseInt(string7));
    }
    @Test
    public void testParseInt8() {
        //actual result
        String string8 = "2147483647";
        //expected result
        int result8 = 2147483647;
        Assertions.assertEquals(result8, NumberFormatter.parseInt(string8));
    }
}
