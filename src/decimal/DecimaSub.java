package decimal;

import strategy.CalcStrategy;

public class DecimaSub implements CalcStrategy {
    @Override
    public Integer calculate(Integer a, Integer b){

        Integer res = a - b;
        System.out.println("Результат в шестнадцатиричном представлении: 0x" + Integer.toHexString(res));
        return res;


    }
}
