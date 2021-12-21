package JDBCpractice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class selectQuery {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		Connection con=null;
		try {	
		Driver dri=new Driver();
		DriverManager.registerDriver(dri);
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/students_info","root","root");
		Statement stmt=con.createStatement();
		String query="select * from suma;";
		ResultSet res=stmt.executeQuery(query);
		
		while(res.next())
		{
			System.out.println(res.getString(1)+"\t"+res.getString(2)+"\t"+res.getString(3)+"\t"+res.getString(4));
		}
	}
		
	catch(Exception e) {
		e.printStackTrace();
	}
	finally {
		con.close();
	}
	}

}
