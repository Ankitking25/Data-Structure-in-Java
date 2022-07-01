package Sorting;
//Given an array containing only 0,1,and 2.Sort the array in linear time and constant space;
public class Dutch_National_flag_problem {
  //Also called as flag color problem
	public void ThreeColorSort(int[] arr)
	{
		int i=0;
		int j=0;
		int k=arr.length-1;
		while(i<=k)
		{
			if(arr[i]==0)
			{
				swap(arr,i,j);
				i++;
				j++;
			}
			else if(arr[i]==1)
			{
				i++;
			}
			else if(arr[i]==2)
			{
				swap(arr,i,k);
				k--;
			}
		}
	}
	public void swap(int[] arr,int i,int j){
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}
	
	public void printArray(int[] arr)
	{
		int n=arr.length;
		for(int i =0;i<n;i++)
		{
			System.out.print(arr[i]+" ,");
		}
		System.out.println("");
	}
	public static void main(String args[])
	{
		int arr[] = new int[]{2,0,2,2,0,1,1};
		Dutch_National_flag_problem obj = new Dutch_National_flag_problem();
		System.out.println("Array Before Sorted");
		obj.printArray(arr);
		obj.ThreeColorSort(arr);
		System.out.println("Array after Sorted");
		obj.printArray(arr);
		
	}
}
