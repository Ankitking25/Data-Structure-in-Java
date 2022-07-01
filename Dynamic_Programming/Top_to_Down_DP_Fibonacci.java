package Dynamic_Programming;
//Top to Bottom DP of Fibonacci series;
public class Top_to_Down_DP_Fibonacci {
	public int Top_to_Down_DP_Fibonacci(int[] memo,int n)
	{
		if(memo[n]==0)
		{
			if(n<2){
				memo[n]=n;
			}
			else{
				int left=Top_to_Down_DP_Fibonacci(memo,n-1);
				int right=Top_to_Down_DP_Fibonacci(memo,n-2);
				memo[n]=left+right;
			}
		}
		return memo[n]; //return last index value
	}
   public static void main(String args[])
   {
	   Top_to_Down_DP_Fibonacci sc = new Top_to_Down_DP_Fibonacci();
	   int a=sc.Top_to_Down_DP_Fibonacci(new int[5+1],5); //5 number pe 6 fibonacci benti hai so;
	   System.out.print("The value of 6th fibonacci is : "+a);  
   }
}
