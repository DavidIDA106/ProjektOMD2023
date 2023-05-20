package data;

public class LongMemory extends Memory {

    private LongWord[] memory;

    public LongMemory (int size) {
        super(size);
        memory = new LongWord[size];
    }

    public LongWord read (int index) {
        return memory[index];
    }

    public void write (int index, LongWord value) {
        memory[index] = value;
        //return true;
    }
}
