package instruction;

import computer.ProgramCounter;
import data.Address;
import data.Memory;

public class Jump implements Instruction {

    private int toIndex;

    public Jump (int n) {
        toIndex = n;
    }

    public void exec (Memory m, ProgramCounter pc) {

        pc.setIndex(toIndex);
    }

    public String toString() {
        return "JMP " + toIndex;
    }
}
