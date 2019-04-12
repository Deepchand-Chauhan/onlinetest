import java.io.*;

import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import javax.servlet.ServletException;
public class Portprof1 extends HttpServlet
{
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

protected void doGet(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException
{
res.setContentType("text/html");
PrintWriter pw=res.getWriter();


req.getRequestDispatcher("indexportalink.html").include(req,res);
HttpSession ses=req.getSession(false);

if(ses!=null)
{


pw.println("Welcome to profile  "+ses.getAttribute("name"));

}
else {
pw.println("please login first");
req.getRequestDispatcher("web5.html").include(req,res);
}
pw.close();
}
}