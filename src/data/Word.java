package data;

public abstract class Word implements Data {

    public final Number word;
//
    public Word (int value) {
        word = value;
    }

    protected Word() {
        word = 0;
    }

//    public Number get () {
//        return word;
//    }

    //public void set (int value) {
    //    word = value;
    //}

    public boolean equals (Word w) {
        return word.equals(w.word);
    }
}
