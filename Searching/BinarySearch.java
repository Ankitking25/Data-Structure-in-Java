package Searching;
//Binary Search 
/*Find element by make a array half and check the element is on the right part or on left part
 * after find element on left or right again make that subpart of array as a new array and find 
 * it mid part and come_pair karo fir sa element is in left or right part of the Array
 */
public class BinarySearch 
{
  public int Binary(int arr[],int key)
  {
	  int low=0;
	  int high=arr.length-1;
	  while(low<=high)
	  {
		  int mid=(high+low)/2;
		  if(arr[mid]==key)
		  {
			  return mid;
		  }
		  if(key<arr[mid])
		  {
			  high=mid-1;
		  }
		  else
		  {
			  low=mid+1;
		  }
	  }
	  return -1;
	  
  }
  public static void main(String args[])
  {
	  BinarySearch obj = new BinarySearch();
	  int arr[] = {1,10,20,47,59,65,75,88,99};
	  System.out.println(obj.Binary(arr,88));
  }
}
