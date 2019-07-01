package service;

import java.math.BigDecimal;

public interface Calculate {

    BigDecimal add(BigDecimal firstNumber, BigDecimal secondNumber);
    BigDecimal subtract(BigDecimal firstNumber, BigDecimal secondNumber);
    BigDecimal divide(BigDecimal firstNumber, BigDecimal secondNumber) throws ArithmeticException;
    BigDecimal multiply(BigDecimal firstNumber, BigDecimal secondNumber);

}
