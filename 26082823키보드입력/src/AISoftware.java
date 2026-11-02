import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class AISoftware {
    public static void main(String[] args) {
        // 1. JDBC 드라이버 적재
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
        } catch (ClassNotFoundException e) {
            System.out.println("드라이버 로딩 실패");
            e.printStackTrace();
            return;
        }

        String url = "jdbc:oracle:thin:@10.30.3.96:1521:orcl";
        String user = "c##2301073";
        String pw = "p2301073";

        // SQL 바인딩 쿼리 준비
        String sql = "INSERT INTO books (book_id, title, publisher, year, price) VALUES (?, ?, ?, ?, ?)";

        // Scanner 및 DB 연결
        try (Scanner scanner = new Scanner(System.in);
             Connection conn = DriverManager.getConnection(url, user, pw);
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            System.out.println("=========================================");
            System.out.println("          도서 정보 입력 시스템");
            System.out.println("=========================================");

            // 키보드 입력 받기
            System.out.print("ID (book_id 숫자): ");
            int id = scanner.nextInt();
            scanner.nextLine(); // 입력 버퍼 비우기 (엔터값 제거)

            System.out.print("TITLE (도서 제목): ");
            String title = scanner.nextLine();

            System.out.print("PUBLISHER (출판사): ");
            String publisher = scanner.nextLine();

            System.out.print("YEAR (출판 연도): ");
            String year = scanner.nextLine();

            System.out.print("PRICE (가격 숫자): ");
            int price = scanner.nextInt();

            // PreparedStatement에 물음표(?) 매핑
            pstmt.setInt(1, id);
            pstmt.setString(2, title);
            pstmt.setString(3, publisher);
            pstmt.setString(4, year);
            pstmt.setInt(5, price);

            // DB에 쿼리 실행
            int result = pstmt.executeUpdate();

            if (result > 0) {
                System.out.println("\n[성공] 데이터가 데이터베이스에 성공적으로 저장되었습니다!");
            } else {
                System.out.println("\n[실패] 데이터 저장에 실패했습니다.");
            }

        } catch (SQLException e) {
            System.err.println("\n데이터베이스 오류 발생: " + e.getMessage());
            e.printStackTrace();
        }
    }
}