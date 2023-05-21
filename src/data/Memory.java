package data;

public abstract class Memory {

    protected final Word[] memory;

    public Memory (Word[] memory) {
        this.memory = memory;
    }

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
