package Dynamic_Programming;
//Bottom to up DP 
public class Dp_Fibonaci {
	
 public int Dp_Fibonaci(int n)
 {
	 int[] table = new int[n+1];
	 table[0]=0;
	 table[1]=1;
	 for(int i=2;i<=n;i++)
	 {
		 table[i]=table[i-1]+table[i-2];
	 }
	 return table[n]; //we just return the table index 5 value
 }
 public static void main(String args[]){
	 Dp_Fibonaci sc = new Dp_Fibonaci();
	 System.out.print("The 6th fibonacci Number is "+sc.Dp_Fibonaci(5));
 }
}
