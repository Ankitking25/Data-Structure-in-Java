package Sorting;
//Selection Sort 
//Selection basically selected the min value of the array and fixed it its right postion in Array;

 
public class Selection_Sort {
	public void Selectionsort(int arr[],int n)
	{
		for(int i=0;i<n-1;i++)
		{
			int min=i;
			for(int j=i+1;j<n;j++)  //Loop that find min
			{
				if(arr[j]<arr[min])
				{
					min=j;
				}
			}
			//if find the minimum for 1st Iteration then swap find the its position similarly Repeat;
			int temp=arr[min];
			arr[min] = arr[i];
			arr[i]=temp;
		}
	}
	public void printArray(int[] arr,int n){
		for(int i=0;i<n;i++)
		{
			System.out.print(arr[i]+" ,");
		}
		System.out.print("");
	}
	
   public static void main(String args[])
   {
	   int arr[] = new int[]{4,43,2,44,54,2,4,1};
	   Selection_Sort obj = new Selection_Sort();
	   obj.printArray(arr,arr.length);
	   obj.Selectionsort(arr,arr.length);
	   System.out.println("\nAfter Sorted : ");
	   obj.printArray(arr,arr.length);
   }
}
