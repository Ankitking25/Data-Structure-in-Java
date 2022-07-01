package Tree_in_java;
import java.util.*;
public class Implement_a_binary_Tree 
{
	private TreeNode root;
	public class TreeNode{
		private int data;
		private TreeNode left;
		private TreeNode right;
		
		public TreeNode(int data){    //Constructor for auto calling
			this.data=data;
		}
		}
	
	//Preorder Traversing by Recursive of root node -->root,left,right
	//remember always print root node
		public void Preorder(TreeNode root)
		{
			if(root==null)
			{
				return;
			}
			System.out.print(root.data+", ");
			Preorder(root.left);
			Preorder(root.right);
		}
		
	//Iterative preorder by using Stack 
	 public void Iterative_Preoder_Traversal()
	 {
		 if(root==null)
		 {
			 return;
		 }
		 Stack<TreeNode>  stack = new Stack<>();
		 stack.push(root);
		 while(!stack.isEmpty())
		 {
			 TreeNode temp = stack.pop();
			 System.out.print(temp.data+", ");
			 if(temp.right!=null)
			 {
				 stack.push(temp.right);
			 }
			 if(temp.left!=null)
			 {
				 stack.push(temp.left);
			 }
		 }
	 }
	 
	
		
	 //Inorder Traversal --> left,root,right
		public void Inorder(TreeNode root){
			if(root==null)
			{
				return;
			}
			Inorder(root.left);
			System.out.print(root.data+" ,");
			Inorder(root.right);
		}
		
		 //Iterative Inorder by using stack
		 public void Iterative_Inorder_Traversal(TreeNode root){
			 if(root==null)
			 {
				 return;
			 }
			 Stack<TreeNode> stack = new Stack<>();
			 TreeNode temp=root;
			 
			 while(!stack.isEmpty() || temp!=null)
			 {
				 if(temp!=null)
				 {
					 stack.push(temp);
					 temp=temp.left;
				 }
				 else{
					 temp=stack.pop();
					 System.out.print(temp.data+" ,");
					 temp=temp.right;
				 }
			 }
		 }
		
	//Iteravtive Postorder Traversal of Tree-->
	/*
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 */
	
	//Recursive Postorder Traversal of Tree-->left,right,root
		public void Postorder(TreeNode root)
		{
			if(root==null)
			{
				return;
			}
			Postorder(root.left);
			Postorder(root.right);
			System.out.print(root.data+" ,");
		}
		
		//Level order Traversal in Tree
		public void Level_order(TreeNode root)
		{
			if(root==null)
			{
				return;
			}
			Queue<TreeNode> queue = new LinkedList<>();
			queue.offer(root);
			while(!queue.isEmpty())
			{
				TreeNode temp=queue.poll();
				System.out.print(temp.data+" ,");
                if(temp.left!=null)
                {
                	queue.offer(temp.left);
                }
                if(temp.right!=null)
                {
                	queue.offer(temp.right);
                }
			}
		}
		
	//Find the maximum of the Tree
		public int FindMax(TreeNode root)
		{
			if(root==null){
				return Integer.MIN_VALUE;
			}
			int result = root.data;
			int left=FindMax(root.left);
			int right=FindMax(root.right);
			if(left>result)
			{
				result=left;
			}
			if(right>result)
			{
				result=right;
			}
			
			return result;
		}
		
		
		
	public void CreateBinaryTree(){
		TreeNode first = new TreeNode(9);
		TreeNode second = new TreeNode(2);
		TreeNode third = new TreeNode(3);
		TreeNode fourth = new TreeNode(4);

		
		root = first;
		first.left=second;
		first.right=third;   //second<------first--->third
		
		second.left=fourth;
   
	}
	
	
	public static void main(String args[])
	{
		Implement_a_binary_Tree  obj = new Implement_a_binary_Tree ();
		obj.CreateBinaryTree();
		System.out.print("Recursive Preorder Traversing = ");
		obj.Preorder(obj.root);
		System.out.print("\nIterative Preorder Traversing = ");
		obj.Iterative_Preoder_Traversal();
		
		System.out.print("\nRecursive Inorder Traversing = ");
		obj.Inorder(obj.root);
		System.out.print("\nIterative Inorder Traversing = ");
		obj.Iterative_Inorder_Traversal(obj.root);
		System.out.print("\nRecursive Postorder Traversing = ");
		obj.Postorder(obj.root);
		System.out.print("\nLevel Order Traversing = ");
		obj.Level_order(obj.root);
		System.out.println("\nFind the max of the Tree");
		int a=obj.FindMax(obj.root);
	    System.out.println("The maximum is : "+a);
		
	}
}
