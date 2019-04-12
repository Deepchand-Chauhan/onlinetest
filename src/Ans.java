import java.io.IOException;

import java.io.PrintWriter;
import java.sql.*; 
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Ans extends HttpServlet
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
 
   
try{  
Class.forName("com.mysql.jdbc.Driver");  
Connection con=DriverManager.getConnection(  
"jdbc:mysql://localhost/test","root","deep");  
      
	  String sql="select question,question2,question3,question4,question5,question6,question7,question8,question9,question10,question11,question12,question13,question14,question15,question16,question17,question18,question19,question20 from deep11 where uname=? ";
PreparedStatement st=con.prepareStatement(sql);  
st.setString(1,nam2);
  
  
       pw.print("<table width=50% border=1>");  
    pw.print("<caption><h1>Result:</h1></caption>");  
	pw.println("<h2>Congratulation .."+nam2+"  You got  </h2>");
 
 ResultSet rs=st.executeQuery();
while(rs.next())
{
 int n=0;

if(rs.getString(1).equals("c"))
{
n++;

}
else 
{}
if(rs.getString(2).equals("a"))
{
n++;

}
else 
{}
if(rs.getString(3).equals("c"))
{
n++;

}
else 
{}
 if(rs.getString(4).equals("a"))
{
n++;

}
else {}

if(rs.getString(5).equals("c"))
{
n++;

}
else 
{}

if(rs.getString(6).equals("c"))
{
n++;

}
else 
{}
if(rs.getString(7).equals("a"))
{
n++;

}
else 
{}
if(rs.getString(8).equals("b"))
{
n++;

}
else 
{}
if(rs.getString(9).equals("c"))
{
n++;

}
else 
{}
if(rs.getString(10).equals("b"))
{
n++;

}
else 
{}
if(rs.getString(11).equals("a"))
{
n++;

}
else 
{}
if(rs.getString(12).equals("a"))
{
n++;

}
else 
{}
if(rs.getString(13).equals("c"))
{
n++;

}
else 
{}
if(rs.getString(14).equals("d"))
{
n++;

}
else 
{}
if(rs.getString(15).equals("b"))
{
n++;

}
else 
{}
if(rs.getString(16).equals("c"))
{
n++;

}
else 
{}
if(rs.getString(17).equals("b"))
{
n++;

}
else 
{}
if(rs.getString(18).equals("c"))
{
n++;

}
else 
{}
if(rs.getString(19).equals("c"))
{
n++;

}
else 
{}
if(rs.getString(20).equals("a"))
{
n++;

}
else 
{}
pw.println("<tr><td><h1>");
pw.println(n+"/20");


pw.println("</h1></td></tr>");
pw.println("</table>");
}
while(rs.next())
{
pw.println("<tr><td>"+rs.getString(1)+"</td><td>"+rs.getString(2)+"</td><td>"+rs.getString(3)+"</td><td>"+rs.getString(4)+"</td><td>"+rs.getString(5)+"</td><td>"+rs.getString(6)+"</td><td>"+rs.getString(7)+"</td><td>"+rs.getString(8)+"</td><td>"+rs.getString(9)+"</td><td>"+rs.getString(10)+"</td><td>"+rs.getString(11)+"</td><td>"+rs.getString(12)+"</td><td>"+rs.getString(13)+"</td><td>"+rs.getString(14)+"</td><td>"+rs.getString(15)+"</td><td>"+rs.getString(16)+"</td><td>"+rs.getString(17)+"</td><td>"+rs.getString(18)+"</td><td>"+rs.getString(19)+"</td><td>"+rs.getString(20)+"</td></tr>");
}

pw.println();
pw.println();
pw.print("<table width=50% border=1>"); 
 



pw.println("</table>");
con.close();
 }catch(Exception e){System.out.println(e);}
 
 
 
 pw.close();
}
}