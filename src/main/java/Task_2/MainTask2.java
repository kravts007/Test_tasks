package Task_2;

public class MainTask2 {
    public static void main(String[] args) {
        String inputString = "1 564 Mary has 5775 little 54 lamb \n8492 тест 873 . цк , ! ? \nожидаемо will be всё ok 100 percent";
        System.out.println(inputString);
        System.out.println();
        System.out.println(FizzBuzzDetector.getOverlappings(inputString));
    }
}
