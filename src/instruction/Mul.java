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

//        if (op1 instanceof Word) {
//            o1 = ((Word) op1).word;
//        }
//        else {
//            o1 = m.read(((Address)op1).index).word;
//        }
//
//        if (op2 instanceof Word) {
//            o2 = ((Word) op2).word;
//        }
//        else {
//            o2 = m.read(((Address)op2).index).word;
//        }

        if (op1 instanceof Address) {
            Address o1 = (Address)op1;
            n1 = new LongWord(m.read(o1.index).word.longValue());
        }
        else {
            n1 = (Word) op1;
        }

        if (op2 instanceof Address) {
            Address o2 = (Address)op2;
            n2 = new LongWord(m.read(o2.index).word.longValue());
        }
        else {
            n2 = (Word) op2;
        }

        m.write(out.index, new LongWord(calc( n1.word.longValue(), n2.word.longValue() )));
    }

    public long calc (long o1, long o2) {
        return o1*o2;
    }
}
