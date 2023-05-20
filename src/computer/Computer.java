package computer;
import data.*;

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
    }
}
