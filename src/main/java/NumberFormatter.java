/**
 * Implement logic that translates stringified integer value into numeric format.
 */

public class NumberFormatter {
    public static void main(String[] args) {
        String s1 = "123345";
        String s2 = "-5023345";
        String s3 = "+0";
        String s4 = "-00458";
        String s5 = "+9035";
        System.out.println(parseInt(s1));
        System.out.println(parseInt(s2));
        System.out.println(parseInt(s3));
        System.out.println(parseInt(s4));
        System.out.println(parseInt(s5));
    }

    public static int parseInt(String s) {
        int intValue = 0;
        boolean isNeg = false;
        if (s.length() >= 2 && s.length() <= (Math.pow(2, 32) - 1)) { // Check condition: Length of the input string: 2 ≤ |s| ≤ 2^32 - 1
            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);// Take each character from the String
                if (!Character.isDigit(c)) {// Check condition: is character not a digit
                    isNeg = (c == '-');// If first character is '-' the flag isNeg becomes true
                } else {
                    int number = Character.getNumericValue(c);// Get numeric value of each character in the String
                    intValue = intValue * 10 + number;// Move to the new digit of intValue by multiplying by 10
                }                                     // and add the new number in the end
            }
            if (isNeg) {  // If flag isNeg is true, the intValue becomes negative
                intValue *= -1; // by multiplying by -1
            }
        }
        return intValue;
    }

}
