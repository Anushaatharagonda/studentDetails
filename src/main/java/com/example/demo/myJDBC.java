package com.example.demo;

import java.sql.DriverManager;
import java.sql.*;

//import //org.springframework.boot.autoconfigure.amqp.RabbitProperties.Cache.Connection;

public class myJDBC {
	public void coonn() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jatharagonda","root","Anu@21221");
			Statement st=con.createStatement();
			st.addBatch("insert into student values(1,100,'Anusha')");
			st.addBatch("insert into student values(2,200,'Ajay')");
		st.addBatch("insert into student vlaues(3,300,'Harish')");
			st.executeBatch();
			st.close();
			con.close();
			}
			catch(Exception e) {
				
			}
	}
 }
		
	
	


