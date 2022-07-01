//Merge two sorted array in a way that the new resultant array is also sorted;
//Very useful in Merge sort
public class Merge_Two_Sorted_Array {
  //algo main
	public int[] Merge(int[] arr1,int[] arr2,int n,int m)
	{
		
		int i=0;int j=0;int k=0;
		int result[] = new int[n+m];
		while(i<n&&j<m)
		{
			if(arr1[i]<arr2[j]) 
			{
				result[k] =arr1[i];
				i++;
			}
			else  //when arr1[i]>arr2[j];
			{
				result[k]=arr2[j];
				j++;
			}
			k++;
		}
//algoupto -->partial algo
		//Condition let's when arr1 all element is less then arr2 and it go to the resultant;
		//and as above condition i increment at that time i>arr1.length and j wale element abhi bacha hai
	    //So the given while(i<n&&j<m) Condition get False;
		//Hence use that new condition seprately;
		while(i<n){
			result[k]=arr1[i];
			i++;
			k++;
		}
		while(j<m){
			result[k]=arr2[j];
			j++;
			k++;
		}
		return result;
	}
//Partial Algo
	
	public void printArray(int myarray[]){
		int k=myarray.length;
		for(int i=0;i<k;i++)
		{
			System.out.print(myarray[i]+" ,");
		}
		System.out.println("");
	}
	
	 public static void main(String args[])
	   {
		   int arr1[] = new int[]{2,3,5,10};
		   int arr2[] = new int[]{4,6,11,15};
		   int n=arr1.length;
		   int m=arr2.length;
		   
		   Merge_Two_Sorted_Array obj = new Merge_Two_Sorted_Array();
		   obj.printArray(arr1);
		   obj.printArray(arr2);
		   
		   System.out.println("Merge arr1 and arr2 new Resultant array is : ");
		   int[] result = obj.Merge(arr1,arr2,n,m);
		   obj.printArray(result);
	   }
}
