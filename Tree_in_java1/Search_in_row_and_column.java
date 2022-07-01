package Tree_in_java1; //part-108
//Problem-->Given a row and column wise(n*n) sorted matrix 
//Write a program to search key in a given matrix is found or not
public class Search_in_row_and_column {
  public void Search(int matrix[][],int n ,int x)
  {
	  int i=0;
	  int j=n-1;
	  while(i<n&&j>=0){
		  if(matrix[i][j]==x)
		  {
			  System.out.print("Found at "+i+","+j);
			  return;
		  }
		  if(matrix[i][j]>x)
		  {
			  j--;
		  }
		  else{
			  i++;
		  }
	  }
	  System.out.print("\nValue not found");
  }
  public static void  main(String args[])
  {
	  int matrix[][]={
			  {10,20,30,40},
			  {15,25,35,45},
			  {27,29,37,48},
			  {32,33,39,51}
	  };
	  Search_in_row_and_column obj = new Search_in_row_and_column();
	  obj.Search(matrix,matrix.length,32);
	  obj.Search(matrix, matrix.length, 120);
  }
}
