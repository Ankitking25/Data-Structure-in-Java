//How to Reverse the String by using Stack in java;
package Stack;
import java.util.Stack;
public class Reverse_String_by_Stack {
	public static String reverse(String str)  //return type is String
	{
		Stack<Character> stack = new Stack<>();
		char[] chars = str.toCharArray();
		for(char c : chars)
		{
			stack.push(c);
		}
		for(int i=0;i<str.length();i++)
		{
			chars[i] = stack.pop();
		}
		return new String(chars);
	}
  public static void main(String args[])
  {
	  String str="ABCD";
	  System.out.println("Before reverse :"+str);
	  System.out.println("After reverse :"+reverse(str));
  }
                                                          
}
