

public class SinglyLinkedList2 {
private ListNode head;
private static class ListNode
{
	private int data;
	private ListNode next;
	
	public ListNode(int data){
	this.data=data;
	this.next=null; 
	}
} 
   //Display the LinkedList
   public void Display(){
	   ListNode current=head;
	   while(current!=null){
		   System.out.print(current.data+"-->");
		   current=current.next;
	   }
   }
   
   //Insertion a new_node at the beginning of the singleLinkedlist
   public void Insertion_begin(int value){
	   ListNode new_node  = new ListNode(value);
	   new_node.next=head;
	   head=new_node;
   }
   
   //Delete by index value:
   public void Delete_by_index(int position)
   {
   	if(position==1)
   	{
   		head=head.next;
   	}
   	else
   	{
   		ListNode prev=head;
   		int count=1;
   		while(count<position-1)  //count one less then real position
   		{
   			prev=prev.next;   //prev Go  upto position-1
   			count=count+1;
   		}
   		ListNode current=prev.next;  //Here current=prev.next--> and current counter to the position value
   		prev.next=current.next;

   	}
   }
     
   
   public void Insert_node_at_end(int value)
   {
	   ListNode new_node = new ListNode(value);
	   if(head==null){
		   head=new_node;
		   return;
	   }
	   ListNode current = head;
	   while(null!=current.next)
	   {
		   current=current.next;
	   }
	   current.next=new_node;
	   new_node.next=null;
   }
   
   
   
  public static void main(String args[])
  {
	  SinglyLinkedList2 obj = new SinglyLinkedList2();
/*	  obj.head  = new ListNode(10);
	  ListNode second = new ListNode(22);
	  ListNode third = new ListNode(23);
	  ListNode four = new ListNode(24);
	  
  
  
  //connect List to each other
     obj.head.next=second;
     second.next=third;
     third.next=four;  */
     
     
     //print the linked list item
   //  obj.Insertion_begin(3);
    // obj.Insertion_begin(49);
     
     //Insert_node_at_end in SinglyLinkedList
     obj.Insert_node_at_end(20);
     obj.Insert_node_at_end(30);
     obj.Insert_node_at_end(50);
     
     obj.Delete_by_index(3);
     
     //20-->30-->50-->
     
     //Display the Link_list value
     obj.Display();
}
}
