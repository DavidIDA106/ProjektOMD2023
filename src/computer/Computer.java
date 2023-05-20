package computer;
import data.*;

public class Computer {

    private Memory memory;

    private Program program;


    public Computer (Memory mem) {
        memory = mem;
    }

    public boolean load (Program prg) {
        program = prg;
        return true;
    }

    public boolean run () {
        return true;
    }
}
