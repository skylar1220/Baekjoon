
import java.util.*;
import java.io.*;


class Node{
	int x ; 
	int y ;
	public Node(int x , int y ) {
		this.x = x ; 
		this.y = y ;
	}
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	
}
	
public class Main {
	// public static boolean [][] visited = new boolean [100][100];
	public static String [][] sgraph = new String [100][100];
	public static int [][] graph = new int [100][100];
	public static int [] dx = { 0, 0 ,1 , -1}; //  우, 좌,  하, 상,
	public static int [] dy = {1, -1, 0, 0, };
	public static int N ;
	public static int M ;
	
	
	public static int bfs(int x, int y) {
		Queue<Node> q = new LinkedList<Node>();
		q.offer(new Node(x,y));
		while (!q.isEmpty()) {	// 여기서 큐를 갖고 해야함
			Node node = q.poll();
			x = node.getX();
			y = node.getY();
		
			for (int i = 0; i < 4; i++) {
				int nx = x + dx[i];
				int ny = y + dy[i];
				if( nx < 0 || nx >= N || ny < 0 || ny >= M) continue;
				if (graph[nx][ny] == 0 ) continue;
				if( graph[nx][ny] == 1) { // boolean [][] visited 안써도 됨
					graph[nx][ny] = graph[x][y] +1 ;
					q.offer(new Node(nx, ny));
				}
			}
		}
		return graph[N-1][M-1] ; 
	}
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer( br.readLine(), " ");
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		for (int i = 0; i < N; i++) {
			sgraph[i] = br.readLine().split("");
			for (int j = 0; j < M; j++) {
				graph[i][j] = Integer.parseInt(sgraph[i][j]);
			}
		}
		System.out.println(bfs(0 , 0));
	}  
}  

/*
4 6
101111
101010
101011
111011

 */

