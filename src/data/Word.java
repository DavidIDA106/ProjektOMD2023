package data;

public abstract class Word implements Data {

    public final int word;
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
}
