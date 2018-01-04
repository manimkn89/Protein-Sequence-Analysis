 import java.sql.*;
public class database_conn {

Connection con=null;
 Statement stat=null;
 Statement stat1=null;
 Statement stat2=null;
 Statement stat3=null;
 Statement stat4=null;
 Statement stat5=null;
 Statement stat6=null;
 Statement stat7=null;
 Statement stat8=null;
 Statement stat9=null;
 Statement stat10=null;
 Statement st=null;
 public database_conn()
 {
	 try
	 {
	   Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
	   con=DriverManager.getConnection("jdbc:odbc:protein","","");
	   st=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
	   stat=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
	   stat1=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
	   stat2=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
	   stat3=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
	   stat4=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
	   stat5=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
	   stat6=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
	   stat7=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
	   stat8=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
	   stat9=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
	   stat10=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
	   String nam="santhosh";
	   System.out.println("connected");
	  // st.executeUpdate("insert into sample values('"+nam+"')");
	  // System.out.println("insert into sample values('"+nam+"')");

     }

     catch(Exception e)
     {
		 System.out.println("Error in database_conn.java "+e);
	 }



 }
 public static void main(String ar[])
 {
	 database_conn db=new database_conn();
 }


}


