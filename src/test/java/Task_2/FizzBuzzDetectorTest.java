package Task_2;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FizzBuzzDetectorTest {
    @Test
    public void getOverlappingsTest1() {
        //actual result
        String string = "Mary had a little lamb Little lamb, little lamb Mary had a little lamb";
        //expected result
        String result = "Mary had Fizz little Buzz Fizz lamb, little Fizz Buzz had Fizz little lamb";
        FizzBuzzObject expectedObject = new FizzBuzzObject(result, 6);
        Assertions.assertEquals(expectedObject, FizzBuzzDetector.getOverlappings(string));
    }

    @Test
    public void getOverlappingsTest2() {
        //actual result
        String string = "Mary had a little lamb";
        //expected result
        String result = "Mary had Fizz little Buzz";
        FizzBuzzObject expectedObject = new FizzBuzzObject(result, 2);
        Assertions.assertEquals(expectedObject, FizzBuzzDetector.getOverlappings(string));
    }

    @Test
    public void getOverlappingsTest3() {
        //actual result
        String string = "1234 1366 9645 546544 87878 33565 1484 989 5646878 54545 54545 545487 6548979 89748978 4 89 98 7";
        //expected result
        String result = "1234 1366 Fizz 546544 Buzz Fizz 1484 989 Fizz Buzz 54545 Fizz 6548979 89748978 FizzBuzz 89 98 Fizz";
        FizzBuzzObject expectedObject = new FizzBuzzObject(result, 8);
        Assertions.assertEquals(expectedObject, FizzBuzzDetector.getOverlappings(string));
    }

    @Test
    public void getOverlappingsTest4() {
        //actual result
        String string = "Mary had a little lamb \nLittle lamb, little lamb \nMary had a little lamb";
        //expected result
        String result = "Mary had Fizz little Buzz \nFizz lamb, little Fizz \nBuzz had Fizz little lamb";
        FizzBuzzObject expectedObject = new FizzBuzzObject(result, 6);
        Assertions.assertEquals(expectedObject, FizzBuzzDetector.getOverlappings(string));
    }

    @Test
    public void getOverlappingsTest5() {
        //actual result
        String string = "У лукоморья дуб зелёный; \nЗлатая цепь на дубе том: \nИ днём и ночью кот учёный";
        //expected result
        String result = "У лукоморья Fizz зелёный; \nBuzz Fizz на дубе Fizz \nBuzz днём Fizz ночью кот FizzBuzz";
        FizzBuzzObject expectedObject = new FizzBuzzObject(result, 7);
        Assertions.assertEquals(expectedObject, FizzBuzzDetector.getOverlappings(string));
    }

    @Test
    public void getOverlappingsTest6() {
        //actual result
        String string = "Всё ходит по цепи кругом; \nИдёт направо — песнь заводит, \nНалево — сказку говорит.";
        //expected result
        String result = "Всё ходит Fizz цепи Buzz \nFizz направо — Fizz Buzz \nНалево Fizz сказку говорит.";
        FizzBuzzObject expectedObject = new FizzBuzzObject(result, 6);
        Assertions.assertEquals(expectedObject, FizzBuzzDetector.getOverlappings(string));
    }

    @Test
    public void getOverlappingsTest7() {
        //actual result
        String string = "No sunshine, lots of rain, \nNo warm days, snow again! \nNo bugs or bees \nNo leaves on trees.";
        //expected result
        String result = "No sunshine, Fizz of Buzz \nFizz warm days, Fizz Buzz \nNo Fizz or bees \nFizzBuzz leaves on Fizz";
        FizzBuzzObject expectedObject = new FizzBuzzObject(result, 8);
        Assertions.assertEquals(expectedObject, FizzBuzzDetector.getOverlappings(string));
    }

    @Test
    public void getOverlappingsTest8() {
        //actual result
        String string = "M a r y h a d a l i t t l e l a m b L i t t l e l a m b";
        //expected result
        String result = "M a Fizz y Buzz Fizz d a Fizz Buzz t Fizz l e FizzBuzz a m Fizz L Buzz Fizz t l Fizz Buzz a Fizz b";
        FizzBuzzObject expectedObject = new FizzBuzzObject(result, 13);
        Assertions.assertEquals(expectedObject, FizzBuzzDetector.getOverlappings(string));
    }
}
