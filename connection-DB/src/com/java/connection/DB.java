package com.java.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DB {
	private static String db_ = "employees";
	private static String login_ = "root";
	private static String password_ = "root";
	private static String url_ = "jdbc:mysql://localhost:3306/" + db_;
	private static Connection connection_;
	private static Statement st_ = null;

	public static Connection conectar() {
		Connection connection_=null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connection_ = DriverManager.getConnection(url_, login_, password_);
			System.out.println("OK");
//			if (connection_ != null) {
//				
//				System.out.println(" Conexion a base de datos " + db_ + " correcta . ");
//			} else
//				System.out.println(" Conexion fallida . ");
		} 
		catch (ClassNotFoundException e) {
			System.out.println("Error: Controlador");
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return connection_;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//preparo la consulta
		java.sql.Statement s= null;
//		DB con=new DB();
		try {
			s = conectar().createStatement();
			
			String Consulta;
			Consulta="select avg(salaries.salary) from titles inner join salaries on (employees.titles.emp_no = employees.salaries.emp_no)\r\n" + 
					" where title='Senior Engineer'";
			ResultSet rs=s.executeQuery(Consulta);
			while (rs.next()) {
				System.out.println(rs.getString(1)+"-------------" );
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}