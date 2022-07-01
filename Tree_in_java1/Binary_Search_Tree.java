package Tree_in_java1;
//Representation of BST
public class Binary_Search_Tree {
	
  private TreeNode root;
  private class TreeNode{
	  private int data;
	  private TreeNode left;
	  private TreeNode right;
	  
	 public TreeNode(int data)
	 {
		 this.data=data;
	 }
  }
  public void Insertion_in_BST(int value)  //It a construtor use to Initilize first value or we say root value
  {
	  root=Insertion_in_BST(root,value);  //Here constructor overloading is use root go to TreeNode and value go to int value in Insertion_in_BSt which is below;
  }
  
  //above constructor method overload here
  public TreeNode Insertion_in_BST(TreeNode root,int value)
  {
	  if(root==null)
	  {
		  root=new TreeNode(value);
		  return root;
	  }
	  if(value<root.data)
	  {
		  root.left=Insertion_in_BST(root.left,value);
	  }
	  else{
		  root.right=Insertion_in_BST(root.right,value);
	  }
	  return root;
  }
  
  //form seeing data use Inorder-->left,root,right
  public void Inorder(){
	  Inorder(root); 
  }
  //above Inorder method overload here so we required to just call above method;
  public void Inorder(TreeNode root)
  {
	  if(root==null){
		  return;
	  }
	  Inorder(root.left);
	  System.out.print(root.data+" ,");
	  Inorder(root.right);
  }
  
  //Searching a given key is present or not present in BST
  //Constructor
  public TreeNode Search(int key){
	  return Search(root,key);
  }
  //Construtor overlaoding
  public TreeNode Search(TreeNode root,int key)
  {
	  if(root==null||root.data==key)
	  {
		  return root;
	  }
	  if(key<root.data){
		  return Search(root.left,key);
	  }
	  else
	  {
		  return Search(root.right,key);
	  }
  }
  public static void main(String args[])
  {
     Binary_Search_Tree obj = new Binary_Search_Tree();
	 obj.Insertion_in_BST(45);	  //as a root data
	 obj.Insertion_in_BST(42);	 
	 obj.Insertion_in_BST(88);	 
	 obj.Insertion_in_BST(12);	 
	 obj.Insertion_in_BST(47);	 
	 obj.Insertion_in_BST(66);	 
	 obj.Insertion_in_BST(88); 
	 obj.Inorder();
	 
	 //Searching the key,if root null tak paucha gaya the mean key not found
	 //key found hai mean key.data==key wali condition sahi hui hai
	 if(null!=obj.Search(45)) //Give key value Here
	 {
		 System.out.print("\nKey Found");
	 }
	 else{
		 System.out.print("\nKey not Found");
	 }
  }
}
