package Task_2;

import java.util.Objects;

public class FizzBuzzObject {
    private final String string;
    private final int count;

    public FizzBuzzObject(String string, int count) {
        this.string = string;
        this.count = count;
    }

    @Override
    public String toString() {
        return "output string: \n" + string + "\n" +
                "\ncount: " + count;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FizzBuzzObject object = (FizzBuzzObject) o;
        return count == object.count && Objects.equals(string, object.string);
    }
    @Override
    public int hashCode() {
        return Objects.hash(string, count);
    }
}
