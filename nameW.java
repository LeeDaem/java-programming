import java.util.Scanner;

    public class nameP {
        public static void main(String[] args) {
            int i, j, n;
            
            Scanner sc = new Scanner(System.in);
            System.out.print("길이 입력: ");
            n = sc.nextInt();
            
            for(i = 0; i < n * 2; i++){
            System.out.printf("%3d ", i);
            
            // X
            for (j = 0; j < n * 2 - 1; j++) {
                // i와 j의 비율을 맞춰서 X자 출력
                // 세로가 2n이므로 j의 인덱스를 i에 맞춰 조정
                if (i == j || i + j == n * 2 - 2) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print("  ");
            
            
            // Y
            for (j = 0; j < n * 2 - 1; j++) {
                if ((i < n && (i == j || i + j == n * 2 - 2)) || (i >= n && j == n - 1)) {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }    
            System.out.print("  ");

            // Z
            for (j = 0; j < n * 2 - 1; j++) {

            // 1. 맨 윗줄
            // 2. 맨 아랫줄
            // 3. 대각선
                if (i == 0 || i == n * 2 - 2 || i + j == n * 2 - 2) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            
            
            System.out.println("");    
            }  
        }
    }