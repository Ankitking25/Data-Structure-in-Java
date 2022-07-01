package Graphs;
import java.util.LinkedList;
//Adjacency list of Graph;
public class Adjacency_List_Representation {
	private LinkedList<Integer>[] adj;
	
	public Adjacency_List_Representation(int nodes)
	{
		this.adj = new LinkedList[nodes];
		for(int i=0;i<nodes;i++){
			this.adj[i] = new LinkedList<>();
		}
	}
	
	public void addEdges(int u , int v){
		this.adj[u].add(v);
		this.adj[v].add(u);
	}
	
	
public static void main(String args[])
{
	Adjacency_List_Representation  obj = new Adjacency_List_Representation (4);
	obj.addEdges(0, 1);
	obj.addEdges(1, 2);
	obj.addEdges(2, 3);
	obj.addEdges(3, 0);
	
}
}
