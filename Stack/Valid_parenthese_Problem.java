package Stack;
import java.util.Stack;
//Valid parenthese problem
/*condition_1-->Open brackets must be closed by same type of brackets;                                            
 * condition_2-->Open Brackets must be closed in correct order;
 */
public class Valid_parenthese_Problem {
	public boolean Isvalid(String s)
	{
		Stack<Character> stack = new Stack<>();
		for(char c : s.toCharArray()){
			if(c=='('||c=='{'||c=='['){
				stack.push(c);
			}
			else{
				if(stack.isEmpty()){
					return false;
				}
			else{
					char top=stack.peek();
					if((c==')'&&top=='(')||(c=='}'&&top=='{')||(c==']'&&top=='['))
					{
						stack.pop();
				    }
					else
					{
						return false;
					}
				}
			}
		}
		return stack.isEmpty();
	}
 public static void main(String args[])
 {
	 Valid_parenthese_Problem obj = new Valid_parenthese_Problem();
	 boolean a=obj.Isvalid("[{()}]");
	 System.out.println(a);
	 //false like "[()" , "][","(]"
	 //True like "()" , "[()]" , "[{()}]"
 }
}
