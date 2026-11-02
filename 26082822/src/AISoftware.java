import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class AISoftware {
	public static void main(String[] args) {
		// 1. JDBC드라이버 적제
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("홍길동");
			e.printStackTrace();
		}
		 String url = "jdbc:oracle:thin:@10.30.3.96:1521:orcl";
		 String user = "c##2301073";
		 String pw = "p2301073";
		
		// 2. 데이터베이스 연결
		try {
			Connection conn = DriverManager.getConnection(url, user, pw);

			// 3. SQL문 작성 및 전송 
			Statement s = conn.createStatement();
			
			
			String sql = "select * from books";
			
			ResultSet rs = s.executeQuery(sql);
			
			// 4. 결과집합의 확인 활용
			
			while (rs.next()) {
                int id = rs.getInt("book_id");
                String title = rs.getString("title");
                String publisher = rs.getString("publisher");
                String year = rs.getString("year");
                int price = rs.getInt("price");

                System.out.println("ID : " + id + "  | TITLE : " + title + "  | publisher : " + publisher + "  | year : " + year + "  | price : " + price + "  | ");
            }	

			rs.close();
            s.close();
            conn.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
	}

	private static int id(int i) {
		// TODO Auto-generated method stub
		return 0;
	}
}
