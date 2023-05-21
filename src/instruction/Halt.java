package instruction;

import computer.ProgramCounter;
import data.Memory;

public class Halt implements Instruction {

    public Halt () {

    }

    public void exec (Memory mem, ProgramCounter pc) {
        pc.setIndex(-1);
    }

    public String toString() {
        return "HLT ";
    }
}
