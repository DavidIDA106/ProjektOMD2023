package data;

public class LongMemory extends Memory {

    private LongWord[] memory;

    public LongMemory (int size) {

        super(new LongWord[size]);
    }

    public LongWord read (int index) {
        return (LongWord) super.memory[index];
    }

    public void write (int index, LongWord value) {
        super.memory[index] = value;
        //return true;
    }
}
