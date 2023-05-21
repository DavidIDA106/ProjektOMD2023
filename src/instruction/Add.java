package instruction;

import computer.ProgramCounter;
import data.Address;
import data.LongWord;
import data.Memory;
import data.Word;

public class Add extends Arithmetic {

    public Add (Object op1, Object op2, Address n) {
        super(op1, op2, n);
    }

    public void exec (Memory m, ProgramCounter pc) {

        Word n1 = null;
        Word n2 = null;

        if (op1 instanceof Address) {
            Address o1 = (Address)op1;
            n1 = m.read(o1.index);
        }
        else {
            n1 = (Word) op1;
        }

        if (op2 instanceof Address) {
            Address o2 = (Address)op2;
            n2 = m.read(o2.index);
        }
        else {
            n2 = (Word) op2;
        }

        //m.read(out.index).add(n2.get());
        m.write(out.index, n1.copyAdd(n2.get()));
    }

    public String toString() {
        return "ADD " + op1.toString() + " " + op2.toString();
    }
}
