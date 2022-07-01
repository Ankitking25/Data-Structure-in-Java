package Array_in_Java;
//Type of initialize the array method_2
public class Array {
 public void array(int arr[])
 {
	 
	 int n=arr.length;
	 for(int i=0;i<arr.length;i++)
	 {
		 System.out.print(arr[i]+" ");
	 }
	 System.out.println("");
	 
 }
 
 
 public static void main(String arg[])
 {
	 Array obj = new Array();
	 obj.array(new int[] {2,34,56,34,2});  //Directly pass the array value 
 }
}
