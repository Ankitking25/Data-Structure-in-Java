package Graphs;  //Recursive_DFS  Search - Not use Stack
import java.util.LinkedList;
public class Recursive_DFS {
  private LinkedList<Integer>[] adj;
   
  private int V;  //number of vertices
  private int E;   //number of Edge
  
  public Recursive_DFS (int nodes)
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
  
  //Algo of DFS
  public void dfs(){
	  boolean[] visited = new boolean[V];
	  for(int v=0;v<V;v++){
		  if(!visited[v])  //here we know it start form 0
		  {
			  dfs(v,visited);
		  }
	  }
  }
  public void dfs(int v,boolean[] visited)
  {
	  visited[v]=true;
	  System.out.print(v+" ");
	  for(int w:adj[v])
	  {
		  if(!visited[w])
		  {
			  dfs(w,visited);
		  }
	  }
  }
  
  public void Add_one(int u,int v){
	  this.adj[u].add(v);
	  E++;
  }
  
  
  public static void main(String args[])
  {
	  Recursive_DFS  obj = new Recursive_DFS (6);
		 obj.addEdge(0, 1); 
		 obj.addEdge(1, 2);
		 obj.addEdge(2, 3);
		 obj.addEdge(3, 0);
		 obj.addEdge(2, 4);
		 obj.Add_one(4, 5);  //it seem to like that 4 is connect to the 5 but 5 not connect to the 4 as Add_one method so the value 5 of the graph no connect to anyone of the vertex to the graph.
	     System.out.print(obj);
	     System.out.print("The element after Recursive_DFS-->");
	     obj.dfs();
	     
  }
}

