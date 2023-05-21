package instruction;

import computer.ProgramCounter;
import data.Address;
import data.LongWord;
import data.Memory;
import data.Word;

public class JumpEq implements Instruction {

    private int toIndex;

    private Object op1;

    private Object op2;

    public JumpEq (int n, Object o1, Object o2) {

        toIndex = n;
        op1 = o1;
        op2 = o2;
    }

//    public JumpEq (int n, Word o1, Word o2) {
//
//    }
//
//    public JumpEq (int n, Word o1, Address o2) {
//
//    }
//
//    public JumpEq (int n, Address o1, Word o2) {
//
//    }
//
//    public JumpEq (int n, Address o1, Address o2) {
//
//    }

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

        if ( n1.equals(n2) ) {
            pc.setIndex(toIndex);
        }
    }
}
