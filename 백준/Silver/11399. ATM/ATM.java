import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	
    	Scanner sc = new Scanner(System.in);
    	int n = sc.nextInt();
    	sc.nextLine();
    	
    	int [] arr = new int[n] ;
    	int sum = 0 ;
    	int totalsum = 0 ;
    	
    	for (int i = 0; i < n; i++) {
    		arr[i] =  sc.nextInt();
		}
    	
    	Arrays.sort(arr);
    	
    	
    	for (int i = 0; i < n; i++) {
			sum = sum + arr[i];
			totalsum = totalsum + sum;
		}
    	System.out.println(totalsum);
    }
}
