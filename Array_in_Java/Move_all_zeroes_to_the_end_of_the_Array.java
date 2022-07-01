package Array_in_Java;
//Move zero to the end of the array such that the order of the element is not change
public class Move_all_zeroes_to_the_end_of_the_Array {
public void Arry(int arr[],int n)
{
  	int j=0;
  	for(int i=0;i<n;i++)
  	{
  		if(arr[i]!=0 && arr[j]==0)
  		{
  			int temp=arr[i];
  			arr[i]=arr[j];
  			arr[j]=temp;
  		}
  		if(arr[j]!=0)
  		{
  			j++;
  		}
  	}
}
public void printarray()
{
	int myarray[] = {12,32,0,6,0,75,0,65,88,0,32};
   int n=myarray.length;
	Arry(myarray,n);
	for(int i=0;i<myarray.length;i++)
	{
		System.out.print(myarray[i]+" ");
	}
	System.out.println();
}
	
public static void main(String args[])
{
	Move_all_zeroes_to_the_end_of_the_Array obj = new Move_all_zeroes_to_the_end_of_the_Array();
	obj.printarray();
}
}
