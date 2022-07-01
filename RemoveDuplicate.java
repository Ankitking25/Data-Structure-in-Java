//Remove a Duplicate  sorted node in java

public class RemoveDuplicate 
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
  
  
  
  //remove duplicate node form linked list
  //Question : How to remove duplicate from sorted singly linked list
  //-->sorted mean here the same value repeated in continuous manner not as 1-->2-->1-->
  public void RemoveDup(){
	  if(head==null){
		  return;
	  }
	  ListNode current=head;
	  while(current!=null && current.next!=null){
		  if(current.data==current.next.data){
			  current.next=current.next.next;
		  }
		  
		  current=current.next;
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
  
  
  public static void main(String args[])
  {
	  RemoveDuplicate sll = new RemoveDuplicate();
	  sll.head = new ListNode(1);
	  ListNode second = new ListNode(1);
	  ListNode third = new ListNode(1);
	  ListNode fourth = new ListNode(2);
	  ListNode five = new ListNode(3);
	  ListNode six = new ListNode(2);
	  
	  //Now we will connect them together to form a chain
	  sll.head.next=second;  
	  second.next = third;  
	  third.next = fourth;
	  fourth.next=five;
	  five.next=six;
	  
	  sll.display();
	  
	  //initial :1-->1-->2-->2-->null  remove second 1 or 2 and for continuous system:
	  sll.RemoveDup();
	  System.out.println("");
	  sll.display();
  }
}
