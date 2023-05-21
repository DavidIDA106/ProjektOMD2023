package instruction;

import computer.ProgramCounter;
import data.Address;
import data.LongWord;
import data.Memory;

public class Add extends Arithmetic {

    public Add (Object op1, Object op2, Address n) {
        super(op1, op2, n);
    }

    public void exec (Memory m, ProgramCounter pc) {
        if (op1 instanceof Address) {
            Address o1 = (Address)op1;
            op1 = new LongWord(m.read(o1.index).word.longValue());
        }

        if (op2 instanceof Address) {
            Address o2 = (Address)op2;
            op2 = new LongWord(m.read(o2.index).word.longValue());
        }

        m.write(out.index, new LongWord(calc( (((LongWord)op1).word) , ((LongWord)op2).word)));
    }

    private long calc (long o1, long o2) {
        return o1 + o2;
    }
}
