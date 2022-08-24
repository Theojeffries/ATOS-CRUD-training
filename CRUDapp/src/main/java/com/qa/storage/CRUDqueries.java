package com.qa.storage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.cj.jdbc.CallableStatement;
import com.mysql.cj.xdevapi.Statement;

public class CRUDqueries {
	
	
	private Connection conn;
	private Statement stmt;     
	
	public CRUDqueries() {
		try { 
			conn = DriverManager.getConnection(DBconfig.URL, DBconfig.USER, DBconfig.PASS);
					
			
		}catch(SQLException e) {
			
		}
	}
}

	
	


	
	
	
	
	
