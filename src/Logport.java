import java.io.IOException;

import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpServlet;

public class Logport extends HttpServlet
{
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

protected void doGet(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException
{
HttpSession ses=req.getSession();
res.setContentType("text/html");
PrintWriter pw=res.getWriter();
String nam1=req.getParameter("nm");

String pas1=req.getParameter("ps");



if(PortDao.valid(nam1,pas1))
{


ses.setAttribute("name",nam1);
req.getRequestDispatcher("index2.html").include(req,res);
req.getRequestDispatcher("title.html").forward(req,res);

}
else
{
pw.println("<h3 style='color:red;'>username or password incorrect</h3>");
req.getRequestDispatcher("web5.html").include(req,res);
}
pw.close();
}
}