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

//    public Arithmetic (Word o1, Word o2, Address n) {
//
//    }
//
//    public Arithmetic (Word o1, Address o2, Address n) {
//
//    }
//
//    public Arithmetic (Address o1, Word o2, Address n) {
//
//    }
//
//    public Arithmetic (Address o1, Address o2, Address n) {
//
//    }

    public void exec (Memory m, ProgramCounter pc) {

        if (op1 instanceof Address) {
            Address o1 = (Address)op1;
            op1 = new LongWord(m.read(o1.index).get().longValue());
        }

        if (op2 instanceof Address) {
            Address o2 = (Address)op2;
            op2 = new LongWord(m.read(o2.index).get().longValue());
        }

        m.write(out.index, new LongWord(calc( (((LongWord)op1).word) , ((LongWord)op2).word)));
    }

    private long calc (long o1, long o2) {
        return 0;
    }

}
