package instruction;

import data.Address;

public class Add extends Arithmetic {

    public Add (Object op1, Object op2, Address n) {
        super(op1, op2, n);
    }

    private long calc (long o1, long o2) {
        return o1 + o2;
    }
}
