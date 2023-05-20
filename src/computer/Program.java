package computer;

import data.Memory;
import instruction.Instruction;

import java.util.ArrayList;
import java.util.List;

public class Program {

    public List<Instruction> instList;

    public Program () {
        instList = new ArrayList<Instruction>();
    };

    public boolean add (Instruction i) {
        instList.add(i);
        return true;
    }

}
