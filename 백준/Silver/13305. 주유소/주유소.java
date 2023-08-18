
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	int n = Integer.parseInt(br.readLine());
    	
    	int totalsumprice = 0 ;
    	int sumprice = 0 ;
    	int lowestoil = 0 ;
    	int [] arroil =  new int[n];
    	int [] arrkm = new int [n - 1];
    	int sumkm = 0 ;
    	
    	StringTokenizer st = new StringTokenizer(br.readLine(), " ");
    	for (int i = 0; i <n-1; i++) {
    		arrkm[i] = Integer.parseInt(st.nextToken());
		}
    	
    	st = new StringTokenizer(br.readLine(), " ");
    	for (int i = 0; i <n; i++) {
			arroil[i] = Integer.parseInt(st.nextToken());
		}
    	
    	for (int i = 0; i <n-1; i++) {
			int thisoil = arroil[i];
			
			if(i==0 ) lowestoil = thisoil;
			if(thisoil<lowestoil) {
				lowestoil = thisoil;
				sumkm = 0 ;
				totalsumprice = totalsumprice + sumprice;
				sumprice = 0 ;
			}
			
			sumkm = sumkm + arrkm[i];
			sumprice = sumkm * lowestoil ; 
		}
    	
    	System.out.println(totalsumprice+sumprice);
    	
    	
    }
}

