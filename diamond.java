import java.util.*;

public class diamond{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int n, i, j, l;
        
        System.out.print("별 갯수를 입력하시오: ");
        n = sc.nextInt();
        
        for(i = 0; i < n; i++) { // i = 현재 몇번째 줄
         System.out.printf("%3d ",i );
            
            for(j = 0; j < n - i; j++) {
                System.out.print(" ");
            }   
            for(j = 0; j < 2 * i + 1; j++) { 
                System.out.print("*");
            }
            for(j = 0; j < 2 * (n - i - 1); j++) {
                System.out.print(" ");
            }
            for(j = 0; j < 2 * i + 1; j++) { 
                System.out.print("*");
            }
            for(j = 0; j < 2 * (n - i) - 2; j++) {
                System.out.print(" ");
            }
            for(j = 0; j < 2 * i + 1; j++) { 
                System.out.print("*");
            }
            System.out.print("\n");        // 줄바꿈
        }
        for(l = 1; l < n; i++) {
            System.out.printf("%3d ", i);
            
                for(j = 0; j < l + 1; j++) {
                    System.out.print(" ");
                    
                }
                for(j = 0; j < 2 * (n - l) - 1; j++) {
                    System.out.print("*");
                    
                }
                for(j = 0; j < 2 * (l + 1) - 2; j++) {
                    System.out.print(" ");
                }
                for(j = 0; j < 2 * (n - l) - 1; j++) {
                    System.out.print("*");
                }
                for(j = 0; j < 2 * (l + 1) - 2; j++) {
                    System.out.print(" ");
                }
                for(j = 0; j < 2 * (n - l) - 1; j++) {
                    System.out.print("*");
                }
                System.out.print("\n"); 
                l++;  
        } 
        
        sc.close();
    }
}