package computer;

import instruction.Instruction;

import java.util.List;

public class Program {

    private List<Instruction> instList;

    public Program () {};

    public boolean add (Instruction i) {
        instList.add(i);
        return true;
    }

}
