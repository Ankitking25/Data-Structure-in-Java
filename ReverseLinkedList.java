//Reverse a Singly Linked list

public class ReverseLinkedList {
private ListNode head;
private static class ListNode {
	private int data;
	private ListNode next;
	public ListNode(int data){
		this.data=data;
		this.next=null;
	}
}
  //Display the Linked list
   public void Display(){
	   if(head==null){
		   System.out.print("Linked List is empty");
		 
	   }
	   else{
		   ListNode current=head;
		   while(current!=null){
			   System.out.print(current.data+"-->");
			   current=current.next;
		   }
		   System.out.println("null");
	   }
   }
   
   //Reverse the Linked List
   public ListNode reverse(ListNode head){
	   if(head==null){
		   return head;
	   }
	   ListNode current=head;
	   ListNode previous=null;
	   ListNode temp=null;
	   while(current!=null){
		   temp=current.next;
		   current.next=previous;
		   previous=current;
		   current=temp;
	   }
	   return previous;
   }


   
public static void main(String args[]){
	ReverseLinkedList obj = new ReverseLinkedList();
	obj.head = new ListNode(2);
	ListNode second =new ListNode(4);
	ListNode third =new ListNode(8);
	ListNode fourth = new ListNode(99);
	
	//connecting of node;
	obj.head.next =second;
	second.next = third;
	third.next=fourth;
	fourth.next=null;
	
	
	
   // ListNode reverse_my_List = obj.reverse(head);
   // System.out.println("value is = "+reverse_my_List.data);
    
    obj.Display();
}
}

