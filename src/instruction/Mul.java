package instruction;

import computer.ProgramCounter;
import data.Address;
import data.LongWord;
import data.Memory;
import data.Word;

public class Mul extends Arithmetic {

    public Mul(Object op1, Object op2, Address n) {
        super(op1, op2, n);
    }

    public void exec (Memory m, ProgramCounter pc) {

        Word n1 = null;
        Word n2 = null;

        if (op1 instanceof Address) {
            Address o1 = (Address)op1;
            n1 = new LongWord(m.read(o1.index).get().longValue());
        }
        else {
            n1 = (Word) op1;
        }

        if (op2 instanceof Address) {
            Address o2 = (Address)op2;
            n2 = new LongWord(m.read(o2.index).get().longValue());
        }
        else {
            n2 = (Word) op2;
        }

        m.write(out.index, new LongWord(calc( n1.get().longValue(), n2.get().longValue() )));
    }

    public long calc (long o1, long o2) {
        return o1*o2;
    }

    public String toString() {
        return "MUL " + op1.toString() + " " + op2.toString();
    }
}
