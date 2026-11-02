import java.util.*;

public class diamond3{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int n, i, j, x, y, z, a;
        int l = 0;
    
        
        System.out.print("마름모 크기: ");
        n = sc.nextInt();
        System.out.print("마름모 가로 개수: ");
        x = sc.nextInt();
        System.out.print("마름모 세로 개수: ");
        z = sc.nextInt();
        
        
        for(a = 0; a < z; a++){
        
            for(i = 0; i < n; i++) {
                System.out.printf("%3d ",l );
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
                l++;
            }
            for (i = 1; i < n; i++) {
                System.out.printf("%3d ", l);
            
                for(y = 0; y < x; y++) {
                    for(j = 0; j < i ; j++) {
                        System.out.print(" ");
                    
                    }
                    for(j = 0; j < 2 * (n - i) - 1; j++) {
                        System.out.print("*");
                    
                    }
                 
                    for(j = 0; j < i  ; j++) {
                        System.out.print(" ");
                    }
                }
                System.out.print("\n");
                l++; 
                  
            } 
        }
        sc.close();
    }
}