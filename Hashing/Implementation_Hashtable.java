package Hashing;
//Implementation of Hashtable in which a HashNode is created;

//Making of Hashtable
public class Implementation_Hashtable
{
  private HashNode[] buckets;
  private int numOfBuckets;  //number of buckets in a Hash table;
  private int size;   //Number of hashnode in a hashtable
  
  public Implementation_Hashtable(int capacity)
  {
	this.numOfBuckets = capacity;
	this.buckets = new HashNode[numOfBuckets];
	this.size=0;
  }
	
  public Implementation_Hashtable()
  {
	  this(10); //Default capacity;
  }
  
 
  //Making of HashNode
  public class HashNode
  {
	  private Integer key; //can be generic type; 
	  private String value;  //we also say as it is data;
	  private HashNode next;
	  
	  public HashNode(Integer key,String value)
	  {
		  this.key=key;
		  this.value=value;
	  }
  }
  public int size()
  {
	  return size;
  }
  public boolean isEmpty()
  {
	  return size==0;
  }
  
  //Main method
  public static void main(String args[])
  {
	  Implementation_Hashtable obj = new Implementation_Hashtable(10);
	 
  }
}
