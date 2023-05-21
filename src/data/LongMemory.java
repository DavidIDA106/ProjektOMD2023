package data;

public class LongMemory implements Memory {

    private LongWord[] memory;

    public LongMemory (int size) {

        memory = new LongWord[size];
    }

    public LongWord read (int index) {
        return memory[index];
    }

    public void write (int index, Word value) {
        memory[index] = (LongWord)value;
    }
}
