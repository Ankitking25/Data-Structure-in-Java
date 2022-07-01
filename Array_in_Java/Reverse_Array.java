package Array_in_Java;
                                                                                                                                                                                                                                                                                                                        
public class Reverse_Array {
 //Algo
	public void Reverse(int arr[],int start,int end)
	{
		while(start<end)
		{
			int temp = arr[start];
			arr[start]=arr[end];
			arr[end]=temp;
			start++;
			end--;
		}

	}
//Algo_upto
	  public static void printarray(int arr[])
	  {
		  for(int i=0;i<arr.length;i++)
		  {
			  System.out.print(arr[i]+" ");
		  }
		  System.out.println(" ");
	  } 
	  
public static void main(String args[])
	{
		Reverse_Array obj = new Reverse_Array();
		int myarray[]={12,423,34,23};  //input the 
		printarray(myarray);
		//Declared the start and end 
		obj.Reverse(myarray,0,myarray.length-1);
		printarray(myarray);    //Output array
		
	}
}
