package data;

public interface Memory {

    //final Word[] memory = new Word[0];

    public Word read (int index);

    public void write (int index, Word value);
}
