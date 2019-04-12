
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;  
 
public class PortDaos11 { 
static int i=0; 
public static int valid11(String nam2,String qs){  
  
try{  
Class.forName("com.mysql.jdbc.Driver");  
Connection con=DriverManager.getConnection(  
"jdbc:mysql://localhost/test","root","deep");  
      
	

  String sql="update deep11 set question11=? where uname=? ";
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



