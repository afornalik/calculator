package control;

import service.Calculate;

import java.math.BigDecimal;

public class CalculatorSelectorImpl implements CalculatorSelector{

    private final BigDecimal firstNumber;
    private final BigDecimal secondNumber;
    private final Calculate calculate;



    public CalculatorSelectorImpl(BigDecimal firstNumber, BigDecimal secondNumber,Calculate calculate) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
        this.calculate = calculate;

    }

    @Override
    public BigDecimal calculate(Operations operations) {
        switch(operations) {
            case ADD: return calculate.add(firstNumber,secondNumber);
            case SUBTRACT: return calculate.subtract(firstNumber,secondNumber);
            case DIVIDE: return calculate.divide(firstNumber,secondNumber);
            case MULTIPLY: return  calculate.multiply(firstNumber,secondNumber);
        }
        return null;
    }


}
