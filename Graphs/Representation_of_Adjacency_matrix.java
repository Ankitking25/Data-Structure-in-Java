package Graphs;
//Basic Representation of Adjacency Matrix of an Undirected Graph
public class Representation_of_Adjacency_matrix {
 private int[][] Adjmatrix;
 
    //making of array and pass the size as nodes
   public Representation_of_Adjacency_matrix(int nodes)
   {
 	  this.Adjmatrix = new int[nodes][nodes];
   }
 
 public void addEdge(int u,int v)
 {
	 this.Adjmatrix[u][v]=1;
	 this.Adjmatrix[v][u]=1;
	 
 }
 public static void main(String args[])
 {
	 Representation_of_Adjacency_matrix g = new Representation_of_Adjacency_matrix (4); //making of object of main class and pass the size of array as nodes in constructor;
	 //add value in Adjmatrix Graphs;
	 g.addEdge(0, 1); 
	 g.addEdge(1, 2);
	 g.addEdge(2, 3);
	 g.addEdge(3, 0); //reverse 0,3 as we already decleared in addEdge matrix
 }
}
