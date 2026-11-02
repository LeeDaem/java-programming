import java.util.Scanner;

public class nameP{
    public static void main(String[] args) {
        
        int i, j, n;
        
        Scanner sc = new Scanner(System.in);
        System.out.print("길이 입력: ");
        n = sc.nextInt();
        
        for(i = 0; i < n * 2; i++) {
            System.out.printf("%3d", i);
            
            
            // P
            System.out.print("*");
            if(i == 0 || i == n - 1) {
                for(j = 0; j < n * 2 - 2; j++) {
                    System.out.print("*");
                }
            } else {
                for(j = 0; j < n * 2 - 2; j++) {
                    System.out.print(" ");
                }
            }
            
            if(i < n) {
                System.out.print("*");
            }else {
                System.out.print(" ");
            }
            System.out.print("  ");
            
            
            // Q
            System.out.print("*");
            if(i == 0 || i == n * 2 - 1) {
                for(j = 0; j < n * 2 - 2; j++) {
                    System.out.print("*");
                }
            } if(i == n - 1) {
                for(j = 0; j < n - 1; j++) {
                    System.out.print(" ");
                }
                for(j = 0; j < n - 1; j++) {
                    System.out.print("*");
                }
            }if(i != 0 && i != n * 2 - 1 && i != n - 1)  {
                for(j = 0; j < n * 2 - 2; j++) {
                    System.out.print(" ");
                }
            }
            System.out.print("*  ");
            
            
            // R
            System.out.print("*");
            if(i == 0 || i == n - 1) {
                for(j = 0; j < n * 2 - 2; j++) {
                    System.out.print("*");
                }
            }if(i > 0 && i < n - 1) {
                for(j = 0; j < n * 2 - 2; j++) {
                    System.out.print(" ");
                }
            }
            
            if(i > n - 1) {
                for(j = 0; j < n * 2 - 2; j++) {
                    System.out.print(" ");
                }
            }
            
            System.out.print("*");
          
            System.out.print("  ");
            
            
            // S
            if ( i == 0 || i == n - 1 || i == n * 2 - 1){
                
                for(j = 0; j < n * 2 - 1; j++) {
                    System.out.print("*");
                }
                if ( i == 0) {  
                    System.out.print("*");
                }
            }
            
            if (i < n - 1 && i > 0) {
                System.out.print("*");
                for(j = 0; j < n * 2 - 1; j++) {
                    System.out.print(" ");
                }
            }
            if(i >= n && i < n * 2 - 1) {
                for(j = 0; j < n * 2 - 1; j++) {
                    System.out.print(" ");
                }    
            }
            if(i >= n - 1) {
                
                    System.out.print("*");
                    
            }
            System.out.print("  ");
            
            
            // T
            if(i == 0) {
                for(j = 0; j < n * 2; j++) {
                    System.out.print("*");
                }
            }
            
            if(i != 0) {
                for(j = 0; j < n; j++) {
                    System.out.print(" ");
                }
                System.out.print("*");
                for(j = 0; j < n - 1; j++) {
                    System.out.print(" ");
                }
            }
            System.out.print("  "); 
            
            
            // U
            System.out.print("*");
            if(i < n * 2 - 1) {
                for(j = 0; j < n * 2 - 2; j++) {
                    System.out.print(" ");
                }
            }
            if( i == n * 2 - 1) {
                for(j = 0; j < n * 2 - 2; j++) {
                    System.out.print("*");
                }
            }
            System.out.print("*  ");
            
            // V
            if (i < n) { // 높이를 n까지만 출력하도록 제한
                // 1. 왼쪽 바깥 공백
                for (j = 0; j < i; j++) {
                    System.out.print(" ");
                }

                // 2. 왼쪽 선
                System.out.print("*");

                // 3. 가운데 공백 (너비 n에 맞게 조절)
                // i가 커질수록 공백은 (n - i - 1) * 2개씩 줄어듭니다.
                for (j = 0; j < 2 * (n - i - 1) - 1; j++) {
                    System.out.print(" ");
                }

                // 4. 오른쪽 선 (마지막 줄에서는 하나만 출력)
                if (i < n - 1) {
                    System.out.print("*");
                }for (j = 0; j < i; j++) {
                    System.out.print(" ");
                }
            } else {
                // [수정된 부분] i >= n 일 때 V가 차지하던 전체 너비만큼 공백 출력
                // 위에서 사용한 최대 너비는 대략 (n * 2 - 1) 칸입니다.
                for (j = 0; j < (n * 2 - 1); j++) {
                    System.out.print(" ");
                }
            }
            System.out.print("  ");
            System.out.print("\n");       
        }
        
        
    }
}