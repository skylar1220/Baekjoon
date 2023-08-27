import java.util.*;
import java.io.*;

public class Main {
	
//	public static boolean [][] visited = new boolean [25][25];
//	public static String [][] sgraph = new String [25][25];
	public static int [][] graph = new int [25][25];
	public static int [] dx = {-1,1,0,0}; // 상, 하, 좌, 우 
	public static int [] dy = {0,0, -1,1 };
	public static int N ;
	public static ArrayList<Integer> dangi = new ArrayList<Integer>();
	public static int cnt =0 ;
	
	public static boolean dfs(int x, int y) {
		if(x < 0 || x >= N || y < 0 || y >= N) return false;
		if(graph[x][y] == 1) {
			graph[x][y] = 0 ; 
			for (int i = 0; i < 4; i++) {
				dfs(x+dx[i], y+dy[i]);
			}
			cnt++;
			return true;
		}
		return false;
	}

	public static void main(String[] args) throws Exception, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt( br.readLine());
		for (int i = 0; i < N; i++) {
			String str = br.readLine();
			for (int j = 0; j < N; j++) {
				graph[i][j] = Character.getNumericValue( str.charAt(j));
			}
		}
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N;  j++) {
				if(dfs(i, j)) {
				dangi.add(cnt);
				cnt = 0 ;
				}
			}
		}
		
		Collections.sort(dangi);
		System.out.println(dangi.size());
		for (int i : dangi) {
			System.out.println(i);
		}
	}

}
