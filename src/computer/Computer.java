package computer;
import data.*;

public class Computer {

    private Memory memory;

    private Program program;


    public Computer (Memory mem) {
        memory = mem;
    }

    public void load (Program prg) {
        program = prg;
    }

    public void run () {
        program.reset();
    }
}
