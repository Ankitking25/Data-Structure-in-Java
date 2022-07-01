package Graphs;
import java.util.LinkedList;
public class AdjacencyList {
  private LinkedList<Integer>[] adj;
   
  private int V;  //number of vertices
  private int E;   //number of Edge
  
  public AdjacencyList(int nodes)
  {
	  this.V=nodes;  //vertex = same as node 
	  this.E=0;   //Initial;
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
		  for(int w : adj[i]){   //here adj[0] means-1,3 ,adj[1] means 0,2 as according to Graphs
			  sc.append(w+" ");
		  }
		  sc.append("\n");
	  }
	  return sc.toString();
  }
  
  public static void main(String args[])
  {
	  AdjacencyList obj = new AdjacencyList(4);
		 obj.addEdge(0, 1); 
		 obj.addEdge(1, 2);
		 obj.addEdge(2, 3);
		 obj.addEdge(3, 0);
	     System.out.print(obj);
  }
}
