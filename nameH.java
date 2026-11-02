import java.util.*;
public class nameH {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i, j, n;
        int k = 0;
        
        System.out.print("길이 입력: ");
        n = sc.nextInt();
        
        for(i = 0; i < n * 2; i++) {
            System.out.printf("%3d ", i);
            
            //H
            System.out.print("*");
            if(i == n - 1) {
                for(j = 0; j < n * 2 - 1; j++){
                    System.out.print("*");
                }
            }else{
                for(j = 0; j < n * 2 - 1; j++){
                    System.out.print(" ");
                }
            }
            System.out.print("*  ");
            
            //I
            if(i == 0 || i == n * 2 - 1){
                for(j = 0; j < n - 1; j++) {
                    System.out.print("*");
                }
            }else {
                for(j = 0; j < n - 1; j++) {
                    System.out.print(" ");
                }
            }
            System.out.print("*");
            if(i == 0 || i == n * 2 - 1){
                for(j = 0; j < n - 1; j++) {
                    System.out.print("*");
                }
            }else {
                for(j = 0; j < n - 1; j++) {
                    System.out.print(" ");
                }
            }
            System.out.print("  ");
            
            //J
            if(i == 0) {
                for(j = 0; j < n * 2 + 1; j++) {
                    System.out.print("*");
                }
            }if(i == n * 2 - 1 ) {
                for(j = 0; j < n + 1; j++) {
                    System.out.print("*");
                }
                for(j = 0; j < n; j++) {
                    System.out.print(" ");
                }
            }if(i != 0 && i != n * 2 - 1) {
                for(j = 0; j < n ; j++) {
                    System.out.print(" ");
                }
                System.out.print("*");
                for(j = 0; j < n ; j++) {
                    System.out.print(" ");
                }
            }
            System.out.print("  ");
            
            //K
            System.out.print("*");
            if(i < n){
                k = n - i - 1;
            }else {
                k = i - n ;
            }
            for(j = 0; j < k * 2  ; j++){
                System.out.print(" ");
            }
            
            System.out.print("*");


            for(j = 0; j < (n * 2) - (k * 2); j++) {
                System.out.print(" ");
            }
            System.out.print(" ");
            
            
            // L
            System.out.print("*");
            if(i == n * 2 - 1) {
                for(j = 0; j < n * 2 - 1; j++) {
                    System.out.print("*");
                }
            }else {
                for(j = 0; j < n * 2 - 1; j++) {
                    System.out.print(" ");
                }
            }
            System.out.print("  ");
            
            // M
            for (j = 0; j < n * 2 - 1; j++) {
                
                if (j == 0 || j == (n * 2 - 2) || (i < n && (i == j || i + j == n * 2 - 2))) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print("  ");
            
            
            // N
            for( j = 0; j < n * 2; j++) {
                if(j == 0 || j == (n * 2 - 1) || i == j){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.print("  ");
            
            // O
            System.out.print("*");
            if(i == 0 || i == n * 2 - 1) {
                for(j = 0; j < n * 2 - 2; j++) {
                    System.out.print("*");
                }
            }else {
                for(j = 0; j < n * 2 - 2; j++) {
                    System.out.print(" ");
                }
            }
            
            System.out.print("*");
            
            
            
            
        System.out.printf("\n");
        }
    }   
}