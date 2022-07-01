//How to insert a node in a Sorted Singly Linked list in java

public class Insert_a_node_in_shortedlist   
{    
  private ListNode head;     //Make head of the ListNode
  private static class ListNode     //Make a class ListNode 
  {
	  private int data;             //-->Initialize the variable name data.
	  private ListNode next;       //--->Initialize the variable next that make ListNode property as next.
	  
	  public ListNode(int data)    //-->make a constructor and passing an int type value in data.
	  {     
		  this.data=data;     //Reference to it own class
		  this.next=null;     //reference to same or own class
	  }
  }
  
  
  //Method to display the linked list
  public void display()
  {
	  ListNode current=head;
	  while(current!=null)
	  {
		  System.out.print(current.data + "-->");
		  current = current.next;
	  }
	      System.out.print("null");
  }
  
  
  public ListNode Insetion_in_shortedlist(int value)
  {
	  ListNode new_node = new ListNode(value);
		  if(head==null){
			  return new_node;
		  }
		  else{
			  ListNode current=head;
			  ListNode temp=null;
			  while(current!=null && current.data<new_node.data){
				  temp=current;
				  current=current.next;
			  }
			  new_node.next=current;
			  temp.next=new_node;
		  }
		  return head;
  }
  
  public static void main(String args[])
  {
	  Insert_a_node_in_shortedlist sll = new Insert_a_node_in_shortedlist();
	  sll.head = new ListNode(3);
	  ListNode second = new ListNode(5);
	  ListNode third = new ListNode(6);
	  ListNode fourth = new ListNode(9);
	  
	  //Now we will connect them together to form a chain
	  sll.head.next=second;  //10-->1
	  second.next = third;   //10-->1--7-->
	  third.next = fourth;      //10-->1-->7--23-->null
	  sll.display();
	  System.out.println("");
	  sll.Insetion_in_shortedlist(4);  //not valid for position one
	  sll.display();
  }
}
