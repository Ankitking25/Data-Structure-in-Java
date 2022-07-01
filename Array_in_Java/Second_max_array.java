package Array_in_Java;
//print the second maximum element in the array not count reptition in as second maximum
public class Second_max_array {
	
public int findSecondMax(int arr[])
{
	int max=Integer.MIN_VALUE;  //Give the max=-2147483648
	int secondmax=Integer.MIN_VALUE;  //Give the secondmax=-2147483648
	for(int i=0;i<arr.length;i++)
	{
		if(arr[i]>max)
		{
			secondmax=max;
			max=arr[i];
		}
		else if(arr[i]>secondmax && arr[i]!=max)
		{
			secondmax=arr[i];
		}
	}
	return secondmax;
}
public void printName()
{
	int myarray[] = {13,34,2,34,33,1};
	findSecondMax(myarray);
	for(int i =0;i<myarray.length;i++)
	{
		System.out.print(myarray[i]+" ");
	}
	System.out.print("");
	findSecondMax(myarray);
	
	//print the return value of the seocondmax
 /*   int a =findSecondMax(array);  
	System.out.println();
	System.out.println("The Second max is : "+a);
	*/
}
	
	
	
public static void main(String args[])
	{
		Second_max_array obj = new Second_max_array();
		obj.printName();
	}
}
