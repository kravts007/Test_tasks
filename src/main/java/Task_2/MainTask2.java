package Task_2;

public class MainTask2 {
    public static void main(String[] args) {
        String inputString = "Всё ходит по цепи кругом; \nИдёт направо — песнь заводит, \nНалево — сказку говорит.";
        System.out.println(inputString);
        System.out.println();
        System.out.println(FizzBuzzDetector.getOverlappings(inputString));
    }
}
