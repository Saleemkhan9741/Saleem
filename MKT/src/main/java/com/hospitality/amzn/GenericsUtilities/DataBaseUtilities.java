package com.hospitality.amzn.GenericsUtilities;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

/*
 * 
 * @saleem
 * 
 */
public class DataBaseUtilities {
		static Connection con=null;
		static ResultSet res=null;
		
		public void connectToDB() throws Throwable {
			
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/saleem","root","Oracle1234");
			
		}
		
		public void closeDB() throws Throwable {
			con.close();
		}
		
		public static ResultSet executeQuery(String query) throws Throwable {
			res = con.createStatement().executeQuery(query);			
			return res;
		}
		
		public static String executeQueryandGetData(String query, String columnname, String expectedData) throws Throwable {
			boolean flag = false;
			res=con.createStatement().executeQuery(query);
			
			while(res.next()) {
					if(res.getString(columnname).equals(expectedData))
						{
							flag=true;
							break;
						}
				}
			
			if(flag) {
				System.out.println(expectedData+"is verified in the database");
				return expectedData;
			}else {
					System.out.println(expectedData+"is not verified in the database");
					return expectedData;
			}
		}
	}

	

