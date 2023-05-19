package data;

public class LongWord extends Word <Long> {

    Long word;

    public LongWord () {
        word = 0L;
    }

    public LongWord (Long value) {
        word = value;
    }

    public Long get () {
        return word;
    }

    public void set (Long value) {
        word = value;
    }

}
