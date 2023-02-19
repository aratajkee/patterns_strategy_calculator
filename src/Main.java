import decimal.DecimalAdd;
import decimal.DecimalPow;
import hex.HexAdd;
import hex.HexPow;

public class Main {
    public static void main(String[] args) {

        Calculator calculator = new Calculator();
        calculator.setCalcMode( new DecimalAdd());
        calculator.calculate(123, 123);

        calculator.setCalcMode(new HexAdd());
        calculator.calculate(0x123, 0x12);

        calculator.setCalcMode(new DecimalPow());
        calculator.calculate(2,10);

        calculator.setCalcMode(new HexPow());
        calculator.calculate(0xAF,0x2);

    }


}