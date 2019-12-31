package jdbc;

import java.sql.*;
import oracle.jdbc.driver.OracleDriver;

public class JdbcMain {
	
	public static void main(String[]args) {
		JdbcMain ex=new JdbcMain();
		ex.execute();
	}
	
	public void execute() {
		try {
		//Register Driver
		DriverManager.deregisterDriver(new OracleDriver());
		String url="jdbc:oracle:thin:@localhost:1521:orcl";
		//Creating Connection
		Connection connection= DriverManager.getConnection(url,"scott","tiger");
		//create statement object
		Statement statement=connection.createStatement();
		//execute query to fetch result
		ResultSet resultSet=statement.executeQuery("select * from employees");
		while(resultSet.next()) {
			int id=resultSet.getInt("id");
			String name=resultSet.getString("name");
			System.out.println("id="+id+"name="+name);
		}
		
	}catch(SQLException e) {
		e.printStackTrace();
	}

	}
}
