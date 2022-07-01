package Hashing;
//put method -> Put the value in the Hash table by key value  as separate chaining;
//Get_value_by_key method->Get the value by the help of key value as Minimum time complexity;
//Remove method->Remove the value by the help of key value.
public class HashTable 
{

    private HashNode[] buckets;
    private int numOfBuckets; // capacity
    private int size; // number of key value pairs in hash table or number of hash nodes in a HashTable

     public HashTable() 
    {  
      this(10); // default capacity
    }
     
    public HashTable(int capacity)
    {
      this.numOfBuckets = capacity;
      this.buckets = new HashNode[numOfBuckets];
      this.size = 0;
     }

   
     private class HashNode
    {
       private Integer key; // Can be generic type
       private String value; // Can be generic type
       private HashNode next; // reference to next HashNode
       public HashNode(Integer key, String value){
          this.key = key;
          this.value = value;
      }
     }

   
     public int size(){
        return size;}

     public boolean isEmpty()
      {
      return size == 0;
      }

    //Method to add the value in the Hash table by using the key value.
  public void put(Integer key, String value)
{
       if(key == null || value == null){
           throw new IllegalArgumentException("Key or Value is null:");
        }
   
     int bucketIndex = getBucketIndex(key);
     HashNode head = buckets[bucketIndex];
     while(head != null)
     {
           if(head.key.equals(key))
           {
               head.value = value;
               return;
           }
           head = head.next;
      }
     size++;
     head = buckets[bucketIndex];
     HashNode node = new HashNode(key, value); // (key, value) -> null
     node.next = head;
     buckets[bucketIndex] = node;
 }
   
 //Get value by key value
  public String Get_value_by_key(Integer key)
  {
	  if(key==null)  //if use int key the key no specific
	  {
		  throw new IllegalArgumentException("Key is null");
	  }
	  int bucketIndex=getBucketIndex(key);
	  HashNode head=buckets[bucketIndex];
	/*  if(head==null) { return null;  }*/ //This condition is already satisfic in the below code;
	  while(head!=null)
	  {
		  if(head.key.equals(key))
		  {
			  return head.value;
		  }
		  head=head.next;
	  }
	  return null;
  }
  
  //Remove the value by the key value.
  public String Remove(Integer key)
  {
	  int bucketIndex=getBucketIndex(key);
	  HashNode head = buckets[bucketIndex];
	  HashNode previous = null;
	  while(head!=null)   //While is like to Search an element in Linked->list;
	  {
		  if(head.key.equals(key))
		  {
			  break;
		  }
		  previous=head;   //that condition which is required to increase previous;
		  head=head.next;
	  }
	  if(head==null){   //if no element is added to given index then its head tends to null;
		 return null; 
	  }
	  size--;
	  if(previous!=null)
	  {
		  previous.next=head.next;
	  }
	  //When only first node 
	  else{
		  buckets[bucketIndex]=head.next;
	  }
	  return head.value;
  }
 
   private int getBucketIndex(Integer key){
       return key % numOfBuckets; // buckets.length;
  }
   //main method
  public static void main(String[] args)
  {
     HashTable table = new HashTable(10);
       table.put(105, "Tom");
       table.put(21, "Harry");
       //update size is 2;
       table.put(21, "Dinesh");
       //update size is 2;
       table.put(31,"Naveen");   //See of data hashing implementation by using Debug;
       //update size is 3;   
 
       System.out.println(table.size());
       
       //Get the value of string by the key 
       System.out.println(table.Get_value_by_key(21));
       System.out.println(table.Get_value_by_key(121)); //121 is not present in the given Hashtable;
       System.out.println(table.Get_value_by_key(31));
       
       //remove the value by key value;
      System.out.println(table.Remove(21));
      System.out.println(table.size());
      
      System.out.println(table.Remove(121)); //Jo chizz hai hi nahi usko remove karke null hi milega as in remove method condition.
  }
}

