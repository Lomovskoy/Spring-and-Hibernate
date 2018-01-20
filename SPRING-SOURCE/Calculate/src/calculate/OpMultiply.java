/*
 * Реализует инфтерфейс Operation
 */
package calculate;

public class OpMultiply implements Operation {

    public OpMultiply() {
    }

    @Override
    public String getOpsName() {
        return " times ";
    }

    @Override
    public long operate(long op1, long op2) {
        return op1 * op2;
    }
}
