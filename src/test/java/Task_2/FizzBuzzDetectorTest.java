package Task_2;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FizzBuzzDetectorTest {
    @Test
    public void getOverlappingsTest() {
        //actual result
        String string1 = "Mary had a little lamb Little lamb, little lamb Mary had a little lamb";
        //expected result
        String result1 = "Mary had Fizz little Buzz Fizz lamb, little Fizz Buzz had Fizz little lamb";
        int counter = 6;
        FizzBuzzObject object = new FizzBuzzObject(new StringBuilder(result1), 6);
        Assertions.assertEquals(object, FizzBuzzDetector.getOverlappings(string1));
    }
}
