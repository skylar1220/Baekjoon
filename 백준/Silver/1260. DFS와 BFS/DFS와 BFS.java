
import java.util.*;
import java.io.*;
	
public class Main {
	public static ArrayList<Boolean> visited = new ArrayList<Boolean>();
	public static ArrayList<ArrayList<Integer>> graph = new ArrayList<ArrayList<Integer>>();
	
	public static void dfs(int x) {
		visited.set(x, true);
		System.out.print(x+" ");
		for (int i = 0; i < graph.get(x).size(); i++) {
			int y = graph.get(x).get(i);
			if(!visited.get(y)) dfs(y);
		}
	}
	
	public static void bfs(int start) {
		Queue<Integer> q = new LinkedList<Integer>();
		q.offer(start);
		visited.set(start, true);
		while (!q.isEmpty()) {
			int x = q.poll();
			System.out.print(x + " ");
			for (int i = 0; i < graph.get(x).size(); i++) {
				int y = graph.get(x).get(i);
				if(!visited.get(y)) {
					q.offer(y);
					visited.set(y, true);
				}
			}
		}
	}
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer( br.readLine(), " ");
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int V = Integer.parseInt(st.nextToken());
		
		for (int i = 0; i < N+1 ; i++) {
			visited.add(false);
			graph.add(new ArrayList<Integer>());
			}
		for (int i = 0; i < M ; i++) {
			st = new StringTokenizer( br.readLine(), " ");
			int firstN = Integer.parseInt(st.nextToken());
			int secondN = Integer.parseInt(st.nextToken());
			graph.get(firstN).add(secondN);
			graph.get(secondN).add(firstN);
		}
		for (int i = 0; i < N+1 ; i++) {
			Collections.sort(graph.get(i));
		}
		dfs(V);
		System.out.println();
		visited.clear();
		
		for (int i = 0; i < N+1 ; i++) {
			visited.add(false);
			}
		bfs(V);
		
		
		
	}  
}  

