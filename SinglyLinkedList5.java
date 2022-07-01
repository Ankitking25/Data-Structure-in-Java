
public class SinglyLinkedList5   
{    
  private ListNode head;     
  private static class ListNode    
  {
	  private int data;             
	  private ListNode next;      
	  
	  public ListNode(int data)    
	  {     
		  this.data=data;     
		  this.next=null;     
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
	  SinglyLinkedList5 sll = new SinglyLinkedList5();
	  sll.head = new ListNode(10);
	  ListNode second = new ListNode(1);
	  ListNode third = new ListNode(7);
	  ListNode fourth = new ListNode(23);
	  
	  //Now we will connect them together to form a chain
	  sll.head.next=second;  //10-->1
	  second.next = third;   //10-->1--7-->
	  third.next = fourth;      //10-->1-->7--23-->null
	  
	  sll.display();
  }
}
