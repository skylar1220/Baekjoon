
import java.util.*;
import java.util.stream.Stream;
/*
3 5
42101
22100
22101
 */
import java.io.*;
	
public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine() , " ");
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		String [][] sarr = new String[N][M];
		for (int i = 0; i < N; i++) {
			sarr[i] =  br.readLine().split("");
		}
		
		int max = 0 ;
		int minlen = ( N < M ) ?   N :  M   ;
		for (int m = 1; m < minlen; m++) {
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < M; j++) {
					if(i>= N-m ||  j>=M-m) {
						break;
					} else {
						if( Integer.parseInt(sarr[i][j]) == Integer.parseInt(sarr[i][j+m])
								&& Integer.parseInt(sarr[i][j]) == Integer.parseInt(sarr[i+m][j])
								&& Integer.parseInt(sarr[i][j]) == Integer.parseInt(sarr[i+m][j+m])
								) {
							max = m ;
						}
					}
				
				}
			}
		}
		System.out.println((max+1)*(max+1));
		
	} // End of main
} // End of class

