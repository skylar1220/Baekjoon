
import java.util.*;
import java.io.*;
	
public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		Stack<Character> stack = new Stack<Character>();
		
		String sstr = br.readLine();
		char [] arr = sstr.toCharArray();
		Arrays.sort(arr);
		String str = new String(arr);
		
		int len = str.length();
		boolean done  = false, isOnlyOne = false;
		String onlyOne = "" ; 
		for (int i = 0; i < len; i++) {
			if (done == true ) {
				stack.push(str.charAt(i));
				done = false;
			}
			
			else if( done == false ) {
				// if 마지막이면 -- 여기 중복!!
				if( i == len-1 ) {
					if(isOnlyOne == true ) {
						System.out.println("I'm Sorry Hansoo");
						return ;
					} else {
						onlyOne = Character.toString(str.charAt(i)) ;
						isOnlyOne = true ;
					}
				}
				else if(str.charAt(i) == str.charAt(i+1)) { 
					sb.append(str.charAt(i));
					done = true;
				}
				else {
					if(isOnlyOne == true ) {
						System.out.println("I'm Sorry Hansoo");
						return ;
					} else {
						onlyOne = Character.toString(str.charAt(i)) ;
						isOnlyOne = true ;
					}
				}
			}
		}
		sb.append(onlyOne);
		while (!stack.isEmpty()) {
			sb.append(stack.pop());
		}
		
		
		System.out.println(sb);
		
		
	} // End of main
} // End of class

