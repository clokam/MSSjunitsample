package wasdev.sample.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SimpleServlet,Message
 */
@WebServlet("/SimpleServlet")
public class SimpleServlet extends HttpServlet  {
    private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        Message m2=new  Message();
        boolean result=true;
       // boolean result =m2.getFinalResult();
        response.getWriter().print("Hello World!"+result+ m2.a);
      
        
        
    }
   
}
