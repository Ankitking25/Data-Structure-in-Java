//To find the middle of a  Linkedlist 
//two case even node of node or odd node;

public class Findmiddlelistnode  //Save file name same as class name here SinglyLinkedList
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
  
  //How we find the middle of a linked List;
  public ListNode GetMiddleNOde(){
	  if(head==null){
		  return null;
	  }
	  ListNode slowpointer = head;
	  ListNode fastpointer = head;
	  while(fastpointer!=null && fastpointer.next!=null){
		  slowpointer=slowpointer.next;
		  fastpointer=fastpointer.next.next;
	  }
	  return slowpointer;
  }
  
  public static void main(String args[])
  {
	  Findmiddlelistnode sll = new Findmiddlelistnode();
	  sll.head = new ListNode(10);
	  ListNode second = new ListNode(1);
	  ListNode third = new ListNode(7);
	  ListNode fourth = new ListNode(23);
	  ListNode five = new ListNode(2);
	  
	  //Now we will connect them together to form a chain
	  sll.head.next=second;  //10-->1
	  second.next = third;   //10-->1--7-->
	  third.next = fourth;      //10-->1-->7--23-->null
	  fourth.next=five;
	  five.next=null;
	  
	  ListNode MiddleNode = sll.GetMiddleNOde();
	  System.out.println("Middle is = "+MiddleNode.data); //If even let 4 then mid is 3th,if odd let 7 mid is 4th position:
	  sll.display();
  }
}
