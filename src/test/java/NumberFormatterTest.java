import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class NumberFormatterTest {
    String string1 = "+0";
    String string2 = "+12345";
    String string3 = "-54321";
    String string4 = "-06321";


    @Test
    public void testParseInt() {
        int result1 = 0;
        int result2 = 12345;
        int result3 = -54321;
        int result4 = -6321;
        Assertions.assertEquals(result1, NumberFormatter.parseInt(string1));
        Assertions.assertEquals(result2, NumberFormatter.parseInt(string2));
        Assertions.assertEquals(result3, NumberFormatter.parseInt(string3));
        Assertions.assertEquals(result4, NumberFormatter.parseInt(string4));

    }
}
