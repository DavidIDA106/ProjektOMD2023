package data;

public interface Word {

    void set (Number value);

    boolean equals (Word w);

    Number get ();

    Word copy ();

    void add (Number n);

    void mul (Number n);

    Word copyAdd (Number n);

    Word copyMul (Number n);

    String toString();
}
