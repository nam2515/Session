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
 * Servlet implementation class Secondservlet
 */
@WebServlet("/Secondservlet")
public class Secondservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Secondservlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		  response.setContentType("text/html");
		  HttpSession session=request.getSession();
		  PrintWriter out = response.getWriter();
	      String lname=request.getParameter("Lname");
	      String fname=(String) session.getAttribute("Fname");
	      out.println(fname);
	      out.println("<br>");
	      out.println(lname);
	      out.println("<html>");
	      out.print("<body>");
		  out.print("<form action=Thirdservlet>");
		  out.print("Qualification: <input type=text name=qualification />");
		  out.print("<input type=submit />");
		  out.print("</form>");
		  out.print("</body>");
		  out.print("</html>");
		  
		  session.setAttribute("Fname", fname);
		  session.setAttribute("Lname", lname);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
