import java.sql.*;  
 
public class PortDaos23 { 
static int i=0; 
public static int valid4(String nam2,String qs){  
  
try{  
Class.forName("com.mysql.jdbc.Driver");  
Connection con=DriverManager.getConnection(  
"jdbc:mysql://localhost/test","root","deep");  
      
	
 
  String sql="update deep11 set question3=? where uname=? ";
  PreparedStatement st=con.prepareStatement(sql);
  st.setString(1,qs);
  st.setString(2,nam2);
   System.out.println(nam2+" "+qs);   
 i=st.executeUpdate();  
System.out.println(i);
//status=rs.next();  

          con.close();
}catch(Exception e){System.out.println(e);}  
return i;  
}  
}  
