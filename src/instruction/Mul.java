package instruction;

import data.Address;

public class Mul extends Arithmetic {

    public Mul(Object op1, Object op2, Address n) {
        super(op1, op2, n);
    }

    public long calc (long o1, long o2) {
        return o1*o2;
    }
}
