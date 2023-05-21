package instruction;

import computer.ProgramCounter;
import data.Address;
import data.Memory;
import data.Word;

public class Copy implements Instruction {

    Object in;
    Address out;

    public Copy (Object op, Address n) {
        in = op;
        out = n;
    }

    public void exec (Memory m, ProgramCounter pc) {

        if (in instanceof Word) {
            m.write(out.index, (Word)in);
        }
        else {
            m.write(out.index, m.read(((Address)in).index));
        }
    }

    public String toString() {
        return "CPY " + in.toString() + " " + out.toString();
    }
}
