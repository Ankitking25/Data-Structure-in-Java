package Trie;
//Making of Trie , Insert a word(node) in Trie,or Seach word present in Trie or not
public class Trie {
    private TrieNode root;
    public Trie(){
    	root = new TrieNode();  //root is empty
    }
    
    private class TrieNode
    {
    	private TrieNode[] children;
    	private boolean isword;
    	
    	public TrieNode()
    	{
    		this.children = new TrieNode[26]; //store English word a to z;
    		this.isword = false;
    	}
    }
    public void insert(String word)
    {
    	if(word==null||word.isEmpty()){
    		throw new IllegalArgumentException("Invalid input");
    	}
    	word=word.toLowerCase();
    	TrieNode current=root;
    	for(int i=0;i<word.length();i++)
    	{
    		char c=word.charAt(i);
    		int index=c-'a';
    		if(current.children[index]==null)
    		{
    			TrieNode new_node = new TrieNode();
    			current.children[index]=new_node;
    			current=new_node;
    		}
    		else{
    			current=current.children[index];
    		}
    	}
        current.isword=true;  //isword is boolean value to check the your insert word in insert or not;
    }
    
    public boolean search(String word)
    {
       TrieNode current=root;
       for (int i = 0;i<word.length();i++)
       {
           char c=word.charAt(i);
           int index=c-'a';
           if (current.children[index] == null){  //current basically the node of the abcd(alphabetical)
               return false;
           }
           else{
           current = current.children[index];
           }
       }
       return current.isword;  
    }
    
    //

    // Returns true if root has no children, else false
    private boolean isEmpty(String word)
    {
    	TrieNode current=root;
        for (int i = 0; i<word.length(); i++)
            if (current.children[i] != null)
                return false;
        return true;
    }
 
   public void delete(String s){
	   TrieNode current=root;
	   for(int i=0;i<s.length();i++)
	   {
		   if(current==null){
			   throw new RuntimeException("String does not exits");
		   }
		   int index=s.charAt(i);
		   current=current.children[index];
	   }
	 
	    
   }
  
        
    public static void main(String args[])
    {
    	Trie obj = new Trie();
    	obj.insert("Cat");  //uperCase does not matter we use index=current - 'a' so lowercase-lowercase;
    	//Or we change as Upper-Upper just make all word as upper case;
    	obj.insert("cab");
    	obj.insert("Son");
    	obj.insert("so");
    	System.out.print("Value insert successfully");
    	//Searching a word
    	boolean a=obj.search("cab");
    	System.out.print("\nWord cab is present true / false : "+a); //true
    	boolean b=obj.search("cabe");
    	System.out.print("\nWord cabe is present true / false : "+b);  //false
    	boolean c=obj.search("ca");
    	System.out.println("\nWord ca is present true / false : "+c);  //false
    	obj.delete("cab");
    	
    }
}
