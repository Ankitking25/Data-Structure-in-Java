package Array_in_Java;
//Given an Array of Integers,return an array with even integers removed/                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             
//Input arr = {3,2,4,7,10,6,5}
//Output arr={3,7,5}
import java.util.Scanner;
//Main algo
public class Remove_Even_Array {
    public void RemoveEven(int arr[])
    {
         int oddCount=0;
         for(int i=0;i<arr.length;i++)
         {
        	 if(arr[i]%2!=0)
        	 {
        		 oddCount++;
        	 }
         }
         int idx=0;
         int result[] = new int[oddCount];
         for(int i=0;i<arr.length;i++)
         {
        	 if(arr[i]%2!=0)
        	 {
        		 result[idx]=arr[i];
        		 idx++;
        	 }
         }
         //Main algo Upto
         
        //for output the data of no even
         System.out.println("The required Output is:");
         for(int i=0;i<result.length;i++){
        	 System.out.print(result[i]+" ");
         }
    }
    public void myarray()
    {
    	Scanner sc = new Scanner(System.in);
    	System.out.println("Enter the size of the array Required");
    	int size = sc.nextInt();
    	int array[] = new int[size];
    	System.out.println("Enter the element in the array");
    	for(int i=0;i<size;i++)
    	{
    		array[i]=sc.nextInt();
    	}
    	/*array[0]=3;
    	array[1]=2;
    	array[2]=4;
    	array[3]=7;
    	array[4]=10;
    	array[5]=6;
    	array[6]=5;*/
    	System.out.println("You Enter the Data");
    	for(int i=0;i<size;i++)
    	{
    		System.out.print(array[i]+" ");
    	}
    	System.out.println("-------------------------------------------------------------");
    	RemoveEven(array);
    }
    public static void main(String args[])
    {
    	Remove_Even_Array obj = new Remove_Even_Array();
    	obj.myarray();
    }
}














//count howmany array and make a new array and put all odd in it