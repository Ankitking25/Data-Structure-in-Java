//HOw to find start of a loop in a singlyLinkedList
//By the Floyd's algorithm

public class find_start_of_a_loop {
private ListNode head;
private static class ListNode{
	private int data;
	private ListNode next;
	public ListNode(int data){
		this.data=data;
		this.next=null;
	}
	
}

public void Display()
{  
	ListNode current = head;
	while(current!=null){
		System.out.print(current.data+"-->");
		current=current.next;
	}
	System.out.print("null");
}

//To Check a Loop is in Linked List or Not
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

//Find the start of the Loop by the floyd's algorithm
public ListNode StartNodeInLoop()
{
	  ListNode fastPointer=head;
	  ListNode slowPointer=head;
	  while(fastPointer!=null && fastPointer.next!=null)
	  {
		  fastPointer=fastPointer.next.next;
		  slowPointer=slowPointer.next;
		  if(fastPointer==slowPointer)
		  {
			  return getStartingNode(slowPointer);
		  }
		  
	  }
	  return null;
}

  private ListNode getStartingNode(ListNode slowPointer){
	  ListNode temp=head;
	  while(temp!=slowPointer){
		  temp=temp.next;
		  slowPointer=slowPointer.next;
	  }
	  return temp;
  }

  //here we make the loop at the position of 3 
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
	  six.next=third;   //make the loop at three
}

public static void main(String args[]){
	find_start_of_a_loop obj = new find_start_of_a_loop();
	obj.createaloopinlinkedlist();
	System.out.print(obj.Todetectloop()+" ");
	System.out.println(obj.StartNodeInLoop().data);
}
}
