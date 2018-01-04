import java.sql.*;

public class MysqlConnect
{
	 Connection con = null;
	  Statement stat1,stat2,stat3,stat4,stat5,stat6,stat7,stat8,stat9,stat10;
	public MysqlConnect()
	{
		  String url = "jdbc:mysql://localhost:3306/";
		  String dbName = "protein";
		  String driver = "com.mysql.jdbc.Driver";
		  String userName = "root";
		  String password = "root";
		  try {
		  	   Class.forName(driver).newInstance();
		  	   con = DriverManager.getConnection(url+dbName,userName,password);
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
		       System.out.println("Connected to the database");

		  } catch (Exception e) {
		  e.printStackTrace();
  }
	}

}