package Graphs;  //Iterative Depth First Search
import java.util.LinkedList;
import java.util.Stack;
public class DFS {
  private LinkedList<Integer>[] adj;
   
  private int V;  //number of vertices
  private int E;   //number of Edge
  
  public DFS(int nodes)
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
  
   public void dfs(int s)
   {
	   boolean[] visited = new boolean[V];
	   Stack<Integer> stack = new Stack<>();
	   stack.push(s);
	   while(!stack.isEmpty())
	   {
		   int u=stack.pop();
		   if(!visited[u])
		   {
			   visited[u]=true;
			   System.out.print(u+" ");
			   for(int v:adj[u])
			   {
				   if(!visited[v]){
					   stack.push(v);
				   }
			   }
		   }
	   }
   }
  
  public static void main(String args[])
  {
	  DFS obj = new DFS(5);
		 obj.addEdge(0, 1); 
		 obj.addEdge(1, 2);
		 obj.addEdge(2, 3);
		 obj.addEdge(3, 0);
		 obj.addEdge(2, 4);
	     System.out.print(obj);
	     System.out.print("The element after dfs-->");
	     obj.dfs(0);
	     
  }
}


