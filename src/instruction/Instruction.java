package instruction;

import computer.ProgramCounter;
import data.Memory;

public interface Instruction {

    Memory m = null;
    ProgramCounter pc = null;

    public void exec(Memory m, ProgramCounter pc);

}
