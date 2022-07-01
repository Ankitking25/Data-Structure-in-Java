package Dynamic_Programming;
//Maximum sum subarray
//problem 173 kadanes algorithm how to find the max value of in a array by using subArray;
public class Maximum_Sum_Subarray
{
	public int Maximum_Sum_Sabarray(int[] arr)
	{
		   int maxSofar=arr[0];
		   int currentMax=arr[0];
		   for(int i=1;i<arr.length;i++)
		   {
			   currentMax=currentMax+arr[i];
			   if(currentMax<arr[i])
			   {
				   currentMax=arr[i];
			   }
			   if(maxSofar<currentMax)
			   {
				   maxSofar=currentMax;
			   }
			   
		   }
		   return maxSofar;
	}
	public static void main(String args[])
	{
		int[] arr ={4,3,-2,6,-12,7,-1,6};
		Maximum_Sum_Subarray sc = new Maximum_Sum_Subarray();
		int a=sc.Maximum_Sum_Sabarray(arr);
		System.out.println(a);
		
	}
}