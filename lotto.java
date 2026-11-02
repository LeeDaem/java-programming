//지난번 로또 당첨번호가 몇번째 조합으로 만들어지는가?
import java.util.Random;

public class 	lotto {
static int[] LAST = {16, 18, 20, 32, 33, 39};
   public static void main(String args[]) {
          Random random = new Random();
          random.setSeed(System.currentTimeMillis());

          // 1. 6개의 로또 번호를 저장할 배열을 생성한다. 
          int[] array = new int[6];	
          // 2. 로또 번호를 하나 생성하여 배열에 그 값이 있는지 검사한다.
          // 3. 없으면 배열에 추가, 있으면 다시 로또 번호 생성  
          int k;
	  	  long lcount = 0;
          boolean notFound = true;
          boolean found;
          int count;
		  do {
		  	lcount++;
            for(int i = 0; i < 6; i++) {
	        	do {
	            	count = 0;
	                k = random.nextInt(45) +1;	
	   	  			for( int temp: array) {
	               		if ( k == temp) {
	                   		count = count + 1;
	              		}
       		  		}
       	  		}while( count != 0 );
        		array[i] = k;               	
			}  // end of for
            notFound = false; 
 			System.out.print( lcount + ":");
           	for(int e :  array) {
		    	System.out.print( e + " ");	
                found = false;
                for(int j=0; j< LAST.length; j++) {
                	if ( e == LAST[j]) {
                    	found = true;
                    }
                }
                if (!found ) {
                	notFound=true;
                    break;
                }
            }      
            System.out.println();     
	
          } while ( notFound); 
          System.out.println(lcount);       
   } 
}

           

