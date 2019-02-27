

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ThirdServlet
 */
@WebServlet("/ThirdServlet")
public class ThirdServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ThirdServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		PrintWriter out=response.getWriter();
		ServletContext sc= getServletContext();
		 String qual=request.getParameter("qualification");
	      String fname=(String)sc.getAttribute("fname");
	      String lname=(String)sc.getAttribute("lname");
	     
	      out.println(fname);
	      out.println("<br>");
	      out.println(lname);
	      out.println("<br>");
	      out.println(qual);
	      out.println("<html>");
	      out.print("<body>");
		  out.print("<form action=FourthServlet>");
		  out.print("Marks: <input type=number name=marks />");
		  out.print("<input type=submit />");
		  out.print("</form>");
		  out.print("</body>");
		  out.print("</html>");
		  
		  sc.setAttribute("qualification",qual );
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
