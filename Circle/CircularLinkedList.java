//Creation,Traversing,add_begin,add_end,remove first node.
package Circle;
import java.util.*;
//creation
public class CircularLinkedList
{
	 private ListNode last;
	 private int length;
	
	    private class ListNode
	{
		  private ListNode next;
		  private int data;
		
		  public ListNode(int data) //constructor for ListNode
		 {
			this.data=data;
		 }
	}
	
	public CircularLinkedList()  //constructor for CircularLinkedlist
	{
		last=null;
		length=0;
	}
	public int length()
	{
		return length;
	}
	
	public boolean IsEmpty()
	{
		return length==0;
	}
	//Create circular singly linked list
	public void CreateCircularLinkedList()
	{
		ListNode first = new ListNode(1);
		ListNode second = new ListNode(4);
		ListNode third = new ListNode(32);
		ListNode fourth = new ListNode(2332);
		
		
		first.next=second;
		second.next=third;
		third.next=fourth;
		fourth.next=first; //Make it Circular singly Linked list
		
		last=fourth;  //assign fourth to last variable which you make at start
		
	}
	
	//Traverse and print circular linked list
	//If circular Linked List is empty
    public  void Display(){
    	if(last==null)
    	{
    		return;
    	}
    	ListNode first=last.next;
    	while(first!=last)
    	{
    		System.out.print(first.data+"-->");
    		first=first.next;
    	}
    	System.out.print(first.data+"");
    }
    
    //Add_node at the start of the Circular Linked list
    public void At_beginCCL(int data)
    {
    	ListNode new_node = new ListNode(data);
    	if(last==null)
    	{
    		last=new_node;
    	}
    	else
    	{
    		new_node.next=last.next;  //remember that here last.next assign the firstnode address
    	}
    	last.next=new_node;  //here change new_node name as last.next means first
    	length++; //Increase length by one 
    }
    
  // Second method for At_Begin in Singly circular Linked list
     public void Insertion_at_begin(int data)
    {
   	 ListNode new_node = new ListNode(data);
   	 ListNode first=last.next;  //here assign last.next as first one as pointer address
   	 if(last==null)                       
   	 {
   		 last=new_node;
   	 }
   	 else
   	 {
   		 new_node.next=first; //when a Linked list is make
   		first=new_node;
   	 }
   	 last.next=first;
   	 
    }
    
    //add The node at the end of the Circular linked list
    public void At_EndCCL(int data)
    {
       ListNode new_node = new ListNode(data);
       if(last==null)
       {
    	   last=new_node;
    	   last.next=last;
       }
       else
       {
    	   new_node.next=last.next;    //last.next assign to first mean first=new_node.next
    	   last.next=new_node;
    	   last=new_node;
       }
       length++;
    }
    
    //How to remove first Node from a Circular Singly Linked List
    public ListNode RemoveFirst()
    {
    	if(IsEmpty())
    	{
    		throw new NoSuchElementException("Circular Singly Linked list is already empty");	
    	}
    	ListNode temp=last.next;
    	if(last.next==last)
    	{
    		last=null;
    	}
    	else
    	{
    		last.next=temp.next;
    	}
    	temp.next=null;
    	length--;
    	return temp;
    }
    
 /* why output not get proper 
    public ListNode Deletion_at_end()
    {
    	ListNode current=last;
    	ListNode previous=null;
    	if(last==null)
    	{
    		System.out.println("The Linked list is empty");
    		return null;
    	}
    	if(current.next==current)
    	{
    		last=null;
    		return null;
    	}
    	while(current.next!=last)
    	{
    		previous=current;
    		current=current.next;
    	}
    	previous.next=current.next;
        last=previous.next;
        
        return last;
    }
    */
 
public static void main(String args[])
{
	CircularLinkedList obj = new CircularLinkedList();
	obj.CreateCircularLinkedList();
	   //Initial 1-->4-->32-->2332
	obj.At_beginCCL(45);
	   //then 25-->1-->4-->2332
	obj.At_beginCCL(67);
	   //then 67-->25-->1-->4-->2332
	obj.At_EndCCL(76);
	   //then 67-->25-->1-->4-->2332--->76
	obj.Insertion_at_begin(55);  //Second method for At_begin
	   //then 55-->67-->25-->1-->4-->2332-->76
	obj.RemoveFirst();
       //the 67-->25-->1-->4-->2332-->76
	//obj.Deletion_at_end();
	obj.Display();
}
}
