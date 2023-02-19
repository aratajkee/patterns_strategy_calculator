import strategy.CalcStrategy;

public class Calculator {
    CalcStrategy calcStrategy;
    public void setCalcMode(CalcStrategy calcStrategy){
        this.calcStrategy = calcStrategy;
    }
    public void calculate(Integer a, Integer b){
        calcStrategy.calculate(a,b);
    }

}
