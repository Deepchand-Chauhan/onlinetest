import java.io.IOException;

import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
public class Ques3 extends HttpServlet
{
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

protected void doGet(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException
{
res.setContentType("text/html");
PrintWriter pw=res.getWriter();

  HttpSession ses=req.getSession(false);
String nam2=(String)ses.getAttribute("name");
 String qs1=req.getParameter("q3");
 String qs="";
 if(qs1==null)
 {
	 qs="f";
	 System.out.println(qs);
 }else
 {
	 qs=qs1;
 }

 pw.println(qs);
 pw.println(nam2);
   
int i=PortDaos23.valid4(nam2,qs);
 if(i!=0)
 {

  pw.println("success");

  req.getRequestDispatcher("q4.html").forward(req,res);
 }
 else 
 {
 pw.println("error");
 req.getRequestDispatcher("q3.html").include(req,res);
 }
 
 pw.close();
}
}