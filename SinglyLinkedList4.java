
public class SinglyLinkedList4 {
private ListNode head;
public static class ListNode {
	private int data;
	private ListNode next;
	
	public ListNode(int data){
		this.data=data;
		this.next=null;
	}
}
 
    //Display the linked list
    public void Display(){
    	if(head==null){
    		System.out.println("Linked list empty");
    		return;
    	}
    	ListNode current = head;
    	while(current!=null){
    		System.out.print(current.data+"-->");
    		current=current.next;
    	}
    }
    
    //Insert at any value
    public void Index_value(int value,int position){
    	ListNode new_node= new ListNode(value);
    	if(position==1){
    		new_node.next=head;
    		head=new_node;
    	}
    	else{
    		int count=1;
    		ListNode current=head;
    		while(count<position-1){
    			current=current.next;
    			count=count+1;
    		}
    		ListNode prev=current.next;
    		current.next=new_node;
    		new_node.next=prev;
    		
    		
    	}
    }
    
    //Insert at begin
    public void Insert_at_begin(int value)
    {
    	ListNode new_node = new ListNode(value);
    	new_node.next=head;
    	head=new_node;
    }
    
    //Delete node from start
    public void deleteFirst(){
    	if(head==null){
    		System.out.println("Linked listn is not present");
    		return;
    	}
    	else
    	{
    		ListNode temp=head;
    		head=temp.next;
    		 
    		//BOTH ARE CORRECT
    		
    		/*ListNode temp=head;
    		 * head=head.next;
    		 * temp.next=null;
    		 */
    		
    	}
    }
    
    //Delete NOde form last of a SinglyLinkedlist
    public ListNode delete_last(){
    	if(head==null||head.next==null){
    		return head;    //simply return the value for delete the head;
    	}
    	ListNode current=head;
    	ListNode previous=null;
    	while(current.next!=null){
    		previous=current;
    		current=current.next;
    	}
    	previous.next=null;
    	return current;
    	
    }
    
 /*Question->Implement method to delete a node at a given position.
  Assuming position to be valid and starting from 1. 
  */
    //-->Delete any value by index overall

public static void main(String args[]){
	SinglyLinkedList4 obj = new SinglyLinkedList4();
	obj.head = new ListNode(23);
	ListNode second= new ListNode(234);
	ListNode third = new ListNode(2334);
	ListNode fourth = new ListNode(23);
	
	//connecting the node
	obj.head.next=second;
	second.next=third;
	third.next=fourth;
	fourth.next=null;
	
	obj.Insert_at_begin(30);
	
	
	
	
	obj.Index_value(1111,2);
	
	obj.deleteFirst();
	obj.Display();
	
	//Delete by index
	
	obj.delete_last();
	//System.out.println(obj.delete_last().data);
	obj.Display();
}
}
