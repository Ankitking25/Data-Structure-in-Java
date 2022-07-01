

public class SinglyLinkedList3 {
public ListNode head;
public static class ListNode{
	private int data;
	private ListNode next;
	
	public ListNode(int data){
		this.data=data;
		this.next=null;
		
	}
}
    //Question Insert a node in a singly linkedList at a given position
     public void Insert_by_index(int value,int Position){
    	 ListNode new_node = new ListNode(23);
    	 if(Position==1){
    		 new_node=head;
    		 head=new_node;
    	 }
    	 else{
    		 
    	 }
     }
     
    


   //Display ListNode 
    public void Display(){
    	if(head==null){
    		System.out.println("There is not any linkedlist ");
    		return;
    	}
    	ListNode current=head;
    	while(current!=head){
    		System.out.print(current.data+"-->");
    		current=current.next;
    	}
    }
    
    //Insert at begin
    public void Insert_begin(int value){
    ListNode  new_node = new ListNode(23);
    new_node.next=head;
    head=new_node;
    }
    
public static void main(String args[])
{
	SinglyLinkedList3 obj= new SinglyLinkedList3();
	obj.head  = new ListNode(10);
	ListNode second =  new ListNode(23);
	ListNode third = new ListNode(233);
	ListNode fourth = new ListNode(34);
	
	
	//join the linked list to each other and make it Linear
	obj.head.next=second;
	second.next=third;
	third.next=fourth;
	fourth.next=null;
	
	obj.Insert_begin(12);
	obj.Insert_begin(32);
	//Display the linked list node
	//Basically call the Display method
	obj.Display();
}
}
