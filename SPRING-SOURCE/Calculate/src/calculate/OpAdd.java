/*
 * Реализует инфтерфейс Operation
 */
package calculate;

public class OpAdd implements Operation {

    public OpAdd() {
    }

    @Override
    public String getOpsName() {
        return " plus ";
    }

    @Override
    public long operate(long op1, long op2) {
        return op1 + op2;
    }
}
