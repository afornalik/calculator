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
    public BigDecimal divide(BigDecimal firstNumber, BigDecimal secondNumber) {

        return tryDivide(firstNumber,secondNumber);
    }

    @Override
    public BigDecimal multiply(BigDecimal firstNumber, BigDecimal secondNumber) {
        return firstNumber.multiply(secondNumber);
    }

    private BigDecimal tryDivide(BigDecimal firstNumber, BigDecimal secondNumber) {
        BigDecimal result = BigDecimal.ZERO;
        try {
            result = firstNumber.divide(secondNumber, 2);
        }catch(Exception e) {
            e.printStackTrace();
        }
        return result;
    }
}
