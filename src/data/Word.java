package data;

public abstract class Word <T extends Number> implements Data {

    T word;

    public Word () {
    }

    public Word (T value) {
        word = value;
    }

    public T get () {
        return word;
    }

    public void set (T value) {
        word = value;
    }
}
