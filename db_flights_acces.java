package nikky.rest_api;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class db_flights_acces {
	
	public Connection get_connection() throws ClassNotFoundException, SQLException {
		String url="jdbc:mysql://127.0.0.1:3306/flight_schedule";
		String username="root";
		String pwd="";
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(url, username, pwd);
		return con;		
	}
	
}
