package jdbc;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/*
 --------------------------------------
 Procedure script :
 ---------------------------------------
 DELIMITER //
 DROP PROCEDURE IF EXISTS demo;
 create  PROCEDURE demo(IN student_id varchar(100))
 begin
 declare z INT;
 select * from courses;
 END //
 DELIMITER //
 */

public class JDBCMysqlExample {
	private static Connection conn = null;

	static {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		insertRecords();
		queryDB();
		invokeProcedure();
	}

	private static void queryDB() {
		System.out.println("Querying DB....");
		Connection conn = getConnection();
		if (conn != null) {
			ResultSet rs = null;
			try {
				Statement stmt = conn.createStatement();
				rs = stmt
						.executeQuery("select * from courses order by student asc");
				while (rs.next()) {
					System.out.println(rs.getString(1) + " " + rs.getString(2));
				}
			} catch (SQLException e) {
				e.printStackTrace();
			} finally {
				try {
					rs.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}

		}
	}

	private static void insertRecords() {
		System.out.println("Inserting record...");
		Connection conn = getConnection();
		try {
			PreparedStatement ps = conn
					.prepareStatement("insert into courses values(?,?)");
			double random = Math.random();
			ps.setString(1, "student_" + random);
			ps.setString(2, "class_" + random);
			ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		System.out.println("Record inserted...");
	}

	private static void invokeProcedure() {
		System.out.println("Invoking procedure .....");
		Connection conn = getConnection();
		ResultSet rs = null;
		try {
			CallableStatement cs = conn.prepareCall("{ call demo(?) }");
			cs.setString(1, "A");
			rs = cs.executeQuery();
			while (rs.next()) {
				System.out.println(rs.getString(1) + " " + rs.getString(2));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}

	private static Connection getConnection() {

		if (conn != null)
			return conn;

		try {
			conn = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/test", "root", "root");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return conn;
	}

}
