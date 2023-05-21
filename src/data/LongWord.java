package data;

public class LongWord implements Word {

    public final Long word;

//    public LongWord () {
//        word = 0L;
//    }

    public LongWord (long value) {
        word = value;
    }

//    @Override
//    public Long get () {
//        return word;
//    }
//
//    public void set (long value) {
//        word = value;
//    }

    public boolean equals (Word w) {
        return word.equals(w.get());
    }

    public Number get () {
        return word;
    }
}
