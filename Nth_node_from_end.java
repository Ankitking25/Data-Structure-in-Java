
//To Find the Nth_node_form_end in singlyLinked list

public class Nth_node_from_end {
public ListNode head;
public static class ListNode{
	private int data;
	private ListNode next;
	
	public ListNode(int data){
		this.data=data;
		this.next=null;
	}
}

    public ListNode getNthfromend(int n){
	if(head==null){
		return null;
	}
	if(n<=0)
	{
		throw new IllegalArgumentException("Invalid value n = "+n);
		
	}
	ListNode mainPointer=head;
	ListNode refPointer=head;
	int count=0;
	while(count<n){
		if(refPointer==null){   //If 3 node and n=3 also
			throw new IllegalArgumentException(n+"is greater than the or equal to node in a linkedlist");
		}
		refPointer=refPointer.next;
		count++;
	}
	while(refPointer!=null){
		refPointer=refPointer.next;
		mainPointer=mainPointer.next;
		
	}
	return mainPointer;
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
    
   
   

  public static void main(String agrs[]){
	  Nth_node_from_end sll = new Nth_node_from_end();
	  sll.head = new ListNode(25);
	  ListNode second = new ListNode(23);
	  ListNode third = new ListNode(4345);
	  ListNode fourth = new ListNode(854);
	  
	  //connect the ListNOde
	  sll.head.next=second;
	  second.next=third;;
	  third.next=fourth;
	  fourth.next=null;
	  

	
	 sll.Display();
	 System.out.println("");
	 ListNode nthNodeformend = sll.getNthfromend(2);
	 System.out.print("The Nth node form end is +"+nthNodeformend.data);
	
	  
	  
	  
	  
	  //To find the Nth index Node data from end;
	 
  }
}
