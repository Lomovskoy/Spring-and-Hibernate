/*
 * Нам нужно разъединить логику приложения от математических операций, 
 * и от метода сохранения результатов, при помощи интерфейсов. 
 * Первый интерфейс будет называться Operation. В нем мы объявим два метода 
 * operate(long op1, long op2) и getOpsName(). После этого, если мы захотим 
 * сделать сложение, то мы просто будем реализовывать этот интерфейс. 
 * Для других математических действий все делаем также. 
 */
package calculate;

public interface Operation {

    long operate(long op1, long op2);

    String getOpsName();
}
