package data;

public class LongWord implements Word {

    public Long word;

    public LongWord () {
        word = 0L;
    }

    public LongWord (long value) {
        word = value;
    }

    public void set (Number value) {
        word = value.longValue();
    }

    public boolean equals (Word w) {
        return word.equals(w.get());
    }

    public Number get () {
        return word.longValue();
    }

    public LongWord copy () {
        return new LongWord(word);
    }

    public void add (Number n) {
        set(word + n.longValue());
    }

    public void mul (Number n) {
        set(word * n.longValue());
    }

    public LongWord copyAdd (Number n) {
        return new LongWord(word + n.longValue());
    }

    public LongWord copyMul (Number n) {
        return new LongWord(word * n.longValue());
    }

    public String toString() {
        return "" + word;
    }
}
