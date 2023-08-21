import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	int N  = Integer.parseInt(br.readLine());
    	int [] arr = new int [N];
    	for (int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
    	int  center = 0, range =  0;
    	double avg = 0;
    	int sum = 0 ;
    	for (int i = 0; i < N; i++) {
    		sum += arr[i];
		}
    	
    	avg = (double) sum / N;
    	if(-0.5<avg && avg<0 ) avg =  0 ; 
    	
    	Arrays.sort(arr);	
    	
    	// 최빈값
    	int cnt =  0 , max = -1 , mod = arr[0];
    	boolean check = false ;
    	
    	for (int i = 0; i < arr.length-1; i++) {	//  2 2 8 9 9 mod
			if(arr[i]==arr[i+1]) {
				cnt ++ ; 		// cnt 1	
			} else {
				cnt = 0 ;		// cnt 0
			}
			
			if(max<cnt) {
				max = cnt ;		// max = 1
				mod = arr[i];	//  mod = 2
				check = true;
			} else if(max == cnt && check == true){	
				mod = arr[i];	// mod = 9
				check = false;	// false;
			}
		}
    	
    	
    	center  = arr[N/2];
    	range = arr[N-1] - arr[0];
    	
    	
    	
    	System.out.printf("%.0f", avg);
    	System.out.println();
    	System.out.println(center);
    	System.out.println(mod);
    	System.out.println(range);
    			
    }
}

/*
 */
