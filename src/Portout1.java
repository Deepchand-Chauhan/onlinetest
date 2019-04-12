import java.io.*;

import java.io.PrintWriter;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.ServletException;
public class Portout1 extends HttpServlet{
 /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

protected void doGet(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException
{
res.setContentType("text/html");
PrintWriter pw=res.getWriter();
req.getRequestDispatcher("indexportalink.html").include(req,res);
HttpSession s=req.getSession();
s.invalidate();
pw.println("you are successfully logout");
req.getRequestDispatcher("submitq.html").forward(req,res);
pw.close();
} 
}