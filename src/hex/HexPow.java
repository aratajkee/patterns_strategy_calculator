package hex;

import strategy.CalcStrategy;

public class HexPow implements CalcStrategy {
    @Override
    public Integer calculate(Integer a, Integer b){

        int tmp = a;
        for (int i = 1; i < b; i++) {
            a*=tmp;
        }

        System.out.println("Результат в шестнадцатиричном представлении: 0x" + Integer.toHexString(a));
        return a;


    }
}
