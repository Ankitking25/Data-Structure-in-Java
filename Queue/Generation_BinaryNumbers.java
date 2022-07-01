//Generating Binary Number form 1 to n in an order of natural Numbers;

package Queue;
import java.util.Queue;
import java.util.LinkedList;
import java.util.Scanner;  
public class Generation_BinaryNumbers{
//Algo
  public String[] generate(int n)
  {
	  String[] result =new String[n];
	  Queue<String> q = new LinkedList<>();
	  q.offer("1");
	  for(int i=0;i<n;i++)
	  {
		  result[i]=q.poll();
		  String n1 = result[i]+"0";
		  String n2 = result[i]+"1";
		  q.offer(n1);
		  q.offer(n2);
	  }
	  return result; //return type is String and array Both so remember in calling;
//Algo_upto
  }
  public static void main(String args[])
  {
	  Generation_BinaryNumbers obj = new Generation_BinaryNumbers();
	  String[] temp = obj.generate(6); //b is String Array type
	  for(int i=0;i<temp.length;i++)
	  {
		  System.out.print(temp[i]+"-->");
	  }
	  
  }
}
