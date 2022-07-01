package Dynamic_Programming;
//Planner recurrive use
public class Recursive_Fibonaci {
//algo
    public int Recursive_Fibonaci(int n){
    	if(n==0){
    		return 0;
    	}
    	if(n==1)
    	{
    		return 1;
    	}
    	int left=Recursive_Fibonaci(n-1);
    	int right=Recursive_Fibonaci(n-2);
    	return left+right;
    }
	public static void main(String args[])
	{
		int arr[] = new int[5];
		Recursive_Fibonaci sc = new Recursive_Fibonaci();
	    System.out.print(sc.Recursive_Fibonaci(5)); //print the index 5 value;
	}
}
