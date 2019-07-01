package web;

        import control.CalculatorSelector;
        import control.CalculatorSelectorImpl;
        import control.Operations;
        import service.CalculateImpl;

        import javax.servlet.RequestDispatcher;
        import javax.servlet.ServletException;
        import javax.servlet.annotation.WebServlet;
        import javax.servlet.http.HttpServlet;
        import javax.servlet.http.HttpServletRequest;
        import javax.servlet.http.HttpServletResponse;
        import java.io.IOException;
        import java.math.BigDecimal;
        import java.util.Map;

@WebServlet(value="/calculator")
public class CalculatorServlet extends HttpServlet {

    private CalculatorSelector calculatorSelector;
    private String errorMessage;


    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

        calculatorSelector = new CalculatorSelectorImpl(
                new BigDecimal(request.getParameter("firstNumber")),
                new BigDecimal(request.getParameter("secondNumber")),
                new CalculateImpl()) ;

        try{
            BigDecimal result = calculatorSelector.calculate(Operations.valueOf(request.getParameter("operation")));
            request.setAttribute("result",result);
            request.setAttribute("fNumber",request.getParameter("firstNumber"));
            request.setAttribute("sNumber",request.getParameter("secondNumber"));
        }catch (ArithmeticException e){
            errorMessage="Don't divide by 0";
            request.setAttribute("errorMessage",errorMessage);
        }

        RequestDispatcher requestDispatcher = request.getRequestDispatcher("/calculator.jsp");
        requestDispatcher.forward(request,response);
    }

}
