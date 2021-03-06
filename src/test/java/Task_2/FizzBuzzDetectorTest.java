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
        String string = "?? ?????????????????? ?????? ??????????????; \n???????????? ???????? ???? ???????? ??????: \n?? ???????? ?? ?????????? ?????? ????????????";
        //expected result
        String result = "?? ?????????????????? Fizz ??????????????; \nBuzz Fizz ???? ???????? Fizz \nBuzz ???????? Fizz ?????????? ?????? FizzBuzz";
        FizzBuzzObject expectedObject = new FizzBuzzObject(result, 7);
        Assertions.assertEquals(expectedObject, FizzBuzzDetector.getOverlappings(string));
    }

    @Test
    public void getOverlappingsTest6() {
        //actual result
        String string = "?????? ?????????? ???? ???????? ????????????; \n???????? ?????????????? ??? ?????????? ??????????????, \n???????????? ??? ???????????? ??????????????.";
        //expected result
        String result = "?????? ?????????? Fizz ???????? Buzz \nFizz ?????????????? ??? Fizz Buzz \n???????????? Fizz ???????????? ??????????????.";
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
        String string = "M a r y h a d a l i t t l e l a m b L i t t l e l a m b !";
        //expected result
        String result = "M a Fizz y Buzz Fizz d a Fizz Buzz t Fizz l e FizzBuzz a m Fizz L Buzz Fizz t l Fizz Buzz a Fizz b !";
        FizzBuzzObject expectedObject = new FizzBuzzObject(result, 13);
        Assertions.assertEquals(expectedObject, FizzBuzzDetector.getOverlappings(string));
    }

    @Test
    public void getOverlappingsTest9() {
        //actual result
        String string = "1 564 Mary has 5775 little 54 lamb \n8492 ???????? 87 . ???? , ! ? \n???????????????? will be ?????? ok 100 percent";
        //expected result
        String result = "1 564 Fizz has Buzz Fizz 54 lamb \nFizz Buzz 87 Fizz ???? , FizzBuzz ? \n???????????????? Fizz be Buzz Fizz 100 percent";
        FizzBuzzObject expectedObject = new FizzBuzzObject(result, 10);
        Assertions.assertEquals(expectedObject, FizzBuzzDetector.getOverlappings(string));
    }
    @Test
    public void testParseInt11() throws IllegalArgumentException {
        //actual result
        String string = null;
        //expected result
        String result = "0";
        Throwable thrown = Assertions.assertThrows(IllegalArgumentException.class, () -> {
            FizzBuzzDetector.getOverlappings(string);
        });
        Assertions.assertNotNull(thrown.getMessage());
    }
    @Test
    public void testParseInt12() throws IllegalArgumentException {
        //actual result
        String string = "";
        //expected result
        String result = "0";
        Throwable thrown = Assertions.assertThrows(IllegalArgumentException.class, () -> {
            FizzBuzzDetector.getOverlappings(string);
        });
        Assertions.assertNotNull(thrown.getMessage());
    }
    @Test
    public void testParseInt13() throws IllegalArgumentException {
        //actual result
        String string = "abc";
        //expected result
        String result = "abc";
        Throwable thrown = Assertions.assertThrows(IllegalArgumentException.class, () -> {
            FizzBuzzDetector.getOverlappings(string);
        });
        Assertions.assertNotNull(thrown.getMessage());
    }
    @Test
    public void testParseInt14() throws IllegalArgumentException {
        //actual result
        String string = "abcfsdfsfsdfsfsdfsdfsdfsdfsdfsdfjhsidlfhsdufhsdufhsdufhsdafuhsdfuhsdfuhsdufhsdfuihsdfuihsdfuhsdufhsdufhsdfu";
        //expected result
        String result = "abcfsdfsfsdfsfsdfsdfsdfsdfsdfsdfjhsidlfhsdufhsdufhsdufhsdafuhsdfuhsdfuhsdufhsdfuihsdfuihsdfuhsdufhsdufhsdfu";
        Throwable thrown = Assertions.assertThrows(IllegalArgumentException.class, () -> {
            FizzBuzzDetector.getOverlappings(string);
        });
        Assertions.assertNotNull(thrown.getMessage());
    }
    @Test
    public void testParseInt15() throws IllegalArgumentException {
        //actual result
        String string = "abd // fsdifi 954 dsadasd + fdsif # fsdfjisdf";
        //expected result
        String result = "abd // Fizz 954 Buzz Fizz fdsif # Fizz";
        Throwable thrown = Assertions.assertThrows(IllegalArgumentException.class, () -> {
            FizzBuzzDetector.getOverlappings(string);
        });
        Assertions.assertNotNull(thrown.getMessage());
    }
}
