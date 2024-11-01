package instruction;

import computer.ProgramCounter;
import data.Address;
import data.Memory;
import data.Word;

public class JumpEq implements Instruction {

    private final int toIndex;

    private final Object op1;

    private final Object op2;

    public JumpEq (int n, Object o1, Object o2) {

        toIndex = n;
        op1 = o1;
        op2 = o2;
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

        if ( n1.equals(n2) ) {
            pc.setIndex(toIndex);
        }
    }

    public String toString() {
        return "JEQ " + toIndex + " " + op1.toString() + " " + op2.toString();
    }
}
