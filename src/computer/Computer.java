package computer;
import data.*;
import instruction.Halt;
import instruction.Instruction;

public class Computer {

    private Memory memory;

    private ProgramCounter pc;

    private Program program;


    public Computer (Memory mem) {

        memory = mem;
        pc = new ProgramCounter();
    }

    public void load (Program prg) {
        program = prg;
    }

    public void reset () {
        pc.setIndex(0);
    }

    public void run () {
        reset();
        Instruction i = null;

        while (pc.getIndex() >= 0) {

            int count = pc.getIndex();

            i = program.instList.get(pc.getIndex());
            i.exec(memory, pc);

            if (count == pc.getIndex())
                pc.inc();

        }
    }
}
