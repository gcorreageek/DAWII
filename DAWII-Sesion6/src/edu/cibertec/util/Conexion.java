package edu.cibertec.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexion {
		public Connection Conectarse(){
			Connection cn=null;
			try {
				Class.forName("com.mysql.jdbc.Driver").newInstance();
				cn=DriverManager.
				getConnection("jdbc:mysql://localhost:3306/semana5",
						"root",
						"123");
			} catch (Exception e) {
				System.out.println("Error en Conexion " 
						+e.getMessage());
			}
			return cn;
		}
}
