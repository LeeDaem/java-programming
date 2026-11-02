package module.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {

	public static void main(String[] args) {
		try {
			// 1. JDBC드라이버 적재
			Class.forName("oracle.jdbc.driver.OracleDriver");
			// 2. 데이터 베이스 연결
			Connection conn;
			String url = "jdbc:oracle:thin:@10.30.3.96:1521:orcl";
			String user = "C##2301073";
			String pw = "p2301073";
			conn = DriverManager.getConnection(url, user, pw);
			System.out.print("데이터베이스 연결 성공");
			
			
			
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
