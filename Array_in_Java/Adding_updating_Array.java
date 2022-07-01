package Array_in_Java;
//Type of Array pass in method_1
public class Adding_updating_Array {

	public void printArray(int[] arr)
	{
		int n = arr.length;
		for(int i=0;i<n;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	public void ArrayDemo()
	{
		int myArray[] = new int[5];
	//  printArray(myArray);
		//Now add element in array
		myArray[0]=5;
		myArray[1]=55;
		myArray[2]=53;
		myArray[3]=51;
		myArray[4]=57;
		myArray[3]=77;  //update
		printArray(myArray);
		System.out.println(myArray.length);
		int arr[] = {1,2,3,4,5};
		printArray(arr);
		
	}
	public static void main(String args[])
	{
		Adding_updating_Array obj = new Adding_updating_Array();
		obj.ArrayDemo();
	}
}
