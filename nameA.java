import java.util.*;

public class nameA{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int i, j, n;
        
        System.out.print("길이 입력: ");
        n = sc.nextInt();
        
        for (i = 0; i < n * 2; i++) {
            System.out.printf("%3d ", i);
            
            //A
            System.out.print("*");
            for (j = 0; j < n - 1; j++) {                
                if(i == 0 || i == n - 1) {
                    
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            for (j = 0; j < n - 1; j++) {
                if(i == 0 || i == n - 1) {
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.print("*  ");
            
            //B
            System.out.print("*");
            for(j = 0; j < n - 1; j ++) {
                if(i == 0 || i == n - 1 || i == n * 2 - 1) {
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }    
            }
            
            for(j = 0; j < n - 1; j++) {
                if(i == 0 || i == n - 1 || i == n * 2 - 1) {
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.print("*  ");
            
            //C
            System.out.print("*");
            for(j = 0; j < n * 2 - 1; j++) {
                if (i == 0 || i == n * 2 - 1) {
                    System.out.print("*"); 
                }else {
                    System.out.print(" ");
                }
            }
            System.out.print("  ");
            
            //D
            System.out.print("*");
            for(j = 0; j < n - 1; j++) {
                if(i == 0 || i == n * 2 - 1) {
                    System.out.print("*"); 
                }else {
                    System.out.print(" ");
                }
            } 
            for(j = 0; j < n; j++) {
                if( i == j || i + j == n * 2 - 1) {
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.print("  ");
            
            //E
            System.out.print("*");
            for(j = 0; j < n * 2 - 1; j++) {
                if(i == 0 || i == n * 2 - 1 || i == n - 1) {
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.print("  ");
            
            //F
            System.out.print("*");
            for(j = 0; j < n * 2 - 1; j++) {
                if ( i == 0 || i == n - 1) {
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.print("  ");
            
            //G
            System.out.print("*");
            for(j = 0; j < n - 1; j++) {
                if (i == 0 || i == n * 2 - 1) {
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            for(j = 0; j < n - 1; j++) {
                if (i == 0 || i == n * 2 - 1 || i == n - 1) {
                    System.out.print("*");
                } else{
                    System.out.print(" ");
                }
            }
            if (i >= n - 1 || i == 0) {
                System.out.print("*");
            } else{
                System.out.print(" ");
            }
            System.out.printf("\n");
        }
    }
}