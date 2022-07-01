
public class Searchingoflinkedlist {
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
	   }
   }

   //Searching of Linked list in java
   public boolean Search_node(int searchkey){
	   if(head==null){
		   return false;
	   }
	   ListNode current=head;
	   while(current!=null){
		   if(current.data==searchkey){
			   return true;
		   }
		   current=current.next;
	   }
	   return false;
   }
   
   
 // Logic is correct but not applied in java why;
  /*  public void Search_node2(int value){
	   ListNode current=head;
	   while(current!=head){
		   if(current.data==value){
			   System.out.println("The Node is Present is given Linked List");
			
		   }
		   current=current.next;
		   
	   }
	   System.out.print("The Node is not present");
   }*/
   
public static void main(String args[]){
	Searchingoflinkedlist obj = new Searchingoflinkedlist();
	obj.head = new ListNode(2);
	ListNode second =new ListNode(4);
	ListNode third =new ListNode(8);
	ListNode fourth = new ListNode(99);
	
	//connecting of node;
	obj.head.next =second;
	second.next = third;
	third.next=fourth;
	fourth.next=null;
	
	//Search Node
	if(obj.Search_node(99)){
		System.out.println("Search key found");
		System.out.println(obj.Search_node(99));  //print in boolean type
	}
	else{
		System.out.println("Search key is not found");
	}
	//obj.Search_node(8);
	//calling of display function
	obj.Display();
}
}
