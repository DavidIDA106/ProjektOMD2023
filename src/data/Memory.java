package data;

public class Memory {

    private final Word[] memory;

    public Memory (int size) {
        memory = new Word[size];
    }

    public Word read (int index) {
        return memory[index];
    }

    public void write (int index, Word value) {
        memory[index] = value;
        //return true;
    }
}
