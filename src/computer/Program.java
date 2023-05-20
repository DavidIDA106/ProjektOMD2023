package computer;

import instruction.Instruction;

import java.util.List;

public class Program {

    private ProgramCounter pc;

    private List<Instruction> instList;

    public Program () {
        pc = new ProgramCounter();
    }

    public boolean add (Instruction i) {
        instList.add(i);
        return true;
    }

    public void reset () {
        pc.setIndex(0);
    }

    public void run () {

        int ret = 0;

        while (ret >= 0) {

            ret = instList.get(pc.getIndex()).exec();

            if (ret > 0) {
                pc.setIndex(ret);
            }
            else pc.inc();
        }
    }
}
