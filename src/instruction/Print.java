package instruction;

import computer.ProgramCounter;
import data.Address;
import data.Memory;

public class Print implements Instruction {

    Address n;

    public Print (Address n) {
        this.n = n;
    }

    public void exec (Memory m, ProgramCounter pc) {
        System.out.println(m.read(n.index));
    }
}
