package Task_1;

/**
 * Implement logic that translates stringified integer value into numeric format.
 */

public class NumberFormatter {
// В условии задания написано return integer value(целочисленное значение), а long это тоже целочисленное значение.
// Поэтому для того, что бы работало условие "Length of the input string: 2 ≤ |s| ≤ 2^32-1" мой метод возвращает long
    public static long parseInt(String inputString) {
        validate(inputString);
        long value = 0L;
        boolean isNeg = false;
        int i = 0;
        if (inputString.charAt(0) == '-') {        //Check condition: is value negative
            isNeg = true;
            i = 1;
        }
        while (i < inputString.length()) {
            char charAtPosition = inputString.charAt(i);   // Take each character from the String
            if (Character.isDigit(charAtPosition)) {    // Check condition: is character not a digit
                int number = Character.getNumericValue(charAtPosition);     // Get numeric value of each character in the String
                value = value * 10 + number;      // Move to the new digit of intValue by multiplying by 10
            }                                           // and add the new number in the end
            i++;
        }
        if (isNeg) {    // If flag isNeg is true, the intValue becomes negative
            value *= -1;     // by multiplying by -1
        }
        return value;
    }

    /**
     * Validate if the input string is not correct
     */
    private static void validate(String string) {
        int firstSymbol = string.charAt(0);
        long topBoarderOfStringLength = (long) (Math.pow(2, 32) - 1);

        if (string.isEmpty()) {     // Check condition: If String is empty
            throw new NumberFormatException("String is empty!");
        }
        if (string.length() < 2 || string.length() > topBoarderOfStringLength) {   // Check condition: Length of the input string: 2 ≤ |s| ≤ 2^32 - 1
            throw new NumberFormatException("Input string length must be: 2 ≤ |s| ≤ 2^32 - 1");
        } else if (!(string.matches("(-|\\+)?\\d+"))) {    // Check condition: If String contains only [0-9] and ['+', '-']
            throw new NumberFormatException("Input string has incorrect values. String must contain only characters from [0-9] and ['+', '-'] before numeric value");
        } else if (!((firstSymbol == '-' || firstSymbol == '+') || (firstSymbol >= '0' && firstSymbol <= '9'))) {  // Check condition: If String first symbol contains only [0-9] or ['+', '-']
            throw new NumberFormatException("Input string start has incorrect values. String must starts with ['+', '-'] or [0-9]");
        }
    }
}
