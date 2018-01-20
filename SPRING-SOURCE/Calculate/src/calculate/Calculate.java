/*
 * Рассмотрим простое приложение по сложению двух чисел и выводу результата. 
 * Все приложение можно написать при помощи лишь одного класса Calculate. 
 * Что, если нам понадобилось изменить сложение в методе operate на умножение 
 * или выводить результат в методе showResult не на экран, а в файл. 
 * В этих случаях код программы нужно постоянно менять. 
 */
package calculate;

public class Calculate {

    private Operation ops = new OpAdd();
    private ResultWriter wtr = new ScreenWriter();

    public static void main(String[] args) {
        Calculate calc = new Calculate();
        calc.execute(args);
    }

    public void execute(String[] args) {
        long op1 = Long.parseLong(args[0]);
        long op2 = Long.parseLong(args[1]);
        wtr.showResult("The result of " + op1 + ops.getOpsName() + op2 + " is " + ops.operate(op1, op2) + "!");
    }
}
