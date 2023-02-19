package decimal;

import strategy.CalcStrategy;

public class DecimalPow implements CalcStrategy {
    @Override
    public Integer calculate(Integer a, Integer b){

        int tmp = a;
        for (int i = 1; i < b; i++) {
            a *=tmp;
        }
        Integer res = a;
        System.out.println("Результат в десятичном представлении: " + res);
        return res;

    }
}
