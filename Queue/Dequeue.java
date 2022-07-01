package Queue;
import java.util.*;
//Enqueue and Deque in java
public class Dequeue {  //main class name Dequeue
	
	public Dequeue(){
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
		System.out.println("null");
	}
	
	//return length of a Queue
	public int length(){
		return length;
	}
	
	//return Boolean 
	public boolean isEmpty(){
		return length==0;      //if length=0 the return is true otherwise false
	}
	
	//Enque method
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
	
	//Dequeue method
	public int Dequeue(){
		if(isEmpty()){
			throw new NoSuchElementException("Queue is already empty");
		}
		int result = front.data;
		front = front.next;
		if(front==null){
			rear=null;
		}
		length--;
		return result;
	}
	
   public static void main(String args[])
   {
   Dequeue obj = new Dequeue();
   
   //enqueue happen form rear side
   obj.enqueue(20);
   obj.enqueue(30);
   obj.enqueue(40);
   obj.Display();
   
   //Dequeue happen from front side
   obj.Dequeue();
   obj.Display();
   
   
   }
}
