
import java.util.*;
import java.io.*;


	
public class Main {
	public static boolean [][] visited = new boolean [25][25];
	public static String [][] sgraph = new String [25][25];
	public static int [][] graph = new int [25][25];
	public static int [] dx = {-1,1,0,0}; // 상, 하, 좌, 우 
	public static int [] dy = {0,0, -1,1 };
	public static int N ;
	public static ArrayList<Integer> dangi = new ArrayList<Integer>();
	public static int cnt =0 ;
//	public static int M ;
	
	
	public static void dfs(int x, int y) {
		visited[x][y] = true;
		cnt ++ ;
		for (int i = 0; i < 4; i++) {
			if(x+dx[i] < 0 || x+ dx[i]>= N || y+dy[i] < 0 || y + dy[i] >= N) continue;
			if(graph[x+dx[i]][y+dy[i]] == 0 ) continue;
			if(visited[x+dx[i]][y+dy[i]] == true ) continue;
			dfs(x+dx[i], y+dy[i]);
		}
		
	}
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt( br.readLine());
		for (int i = 0; i < N; i++) {
			sgraph [i] = br.readLine().split("");
			for (int j = 0; j < N; j++) {
				graph[i][j] = Integer.parseInt(sgraph[i][j]);
			}
		}
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N;  j++) {
				if( graph[i][j] == 1 && visited[i][j] != true ) {
					dfs(i, j);
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

/*
7
0110100
0110101
1110101
0000111
0100000
0111110
0111000

 */

