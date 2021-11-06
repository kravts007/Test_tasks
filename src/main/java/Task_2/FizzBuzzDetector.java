package Task_2;

/**
 * Write an algorithm that replaces every third word in the string to Fizz, and every fifth word in the string to Buzz.
 */
public class FizzBuzzDetector {
    public static Object getOverlappings(String string) {
        validateString(string);
        String[] words = string.split(" ");
        StringBuilder builder = new StringBuilder();
        int counter = 0;
        for (int i = 0; i < words.length; i++) {
            int firstWord = i + 1;
            if (((firstWord % 3) == 0) && ((firstWord % 5) == 0)) {   // Is it a multiple of 3 and 5?
                builder.append("FizzBuzz").append(" ");
                counter++;

            } else if ((firstWord % 3) == 0) {  // Is it a multiple of 3?
                builder.append("Fizz").append(" ");
                counter++;

            } else if ((firstWord % 5) == 0) {   // Is it a multiple of 5?
                builder.append("Buzz").append(" ");
                counter++;

            } else if(i == words.length - 1) {
                builder.append((words[i]));
            }else {
                builder.append(words[i]).append(" ");  // Add words to new stringBuilder
            }
        }
        return new FizzBuzzObject(builder, counter);
    }

    /**
     * Validate if the input string is not correct
     */
    private static void validateString(String string) {
        boolean isNull = false;
        try {
            string.equalsIgnoreCase(null);  //Check condition: if input string is NULL
        } catch (NullPointerException npe) {
            isNull = true;
            throw new NumberFormatException("The input String is NULL");
        }
        if (string.isEmpty()) {     //Check condition: if input string is Empty
            throw new NumberFormatException("The input String is Empty");
        }
        if (string.length() <= 7 || string.length() >= 100) {   //Check condition: if length of the input string: 7 ≤ |s| ≤ 100
            throw new NumberFormatException("Incorrect length of the input String! Length of the input string must be 7 ≤ |s| ≤ 100");
        }
    }
}
