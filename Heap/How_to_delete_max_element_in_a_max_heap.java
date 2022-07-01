package Heap;
//Delete max element and again reheapify the heap
public class How_to_delete_max_element_in_a_max_heap {
  
	Integer heap[];
	int n;
	
	public How_to_delete_max_element_in_a_max_heap(int capacity)
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
	
	//How to delete max element in a Max heap
//algo
	public int Delete_Max_Heap()
	{
		int max=heap[1];
		swap(1,n);
		n--;
		sink(1);
		heap[n+1]=null;
		if(n>0&&(n==(heap.length-1)/4))
		{
			resize(heap.length/2);
		}
		return max;
	}
	
	private void sink(int k)
	{
		while(2*k<=n)
		{
			int j=2*k;
			if(j<n&&heap[j]<heap[j+1])
			{
				j++;
			}
			if (heap[k]>=heap[j])
			{
			  break;
			}
			swap(k,j);
			k=j;
		}
	}
	public void swap(int a ,int b)
	{
		int temp=heap[a];
		heap[a]=heap[b];
		heap[b]=temp;
	}
//algoUpto
	
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
		How_to_delete_max_element_in_a_max_heap obj = new How_to_delete_max_element_in_a_max_heap(3);
		obj.Insert(4);
		obj.Insert(5);
		obj.Insert(2);
		obj.Insert(6);
		obj.Insert(1);
		obj.Insert(3);
		obj.printmaxheap();
		System.out.println(" \nAfter Delete  max heap \nThe heap is Reheapify");
		obj.Delete_Max_Heap();
		obj.printmaxheap();
		System.out.println("\nFor checking first make a heap tree as a property of Complete Tree");
		System.out.println(obj.Size());
	}
}

