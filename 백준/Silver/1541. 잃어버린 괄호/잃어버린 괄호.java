
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	String [] minusarr =  br.readLine().split("-"); // 5 / 4+2/ 3+1+2 / 3
    	int sum = 0 ;
    	int minussum = 0 ;
    	for (int i = 0; i < minusarr.length; i++) {
    		if(minusarr[i].contains("+")) {
    			String [] plussarr = minusarr[i].split("\\+");
    			for (int j = 0; j < plussarr.length; j++) {
    				minussum = minussum + Integer.parseInt(plussarr[j]);
    			}
    		}
    		else minussum =Integer.parseInt( minusarr[i]);
    		if(i == 0) sum = sum + minussum;
    		else sum = sum - minussum;
    		minussum = 0 ;
		}
    	System.out.println(sum);
    	
    	
    	
    }
}

/*
5-4+2-3+1+2-3
 */
