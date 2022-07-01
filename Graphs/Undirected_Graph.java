package Graphs;
//Adjacency Undirected graph matrix
public class Undirected_Graph {
	private int V;   //number of vertices in Graph
	private int E;    //number of Edge in Graph
    private int[][] adjmatrix;
  
  public Undirected_Graph(int size)
  {
	  this.V=size;   //Initial node are size of matrix like 3 or 4;
	  this.E=0;  //Initial the number of Edges are zero;
	  this.adjmatrix = new int[size][size];  //Initialize the size as adjmatrix;
  }
  
  public void AddEdge(int u,int v)
  {
	  this.adjmatrix[u][v]=1;
	  this.adjmatrix[v][u]=1;
	  E++; //after the count of Edge the node is increase as 1;
  }
  
  public String toString(){
	  StringBuilder sb = new StringBuilder();
	  sb.append(V+"vertice "+E+"Edges"+"\n");
	  for(int i=0;i<V;i++)
	  {
		  sb.append(i + ":");
		  for(int w:adjmatrix[i])
				  {
			          sb.append(w+" ");
				  }
		  sb.append("\n");
	  }
	  return sb.toString();
  }
  
  public static void main(String args[])
  {
	  Undirected_Graph g = new Undirected_Graph(4);
	  g.AddEdge(0, 1);
	  g.AddEdge(1, 2);
	  g.AddEdge(2, 3);
	  g.AddEdge(3, 0);
	  System.out.print(g);
  }
}
