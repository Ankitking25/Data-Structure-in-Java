package Sorting;
//Quick sort is a divide and Conquer Algorithm.It Involves 
/*""first""->We pick an element and mark it as pivot.The pivot element
 can be first element , last element or any random element.
 ""Second""->We reorder the array such that all element greater than pivot
 comes after the pivot and all element  smaller than pivot comes before
 the pivot.The elements equal to pivot can go either side of the pivot.
 After this partitioning the pivot is at its correct sorted position
 ""Third->Recursively apply the above steps on the sub array formed to the
 left side of pivot and on the sub array formed on the right side of the pivot*/

public class Quick_Sort {
//Algo start
//Algo of Recursive or Division
	public void QuickRecursive(int arr[],int low ,int high)
	{
		if(low<high)
		{
			int p=Quicksort(arr,low,high);
			QuickRecursive(arr,low,p-1);
			QuickRecursive(arr,p+1,high);
		}
	}
//Algo of Recursive or Division upto
	
//Algo of Conquer
	public int Quicksort(int[] arr,int low,int high)
	{	
		int Pivot=arr[high];   //we can also choose random value of pivot only make the condition so that it Maintain the Quick Algorithm;
		int i=low;  //we do not use 0 , u can use that given condition when we take Pivot as last element , for showing the i as minimum of that given array(update wala array) take as low or j as given update array take's maximum take as high;
		int j=low;
		while(i<=high)
		{
			if(arr[i]<=Pivot)
			{
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				j++;
			}
			i++;
		}
		return j-1;  //return the j-1 value mean Pivot ke left wale element
		
	}
//Algo of Conquer upto
//Algo upto
	
	//For Display Element
	public void printArray(int[] arr)
	{
		int n=arr.length;
		for(int i=0;i<n;i++)
		{
		System.out.print(arr[i]+" ,");
		}
		System.out.println("");
	}

	
 public static void main(String args[])
 {
	 int arr[] =new int[]{9,-3,5,2,6,8,-6,1,3};
	 Quick_Sort obj = new Quick_Sort();
	 System.out.println("Array Before Sorting : ");
	 obj.printArray(arr);
	 System.out.println("Array After Sorting : ");
	 obj.QuickRecursive(arr,0,arr.length-1);
	 obj.printArray(arr);
	 
 }
}
//Iterative of color problem or Dutch National flag problem is very useful in QuickSort;
