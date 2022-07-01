//Time Complexity Demo 

public class TimeComplexityDemo {
    public static void main (String args[])
    {
    	double now = System.currentTimeMillis();
    	
    	TimeComplexityDemo demo= new TimeComplexityDemo();
    	System.out.println(demo.findSum(999999));
    	System.out.println("Time taken - "+(System.currentTimeMillis() - now)+"millisecs.");
    	
    	
    }
    
  //Time taken 0.0milisec            //Run one time and see the time value 
  /* public int findSum(int n)
   {
	   return n*(n+1)/2;
   }
}
*/
                                 
   //Time taken 10.0 millisecond    //Run one time and see the time value
    public int findSum(int n)
    {
    	int sum=0;
    	for(int i=1;i<=n;i++)
    	{
    		sum=sum+i;
    	}
    	return sum;
    }
}

