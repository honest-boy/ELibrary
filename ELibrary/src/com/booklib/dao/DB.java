package com.booklib.dao;

import java.sql.*;

public class DB {
public static Connection getCon(){
	Connection con=null;
	try{
		Class.forName("com.mysql.jdbc.Driver");
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ELibrary?characterEncoding=latin1","root","Rajrupesh395@");
	}catch(Exception e){
		System.out.println(e);
	}
	return con;
	}
}
