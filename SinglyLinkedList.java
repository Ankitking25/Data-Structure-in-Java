//Representation of a SinglyLinkedList
public class SinglyLinkedList   //Save file name same as class name here SinglyLinkedList
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
  
  
  //Insertion a new_node at the beginning of the singleLinkedlist
  public void Insertion_begin(int value)
  {
	   ListNode new_node  = new ListNode(value);
	   new_node.next=head;
	   head=new_node;
   }
  
    
  //Insert a new_node at the end of linked list
  public void Insert_node_at_end(int value)
   {
	   ListNode new_node = new ListNode(value);
	   if(head==null)
	   {
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
  
  
  //Insert the node at any index provide in position variable
  public void Insert_by_index(int value,int position)
  {
	  ListNode new_node = new ListNode(value);
	  if(position==1)
	  {
		  new_node.next=head;
		  head=new_node;
	  }
	  else
	  {
		  ListNode previous = head;
		  int count=1;   //position -1 
		  while(count<position-1)
		    {
			    previous = previous.next;
			    count=count+1;
		    }
		        ListNode current = previous.next;
		        previous.next=new_node;
		        new_node.next=current;
		  
		  
	    }
   }
  
  
  
  //Delete node from start in linked list
  public void delete_First()
   {
  	if(head==null)
     	{
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
  
  //BOTH ARE FOR DELETE LAST NODE, LOGIC IS SAME
  //CASE1
  public ListNode delete_last(){
	  if(head==null||head.next==null)
	  {
		  return head;   //If we go back to function call by return of making of ListNode in class is necessary:
	  }
	  else{
		  ListNode current=head;
		  ListNode previous=null;
		  while(current.next!=null){
			  previous=current;
			  current=current.next;
		  }
		  previous.next=null;
		  return current;  //return current value
		
	  }
  }   
  //CASE2
  /* public void delete_last(){
	   if(head==null||head.next==null)
	   {
		   System.out.print("I do not ");
	   }
	   else{
		   ListNode current=head;
		   ListNode previous=null;
		   while(current.next!=null)
		   {
			   previous=current;
			   current=current.next;
		   }
		   previous.next=null;
		  	   
	   }
   }*/
  
  //Method to find the length of the LinkedList 
  public int Length()
  {
	    if(head==null)
	    {
		   return 0;
	    }
	    int count=0;
	    ListNode current =head;
	    while(current!=null)
	    {
		     count++;
		     current=current.next;
	    }
	    return count;
   }
  
  public static void main(String args[])
  {
	  SinglyLinkedList sll = new SinglyLinkedList();
	  sll.head = new ListNode(10);
	  ListNode second = new ListNode(1);
	  ListNode third = new ListNode(7);
	  ListNode fourth = new ListNode(23);
	  
	  //Now we will connect them together to form a chain
	  sll.head.next=second;  //10-->1
	  second.next = third;   //10-->1--7-->
	  third.next = fourth;      //10-->1-->7--23-->null
	 
	  //Insertion at begin
	  sll.Insertion_begin(9);
	  
	  //Insert Node at end of a linked list
	  sll.Insert_node_at_end(11);
	  
	  
	  //Insert at any position at any index by value given in position variable
	  sll.Insert_by_index(55,1);
	  sll.Insert_by_index(23,2);
	   
	  
	  //Delete first node of a Linked List
	  sll.delete_First();
	  
	  //delete last node of Linked List
	   sll.delete_last();
	  

	  //display call
	  sll.display();
	  System.out.println("");
	  System.out.println("Length is = "+sll.Length());
  }
}  
