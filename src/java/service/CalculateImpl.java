package service;

import java.math.BigDecimal;

public class CalculateImpl implements Calculate {



    @Override
    public BigDecimal add(BigDecimal firstNumber, BigDecimal secondNumber) {
        return firstNumber.add(secondNumber);
    }

    @Override
    public BigDecimal subtract(BigDecimal firstNumber, BigDecimal secondNumber) {
        return firstNumber.subtract(secondNumber);
    }

    @Override
    public BigDecimal divide(BigDecimal firstNumber, BigDecimal secondNumber) throws ArithmeticException{
        return firstNumber.divide(secondNumber);
    }

    @Override
    public BigDecimal multiply(BigDecimal firstNumber, BigDecimal secondNumber) {
        return firstNumber.multiply(secondNumber);
    }


}
