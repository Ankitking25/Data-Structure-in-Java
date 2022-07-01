package Queue;

//Enqueue in java
public class Queue1 {
	
	public Queue1(){
		this.front = null;
		this.rear = null;
		this.length =0;
	}
	
	private ListNode front;
	private ListNode rear;
	private int length;
	
	private class ListNode{
		private int data;
		private ListNode next;
		
	public ListNode(int data){
		this.data=data;
		this.next=null;
	}
	}
	
	public void Display(){
		if(isEmpty()){
			return;
		}
		ListNode current = front;
		while(current!=null){
			System.out.print(current.data+"-->");
			current=current.next;
		}
		System.out.print("null");
	}
	
	//return length of a Queue
	public int length(){
		return length;
	}
	
	//return Boolean 
	public boolean isEmpty(){
		return length==0;      //if length=0 the return is true otherwise false
	}
	
	public void enqueue(int data){
		ListNode temp = new ListNode(data);   //replace temp by new_node for easy purpose
		if(isEmpty()){
			front=temp;
		}
		else{
			rear.next=temp;
		}
		rear=temp;
		length++;
		
	}
	
   public static void main(String args[])
   {
   Queue1 obj = new Queue1();
   
   obj.enqueue(20);
   obj.enqueue(30);
   obj.enqueue(40);
   obj.Display();
   
   }
}
