package Sorting;
//Merge_Sort Algorithm ,--merge sort is a divide and conquer algorithm
public class Merge_Sort{
	
//Algo of Division or array of Merge sort
	public void Merge_DD(int arr[],int temp[],int low,int high)
	{
		if(low<high)
		{
			int mid=low+(high-low)/2;  //overflow if we use mid=(low+high)/2 in case of a big array
			Merge_DD(arr,temp,low,mid);
			Merge_DD(arr,temp,mid+1,high);
			Merging(arr,temp,low,mid,high);
		}
	}
//Division algo upto
//Algo of Conquer 
	public void Merging(int[] arr,int[] temp,int low,int mid,int high)
	{
		for(int i=low;i<=high;i++)
		{
			temp[i]=arr[i];
		}
		int i=low;int j=mid+1;int k=low; //i Traverse left Sorted Sub array //j Traverse right sorted Sub array// k Will merge both array into original array(arr);
		while(i<=mid&&j<=high)
		{
			//if(temp[i]>temp[j])  //If use this then Sorting in Descending order
			if(temp[i]<=temp[j]) //Sorting is Ascending order
			{
				arr[k]=temp[i];
				i++;
				k++;
			}
			else{
				arr[k]=temp[j];
				j++;
				k++;
			}
		}
		while(i<=mid)  //AS simple idea of Merge_two_sorted Array and make a resultant array as sorted
		{                //where we check both two condition as While(i<n) or while(i<m) seperately also because at we use two different arr or arr1
			arr[k]=temp[i];  //But here only one condition go out of bound when when j>high ,i always satisfy the condition while(i<=mid) becaue we divided mid as for in odd condtion as 
			i++;
			k++;
		}
	}
//Algo Of Conquer
//Algo upto 
	
 public void printArray(int[] arr){
	 int n=arr.length;
	 for(int i=0;i<n;i++)
	 {
		 System.out.print(arr[i]+" ,");
	 }
	 System.out.println("");
 }
 
 public static void main(String args[])
 {
	 int arr[] = new int[] {9,5,2,4,3,-1};
	 Merge_Sort ms= new Merge_Sort();
	 ms.printArray(arr);
	 ms.Merge_DD(arr,new int[arr.length],0,arr.length-1);
	 ms.printArray(arr);
 }
}
