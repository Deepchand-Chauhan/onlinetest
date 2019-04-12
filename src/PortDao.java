import java.sql.*;  
 
public class PortDao {  
public static boolean valid(String nam1,String pas1){  
boolean status=false;  
try{  
Class.forName("com.mysql.jdbc.Driver");  
Connection con=DriverManager.getConnection(  
"jdbc:mysql://localhost/test","root","deep");  
      
PreparedStatement ps=con.prepareStatement(  
"select * from deep11 where uname=? and pass=?");  
ps.setString(1,nam1);  
ps.setString(2,pas1);  
      
ResultSet rs=ps.executeQuery();  
status=rs.next();  
con.close();
          
}catch(Exception e){System.out.println(e);}  
return status;  
}  
}  
