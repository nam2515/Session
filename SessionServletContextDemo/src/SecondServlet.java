

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SecondServlet
 */
@WebServlet("/SecondServlet")
public class SecondServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SecondServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		 PrintWriter out = response.getWriter();
	      String lname=request.getParameter("lname");
	      ServletContext sc= getServletContext();
	      String fname=(String) sc.getAttribute("fname");
	      out.println(fname);
	      out.println("<br>");
	      out.println(lname);
	      out.println("<html>");
	      out.print("<body>");
		  out.print("<form action=ThirdServlet>");
		  out.print("Qualification: <input type=text name=qualification />");
		  out.print("<input type=submit />");
		  out.print("</form>");
		  out.print("</body>");
		  out.print("</html>");
		  
		  sc.setAttribute("lname", lname);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
