package control;

import java.math.BigDecimal;

@FunctionalInterface
public interface CalculatorSelector {

    BigDecimal calculate(Operations operations);
}
