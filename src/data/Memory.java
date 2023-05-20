package data;

public class Memory {

    private Word[] memory;

    public Memory () {
        //mem = new Word[size];
    }

    public Word read (int index) {
        return memory[index];
    }

    public boolean write (int index, Word value) {
        memory[index] = value;
        return true;
    }
}
