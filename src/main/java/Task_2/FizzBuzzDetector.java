package Task_2;

/**
 * Write an algorithm that replaces every third word in the string to Fizz, and every fifth word in the string to Buzz.
 */
public class FizzBuzzDetector {
    public static Object getOverlappings(String string) {
        validateString(string);
        String[] words = string.split(" ");     // Split the string into an array
        StringBuilder builder = new StringBuilder();    // Create new StringBuilder which will contains our new string with Fizz and Buzz
        int counter = 0;
        boolean endOfTheLine;
        boolean startOfNewLine;
        for (int i = 0; i < words.length; i++) {
            int wordAtPosition = i + 1; // We start reading from the first word, but first index of array is 0, so we are shifting the countdown
            endOfTheLine = (i == words.length - 1);
            startOfNewLine = words[i].contains("\n");
            if (((wordAtPosition % 3) == 0) && ((wordAtPosition % 5) == 0)) {   // Is it a multiple of 3 and 5? Replace the word with FizzBuzz
                if (startOfNewLine) {  // If this is a new line we add "\n" before the word
                    builder.append("\n");
                }
                if (endOfTheLine) {
                    builder.append("FizzBuzz");
                } else {
                    builder.append("FizzBuzz").append(" ");
                }
                counter++;
            } else if ((wordAtPosition % 3) == 0) {  // Is it a multiple of 3? Replace the word with Fizz
                if (startOfNewLine) {
                    builder.append("\n");
                }
                if (endOfTheLine) {
                    builder.append("Fizz");
                } else {
                    builder.append("Fizz").append(" ");
                }
                counter++;
            } else if ((wordAtPosition % 5) == 0) {   // Is it a multiple of 5? Replace the word with Buzz
                if (startOfNewLine) {
                    builder.append("\n");
                }
                if (endOfTheLine) {
                    builder.append("Buzz");
                } else {
                    builder.append("Buzz").append(" ");
                }
                counter++;
            } else {
                if (endOfTheLine) {
                    builder.append(words[i]);
                } else {
                    builder.append(words[i]).append(" ");
                }
            }
        }
        String outputString = builder.toString(); // Write the StringBuilder value to the new string
        return new FizzBuzzObject(outputString, counter);
    }
    /**
     * Validate if the input string is not correct
     */
    private static void validateString(String inputString) {
        if (inputString == null) {
            throw new IllegalArgumentException("String is NULL");
        }
        if (inputString.isEmpty()) {
            throw new IllegalArgumentException("The input String is Empty");
        }
        if (inputString.length() <= 7 || inputString.length() >= 100) {   //Check condition: if length of the input string: 7 ≤ |s| ≤ 100
            throw new IllegalArgumentException("Incorrect length of the input String! Length of the input string must be 7 ≤ |s| ≤ 100");
        }
        if (!(inputString.matches("^[?!,.:;'—а-яА-ЯёЁ0-9a-zA-Z\\s]+$"))) {  //Check condition: if string contains only alphanumeric words and symbols[?!,.:;'—]
            throw new IllegalArgumentException("Incorrect input string! The string contains forbidden characters");
        }
    }
}
