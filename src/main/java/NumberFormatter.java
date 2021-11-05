/**
 * Implement logic that translates stringified integer value into numeric format.
 */

public class NumberFormatter {

    public static int parseInt(String s) {
        validate(s);
        int intValue = 0;
        boolean isNeg = false;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);   // Take each character from the String
            if (!Character.isDigit(c)) {    // Check condition: is character not a digit
                isNeg = (c == '-');     // If first character is '-' the flag isNeg becomes true
            } else {
                int number = Character.getNumericValue(c);     // Get numeric value of each character in the String
                intValue = intValue * 10 + number;      // Move to the new digit of intValue by multiplying by 10
            }                                           // and add the new number in the end
        }
        if (isNeg) {    // If flag isNeg is true, the intValue becomes negative
            intValue *= -1;     // by multiplying by -1
        }
        return intValue;
    }

    /**
     * Validate if the input string is not correct
     */
    private static void validate(String string) {
        if (string.isEmpty()) {     // Check condition: If String is empty
            throw new NumberFormatException("String is empty!");
        }
        if (string.length() < 2 || string.length() > (Math.pow(2, 32) - 1)) {   // Check condition: Length of the input string: 2 ≤ |s| ≤ 2^32 - 1
            throw new NumberFormatException("Input string length must be: 2 ≤ |s| ≤ 2^32 - 1");
        } else {
            for (int i = 1; i < string.length(); i++) {
                char firstChar = string.charAt(0);
                char ch = string.charAt(i);
                if (!(firstChar == 43 || firstChar == 45)) {     // Check condition: If String starts from correct character ['+', '-']
                    if (firstChar < 48 || firstChar > 57) {     // or [0-9]
                        throw new NumberFormatException("Input string start has incorrect values. String must starts with ['+', '-'] or [0-9]");
                    }
                } else if (ch < 48 || ch > 57) {    // Check condition: If String starts from correct character ['+', '-']
                    throw new NumberFormatException("Input string has incorrect values. String must contain only characters from [0-9]");
                }
            }
        }
    }
}
