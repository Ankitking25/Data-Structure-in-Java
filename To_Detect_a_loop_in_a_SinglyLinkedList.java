//How to detect a loop in an linked list or not
//program is an Loop so an infinite loop is run;
public class To_Detect_a_loop_in_a_SinglyLinkedList  
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
  
  
  //Display the linked list
  public void Display(){
  	if(head==null)
  	{
  		System.out.println("Linked list is empty");
  	}
  	else{
  		ListNode current=head;
  		while(current!=null){
  			System.out.print(current.data+"-->");
  			current=current.next;
  		}
  		System.out.print("null");
  	}
  }
  
  
  
  public boolean Todetectloop(){
	  ListNode fastPointer=head;
	  ListNode slowPointer=head;
	  while(fastPointer!=null && fastPointer.next!=null){
		  fastPointer=fastPointer.next.next;
		  slowPointer=slowPointer.next;
		  if(fastPointer==slowPointer){
			  return true;
		  }
		  
	  }
	  return false;
  }
  
  public void createaloopinlinkedlist(){
	  ListNode first =new ListNode(1);
	  ListNode second =new ListNode(2);
	  ListNode third =new ListNode(3);
	  ListNode four =new ListNode(4);
	  ListNode five =new ListNode(5);
	  ListNode six =new ListNode(6);
	  
	  head=first;
	  first.next=second;
	  second.next=third;
	  third.next=four;
	  four.next=five;
	  five.next=six;
	  six.next=third;
  }
  public static void main(String args[])
  {
	  To_Detect_a_loop_in_a_SinglyLinkedList sll = new To_Detect_a_loop_in_a_SinglyLinkedList();
	  sll.createaloopinlinkedlist();
	  System.out.println(sll.Todetectloop());
	  
  }
}

