package Task_2;

public class FizzBuzzObject {
    private final StringBuilder string;
    private final int count;

    public FizzBuzzObject(StringBuilder string, int count) {
        this.string = string;
        this.count = count;
    }
    public StringBuilder getString() {
        return string;
    }

    public int getCount() {
        return count;
    }

    @Override
    public String toString() {
        return "output string: \n" + string +
                "\ncount: " + count;
    }
}
