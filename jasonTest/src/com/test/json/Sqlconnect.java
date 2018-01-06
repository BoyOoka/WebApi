package com.test.json;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;

public class Sqlconnect {
	public String Sqlconnect(String query){
	String driver = "com.mysql.jdbc.Driver";
	String url = "jdbc:mysql://localhost:3306/study?useSSL=true";
	String username = "root";
	String password = "8623116";
	ResultSet rs = null;
	String json = null;
	List<jsonDemo> list = new ArrayList<jsonDemo>(); 
	 Gson gson = new Gson();
	try{
		Class.forName(driver);
		Connection con = DriverManager.getConnection(url, username, password);
		Statement st = con.createStatement();
		rs = st.executeQuery(query);
		while(rs.next()){
			jsonDemo j = new jsonDemo();
//			System.out.print(rs.getString(1)+"\t");
//			System.out.print(rs.getString(2)+"\t");
//			System.out.print(rs.getString(3)+"\n");
			j.setName(rs.getString(1));
			j.setId(rs.getString(2));
			j.setSex(rs.getString(3));
			list.add(j);
		}
		json = gson.toJson(list);
		rs.close();
		st.close();
		con.close();
	}catch(Exception e){
		
	}
	return json;
 }
}
