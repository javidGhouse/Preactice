	package fileUtility;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import com.mysql.cj.jdbc.Driver;


public class dataBaseUtility {

		Connection con=null; 
	
		public void connectDb() throws Exception
		{
			Driver ref=new Driver();
			DriverManager.registerDriver(ref);
			con=DriverManager.getConnection(IpathConstant.dbPath,IpathConstant.un,IpathConstant.pwd);
			
		}
		
		public void create(String query,int column,String expectedRes) throws Exception
		{
		
			ResultSet result=con.createStatement().executeQuery(query);
			
			boolean flag=false;
			
			while(result.next())
			{
				String actualRes=result.getString(column);
				if(expectedRes.equalsIgnoreCase(actualRes))
				{
					flag=true;
					break;
				}
			}
			
			if(flag=true)
			{
				System.out.println("query Executed");
			}
			else
			{
				System.out.println("Query not Executed");
			}
		}
		
		public void closeDb() throws Exception
		{
			con.close();
		}
	
}
