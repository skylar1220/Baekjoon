import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	
    	Scanner sc = new Scanner(System.in);
    	int n = sc.nextInt() ;
    	int cnt = 0 ;
    	int cntTmp = 0 ;
    	
    	if(n % 5 ==  0) {
    		cnt = cnt + n / 5 ; 
    		System.out.println(cnt);
    	} else {
	    	int tmp = n / 3 ;
	    	for (int i = 0; i < tmp  ; i++) {
				n = n-3 ;
				cntTmp ++ ;
				if( n % 5 == 0 ) break ; 
			}
	    	if(n % 5 != 0 ) {
	    		System.out.println(-1);
	    	}
	    	else {
	    	cnt = cntTmp ; 
	    	cnt = cnt + n / 5 ; 
	    	
	    	
	    	System.out.println(cnt);
    	}
    	}
    }
}
