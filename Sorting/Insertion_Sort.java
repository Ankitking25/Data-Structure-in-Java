package Sorting;
//Insertion Sort like a picking a card form a bag and then compair
//with the previous all card 
public class Insertion_Sort {

	public void Insertionsort(int[] arr,int n){
		for(int i=1;i<n;i++)
		{
			int temp=arr[i];
			int j=i-1;
			while(j>=0&&arr[j]>temp)
			{
				arr[j+1]=arr[j];
				j=j-1;
			}
			arr[j+1]=temp;
		}
	}
	
	public void printArray(int[] arr){
		int n=arr.length;
		for(int i=0;i<n;i++)
		{
			System.out.print(arr[i]+" ,");
		}
		System.out.print("");
	}

	public static void main(String args[])
	{
		int arr[] = new int[]{12,23,12,23,3432,1212,32,1};
		Insertion_Sort obj = new Insertion_Sort();
		obj.printArray(arr);
		obj.Insertionsort(arr,arr.length);
		System.out.print("\n");
		obj.printArray(arr);
	}
}
