import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class BookInsertProgram {

    // 1. 데이터베이스 접속 정보 설정
    private static final String URL = "jdbc:oracle:thin:@10.30.3.96:1521:orcl";
    private static final String USER = "c##2301073";
    private static final String PASSWORD = "p2301073";

    public static void main(String[] args) {
        // SQL 삽입 쿼리 정의
        String sql = "INSERT INTO books (book_id, title, publisher, year, price) VALUES (?, ?, ?, ?, ?)";

        // Try-with-resources 구문을 사용하여 자원(Connection, PreparedStatement, Scanner) 자동 해제
        try (
            Scanner scanner = new Scanner(System.in);
            Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
            PreparedStatement pstmt = conn.prepareStatement(sql)
        ) {
            System.out.println("=== 도서 정보 입력 ===");

            // 2. 입력 데이터 받기
            System.out.print("도서 ID (book_id): ");
            int bookId = scanner.nextInt();
            scanner.nextLine(); // 버퍼 비우기

            System.out.print("도서 제목 (title): ");
            String title = scanner.nextLine();

            System.out.print("출판사 (publisher): ");
            String publisher = scanner.nextLine();

            System.out.print("출판 연도 (year): ");
            String year = scanner.nextLine();

            System.out.print("가격 (price): ");
            int price = scanner.nextInt();

            // 3. PreparedStatement 바인딩
            pstmt.setInt(1, bookId);
            pstmt.setString(2, title);
            pstmt.setString(3, publisher);
            pstmt.setString(4, year);
            pstmt.setInt(5, price);

            // 4. 쿼리 실행
            int result = pstmt.executeUpdate();

            if (result > 0) {
                System.out.println("데이터가 성공적으로 삽입되었습니다.");
            } else {
                System.out.println("데이터 삽입에 실패했습니다.");
            }

        } catch (SQLException e) {
            System.err.println("데이터베이스 오류 발생: " + e.getMessage());
            e.printStackTrace();
        }
    }
}