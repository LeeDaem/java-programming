public class Sumtest{
    public static void main(String[] args) {
        // 2차원 배열 객체 변수(testArray) 선언
        int [][] testArray;
        
        // 3행 6열 짜리 2차원 배열 객체 생성
        testArray = new int[4][6];
        
        // 각 원소에 값 대입
        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 5; j++) {
                testArray[i][j] = i * 5 + j;
                
                
            }
        }
        
        
        // 각 행의 합을 5열에 저장
        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 5; j++) {    
                testArray[i][5] += testArray[i][j];
            }
        }
        for(int j = 0; j < 6; j++) {
            for(int i = 0; i < 3; i++) {
                testArray[3][j] += testArray[i][j];
            }
        }
        
        // 각 원소 값 출력
        for(int i = 0; i < testArray.length; i++) { 
            for(int j = 0; j < testArray[0].length; j++) {
                
                System.out.printf("%2d  ", testArray[i][j]);
                
            }
            System.out.print("\n");
            
        }
        
        
    }
}