package service.calculator;

import java.math.BigDecimal;
import java.math.RoundingMode;

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
        return firstNumber.divide(secondNumber,2, RoundingMode.HALF_UP);
    }

    @Override
    public BigDecimal multiply(BigDecimal firstNumber, BigDecimal secondNumber) {
        return firstNumber.multiply(secondNumber);
    }

    @Override
    public BigDecimal strong(BigDecimal number) {
        return calculateStrong(number);
    }

    public BigDecimal calculateStrong(BigDecimal number) {

        BigDecimal result = BigDecimal.ONE;

        for(int i = 1; i<= number.intValue(); i++) {
            result = result.multiply(BigDecimal.valueOf(i));
        }
        return result;
    }


}
