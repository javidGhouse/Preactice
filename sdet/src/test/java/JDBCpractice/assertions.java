package JDBCpractice;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class assertions {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		Driver dri=new Driver();
		DriverManager.registerDriver(dri);
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/students_info","root","root");
		Statement stmt=con.createStatement();
		String query="select * from suma where stu_id=123654789``";
		ResultSet res=stmt.executeQuery(query);
		
		String expectedres="santhosh";
		
	}

}
