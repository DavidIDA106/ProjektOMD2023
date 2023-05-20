package data;

public class LongWord extends Word {

    long word;

    public LongWord () {
        word = 0L;
    }

    public LongWord (long value) {
        word = value;
    }

    @Override
    public Long get () {
        return word;
    }

    public void set (long value) {
        word = value;
    }

}
