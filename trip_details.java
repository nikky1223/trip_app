package nikky.rest_api;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class trip_details {
	
	
	@GetMapping("/get_flights")
	public String get_flights ( @RequestParam String start_point , @RequestParam String destination_point , @RequestParam String date ) throws SQLException {
		
		
		
		
		
		return date+"\n"+destination_point+"\n"+start_point;
		
		
		
		
		
	}
	
	



}
