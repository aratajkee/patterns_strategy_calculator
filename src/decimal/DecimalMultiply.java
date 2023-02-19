package decimal;

import strategy.CalcStrategy;

public class DecimalMultiply implements CalcStrategy {
    @Override
    public Integer calculate(Integer a, Integer b){
        Integer res =  a * b;
        System.out.println("Результат в десятичном представлении: " + res);
        return res;

    }
}
