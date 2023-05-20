package data;

public abstract class Word implements Data {

    int word;

    public Word () {
    }

    public Word (int value) {
        word = value;
    }

    public Number get () {
        return word;
    }

    public void set (int value) {
        word = value;
    }
}
