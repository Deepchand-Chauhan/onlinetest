import java.io.*;

import java.io.PrintWriter;

import java.sql.*;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import javax.servlet.http.HttpServlet;

public class Logreg extends HttpServlet
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	int i;
protected void doGet(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException
{
res.setContentType("text/html");
PrintWriter pw=res.getWriter();
req.getRequestDispatcher("web5.html").include(req,res);
String nm=req.getParameter("uname");
String ps=req.getParameter("sname");
String pss=req.getParameter("pw");
String pssw=req.getParameter("cpw");
String gen=req.getParameter("gender");
String y=req.getParameter("year");
String mon=req.getParameter("month");
String d=req.getParameter("day");
String mail=req.getParameter("eml");
String po=req.getParameter("pno");
try{
Connection con=null;
Class.forName("com.mysql.jdbc.Driver");
if(nm!=null&&ps!=null&&pss!=null&&pssw!=null&&gen!=null&&y!=null&&mon!=null&&d!=null&&mail!=null&&po!=null)
{
	if(nm!=""&&ps!=""&&pss!=""&&pssw!=""&&gen!=""&&y!=""&&mon!=""&&d!=""&&mail!=""&&po!="")
	{
		
	

con=DriverManager.getConnection("jdbc:mysql://localhost/test","root","deep");
String sql="insert into deep11(uname,srname,pass,cpass,gender,year,month,day,mail,pno) values (?,?,?,?,?,?,?,?,?,?)";
PreparedStatement ps1=con.prepareStatement(sql);
ps1.setString(1,nm);
ps1.setString(2,ps);
ps1.setString(3,pss);
ps1.setString(4,pssw);
ps1.setString(5,gen);
ps1.setString(6,y);
ps1.setString(7,mon);
ps1.setString(8,d);
ps1.setString(9,mail);
ps1.setString(10,po);
i=ps1.executeUpdate();
pw.println(" <h1>you are successfully signup</h1>");
con.close();
	}
	else{	pw.println("<table><td><h3 style='color:cyan;'> Please Fill Your credentials</h3></td></table>");}
}
else
{
pw.println("<table><td><h3 style='color:cyan;'> Please Fill Your credentials</h3></td></table>");
}
}
catch(Exception e){pw.println("Sql Exception");}

pw.close();
}
}