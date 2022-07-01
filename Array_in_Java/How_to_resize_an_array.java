package Array_in_Java;
//How to Resize the an Array part 76
public class How_to_resize_an_array {
	
public void printArray(int[] arr)
{
	int n = arr.length;
	for(int i=0;i<n;i++)
	{
		System.out.println(arr[i]+" ");
	}
	System.out.println();
}

public int[] resize(int arr[],int capacity)  //5 if use void
{
	int temp[] = new int[capacity];
	for(int i=0;i<arr.length;i++){
		temp[i]=arr[i];
	}
	arr=temp;
	return arr;  //return arr as return type
	
}


public static void main(String args[])
{
	How_to_resize_an_array obj = new How_to_resize_an_array();
	//obj.printArray(new int[] {32,12,42,12,342});
	int[] original = new int[]{5,23,243,23,4};
	System.out.println("The size of the original array is: "+original.length);
	
	
	//we update as size 10 But output is 5 because the void method go to Garbage collection
	//And reset same array call hence the size of the array is 5 as output
	//obj.resize(original,10);
	//System.out.println("The size of the resize array is: "+original.length);
	original=obj.resize(original,10);
	System.out.println("The size of the resize array is : "+original.length);
	
}
}
