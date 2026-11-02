import java.util.*;

public class MyNum {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int i, j, n;
        
        System.out.print("길이 입력 : ");
        n = sc.nextInt();
        
        for(i = 0; i < n; i++) {
            System.out.printf("%2d", i);
            
            // 2
            if(i > n / 2) {
                System.out.print("*");
            }
            for(j = 0; j < n - 1; j++) {
                if(i == 0 || i == n - 1 || i == n / 2){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            if(i <= n / 2) {
                System.out.print("*");
            }
            System.out.print(" ");            
            
            // 3
            for(j = 0; j < n - 1; j++) {
                if(i == 0 || i == n - 1 || i == n / 2){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            if(i != 0 || i != n - 1 || i != n / 2) {
                System.out.print("*");
            }
            System.out.print(" ");
            
            // 0
            System.out.print("*");
            for(j = 0; j < n - 2; j++) {
                if(i == 0 || i == n - 1) {
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.print("* ");
            
            // 1
            for(j = 0; j < (n - 1) / 2; j++){
                if(i == 0 || i == n - 1) {
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.print("*");
            for(j = 0; j < (n - 1) / 2; j++){
                if(i == 0 || i == n - 1) {
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.print(" ");
            
            
            // 0
            System.out.print("*");
            for(j = 0; j < n - 2; j++) {
                if(i == 0 || i == n - 1) {
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.print("* ");
            
            // 7
            if(i < n / 2) {
                System.out.print("*");
            } else{
                System.out.print(" ");
            }
            for(j = 0; j < n - 2; j++) {
                if(i == 0){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.print("* ");
            
           
           // 3
            for(j = 0; j < n - 1; j++) {
                if(i == 0 || i == n - 1 || i == n / 2){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            if(i != 0 || i != n - 1 || i != n / 2) {
                System.out.print("*");
            }
            System.out.print(" ");
            
        System.out.println(" ");
        }
    }
}
            
                    