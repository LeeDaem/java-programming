import java.util.*;

public class diamond2{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int n, i, j, l, x, y;
        
        System.out.print("마름모 크기: ");
        n = sc.nextInt();
        System.out.print("마름모 개수: ");
        x = sc.nextInt();
        
        for(i = 0; i < n; i++) {
         System.out.printf("%3d ",i );
            for(y = 0; y < x; y++) {
            
                for(j = 0; j < n - i - 1; j++) {
                    System.out.print(" ");
                }   
                for(j = 0; j < 2 * i + 1; j++) { 
                    System.out.print("*");
                }
                for(j = 0; j < n - i - 1; j++) {
                    System.out.print(" ");
                }
            }     
            System.out.print("\n");        // 줄바꿈
        }
        for(l = 1; l < n; i++) {
            System.out.printf("%3d ", i);
            
                for(y = 0; y < x; y++) {
                    for(j = 0; j < l ; j++) {
                        System.out.print(" ");
                    
                    }
                    for(j = 0; j < 2 * (n - l) - 1; j++) {
                        System.out.print("*");
                    
                    }
                 
                    for(j = 0; j < l  ; j++) {
                        System.out.print(" ");
                    }
                }
                System.out.print("\n"); 
                l++;  
        } 
        
        sc.close();
    }
}