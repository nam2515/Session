package com.capgemini.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Thirdservlet
 */
@WebServlet("/Thirdservlet")
public class Thirdservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Thirdservlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		 response.setContentType("text/html");
	      PrintWriter out = response.getWriter();
	      HttpSession session=request.getSession();
	      String qual=request.getParameter("qualification");
	      String fname=(String)session.getAttribute("Fname");
	      String lname=(String)session.getAttribute("Lname");
	     
	      out.println(fname);
	      out.println("<br>");
	      out.println(lname);
	      out.println("<br>");
	      out.println(qual);
	      out.println("<html>");
	      out.print("<body>");
		  out.print("<form action=Fourthservlet>");
		  out.print("Marks: <input type=number name=marks />");
		  out.print("<input type=submit />");
		  out.print("</form>");
		  out.print("</body>");
		  out.print("</html>");
		  
		  session.setAttribute("Fname", fname);
		  session.setAttribute("Lname", lname);
		  session.setAttribute("qualification",qual );
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
