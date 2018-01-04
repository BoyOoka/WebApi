package com.test.json;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Sqlconnect {
	public ResultSet Sqlconnect(String query){
	String driver = "com.mysql.jdbc.Driver";
	String url = "jdbc:mysql://localhost:3306/study?useSSL=true";
	String username = "root";
	String password = "8623116";
	ResultSet rs = null;
	try{
		Class.forName(driver);
		Connection con = DriverManager.getConnection(url, username, password);
		Statement st = con.createStatement();
		rs = st.executeQuery(query);
	/*
		while(rs.next()){
			System.out.print(rs.getString(1)+"\t");
			System.out.print(rs.getString(2)+"\t");
			System.out.print(rs.getString(3)+"\n");
		}*/
		
		rs.close();
		st.close();
		con.close();
	}catch(Exception e){
		
	}
	return rs;
 }
}
