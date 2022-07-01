package Array_in_Java;
//print the minimum element in the array
public class Min_of_Array {
//Algo
public int Minimum(int arr[])
{
	int min=arr[0];
	for(int i=1;i<arr.length;i++) 
	{
		if(arr[i]<min);
		{
		min=arr[i];
		}
	}
	return min;
//Algo upto
}
 public void Name()
 {
	 int myarray[] ={21,34,343,5,7};
	 Minimum(myarray);
	
	 
 }
public static void main(String args[])
{
	Min_of_Array obj = new Min_of_Array();
	obj.Name();
	
}
}
