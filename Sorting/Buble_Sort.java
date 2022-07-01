package Sorting;
//Bubble Sort current and next ko ek ek badhata raho after update agar ho to nahi to no problem
public class Buble_Sort {  
	
	//
	 public void PrintArray(int[] arr)
	  {
		  int n=arr.length;
		  for(int i=0;i<n;i++)
		  {
			  System.out.print(arr[i]+" ,");
		  }
		  System.out.println();
	  }	
	
  public void Bubble(int arr[],int n)
    {
	for(int i=0;i<n-1;i++)
	{
		boolean isSwapped=false;   //we Know that if swapping is not held mean number are in Sorted form;
		for(int j=0;j<n-1-i;j++)
		{
			if(arr[j]>arr[j+1])
			{
				int temp=arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=temp;
				isSwapped=true;
			}
			
		}
		if(isSwapped==false)
		{
			break;
		}
	}
}
 
  
  public static void main(String args[])
  {
	  int arr[] = new int[]{5,1,9,2,10};
	  Buble_Sort obj = new Buble_Sort();
	  obj.PrintArray(arr);
	  obj.Bubble(arr,arr.length);
	  obj.PrintArray(arr);
	 
  }
}
