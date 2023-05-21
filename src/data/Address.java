package data;

public class Address {

    private Memory mem;

    public final int index;

    public Address (int ind) {
        index = ind;
    }

    public String toString() {
        return "[" + index + "]";
    }
}
