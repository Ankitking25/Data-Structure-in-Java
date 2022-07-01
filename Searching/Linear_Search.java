package Searching;
//Linear Searching
//Search Element is Simple Linear Form
public class Linear_Search {
  public int Search(int arr[],int n,int x)
  {
	for(int i=0;i<n;i++)
	{
		if(arr[i]==x)
		{
			return i;  //return the index of the element found
		}
	}
	return -1;         //If element is not to be found
  }
  public static void main(String args[])
  {
	  int arr[] = {2,3,4,3,12,3};
	  Linear_Search obj = new Linear_Search();
	  System.out.print(obj.Search(arr,arr.length,12));  //Element is found and we print the index of the element
	  System.out.println("");
	  System.out.print(obj.Search(arr,arr.length,6));   //Element is not found so we print -1 as Simply;
	  
  }
}
