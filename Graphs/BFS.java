package Graphs;  //Breadth First Search
import java.util.LinkedList;
import java.util.Queue;
public class BFS {
  private LinkedList<Integer>[] adj;
   
  private int V;  //number of vertices
  private int E;   //number of Edge
  
  public BFS(int nodes)
  {
	  this.V=nodes;  
	  this.E=0;   
	  this.adj  = new LinkedList[nodes];
	  for(int i=0;i<nodes;i++)
	  {
		  this.adj[i] = new LinkedList<>();
	  }
  }
  
  public void addEdge(int u,int v){
	  this.adj[u].add(v);
	  this.adj[v].add(u);
	  E++;
  }
  
  //Display                                                                                                                                                                                                
  public String toString(){
	  StringBuilder sc = new StringBuilder();
	  sc.append(V+"vertice ,"+E+"edges"+"\n");
	  for(int i=0;i<V;i++)
	  {
		  sc.append(i+": ");
		  for(int w : adj[i]){  
			  sc.append(w+" ");
		  }
		  sc.append("\n");
	  }
	  return sc.toString();
  }
  
  //algo of bfs
  public void bfs(int s){
	  boolean[] visited = new boolean[V];  //make a boolean array
	  Queue<Integer> q = new LinkedList<>();
	  visited[s]=true;
	  q.offer(s);
	  while(!q.isEmpty())
	  {
		  int u = q.poll();
		  System.out.print(u+" ");
		  for(int v : adj[u])
		  {
			  if(!visited[v])
			  {
				  visited[v]=true;
				  q.offer(v);
			  }
		  }
	  }
  }
  
  
  public static void main(String args[])
  {
	  BFS obj = new BFS(5);
		 obj.addEdge(0, 1); 
		 obj.addEdge(1, 2);
		 obj.addEdge(2, 3);
		 obj.addEdge(3, 0);
		 obj.addEdge(2, 4);
	     System.out.print(obj);
	     System.out.print("The element after bfs");
	     obj.bfs(0);
  }
}
