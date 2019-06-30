package web;

        import javax.servlet.annotation.WebServlet;
        import javax.servlet.http.HttpServlet;
        import javax.servlet.http.HttpServletRequest;
        import javax.servlet.http.HttpServletResponse;
        import java.util.Map;

@WebServlet(value="/calculator")
public class CalculatorServlet extends HttpServlet {

    public void doPost(HttpServletRequest request, HttpServletResponse response) {
      Map<String,String[]> parameter =  request.getParameterMap();


      parameter.keySet().forEach(System.out::println);


        System.out.println("----");
      for(String[] val: parameter.values()){
          for(String v: val){
              System.out.println(v);
          }
      }


    }

}
