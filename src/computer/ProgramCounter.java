package computer;

public class ProgramCounter {

    private int index;

    public ProgramCounter () {
        index = 0;
    }

    public int getIndex () {
        return index;
    }

    public boolean setIndex (int i) {
        index = i;
        return true;
    }

    public boolean inc () {
        index++;
        return true;
    }

}
