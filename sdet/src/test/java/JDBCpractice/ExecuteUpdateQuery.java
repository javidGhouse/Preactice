package JDBCpractice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;



public class ExecuteUpdateQuery {

	public static void main(String[] args) throws SQLException {

		Driver dri=new Driver();
		DriverManager.registerDriver(dri);
		Connection co=DriverManager.getConnection("jdbc:mysql://localhost:3306/students_info","root","root");
		Statement stmt=co.createStatement();
		
		//int result = stmt.executeUpdate("CREATE TABLE ippo(STU_NAME VARCHAR(25) NOT NULL,STU_ID int"
		//		+ ",PHONE_NO int NOT NULL,DEPARTMENT VARCHAR(20) NOT NULL,PRIMARY KEY(STU_ID))");

		int result1=stmt.executeUpdate("insert into suma (stu_name,"
				+ " stu_id,phone_no, department) values ('santhosh',123654789,123456789,'abc')");
		
		//stmt.executeUpdate("delete from suma where stu_id=779 ");
	
	}

}
