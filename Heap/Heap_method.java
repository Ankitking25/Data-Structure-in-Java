package Heap;
//Max heap
//Creation of heap,Insertion in of heap and print the heap data of heap;
public class Heap_method {
  
	Integer heap[];
	int n;
	
	public Heap_method(int capacity)
	{
		heap = new Integer[capacity+1];
		n=0;
	}
	public boolean isEmpty()
	{
		return n==0;
	}
	public int Size()
	{
		return n;
	}
	
	//
	public void Insert(int x)
	{
		if(n==heap.length-1)
		{
			resize(2*heap.length);
		}
        n++;
        heap[n]=x;
        swin(n);
	}
    public void swin(int k)
    {
    	while(k>1&&heap[k/2]<heap[k])
    	{
    		int temp=heap[k];
    		heap[k]=heap[k/2];
    		heap[k/2]=temp;
    		k=k/2;
    	}
    }
	
	public void resize(int capacity)
	{
		Integer[] temp = new Integer[capacity];
		for(int i=0;i<heap.length;i++)
		{
			temp[i]=heap[i];
		}
		heap=temp;
	}
	
	//Display heap data
	public void printmaxheap()
	{
		for(int i=1;i<=n;i++) //if we start i=0 the we get a null as index 0;
		{
			System.out.print(heap[i]+" ,");
		}
	}
	public static void main(String args[])
	{
		Heap_method obj = new Heap_method(3);
		//System.out.println(obj.Size());
		//System.out.println(obj.isEmpty());
		obj.Insert(4);
		obj.Insert(5);
		obj.Insert(2);
		obj.Insert(6);
		obj.Insert(1);
		obj.Insert(3);
		System.out.println(obj.Size());
		obj.printmaxheap();
	}
}
