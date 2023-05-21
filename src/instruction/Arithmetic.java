package instruction;

import computer.ProgramCounter;
import data.Address;
import data.LongWord;
import data.Memory;
import data.Word;

public abstract class Arithmetic implements Instruction {

    Object op1;
    Object op2;
    Address out;

    public Arithmetic (Object o1, Object o2, Address n) throws IllegalArgumentException {

        if (! (o1 instanceof Word || o1 instanceof Address) ) throw new IllegalArgumentException();
        if (! (o2 instanceof Word || o2 instanceof Address) ) throw new IllegalArgumentException();
        op1 = o1;
        op2 = o2;
        out = n;
    }

    public void exec (Memory m, ProgramCounter pc) {

    }
}
