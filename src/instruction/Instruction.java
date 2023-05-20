package instruction;

import computer.ProgramCounter;
import data.Memory;

public interface Instruction {

    public void exec(Memory m, ProgramCounter pc);

}
