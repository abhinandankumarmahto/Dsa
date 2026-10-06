package dsa;

public class BinSearch 
{
	private static int binSearch(int[] arr,int target)
	{	
		int low=arr[0];
		int high=arr[arr.length-1];
		
		while(low<=high) {
			int mid=(low+high)/2;
			System.out.println("mid "+mid);
			if(target==low) return low;
			if(target==high) return high;
			if(target<mid) high=mid-1;
			if(target>mid) low=mid+1;
			else return mid;
			
			
			
		}
		
		return -1;
	}
	public static void main(String[] args) 
	{
		int arr[]=new int [100];
		
		for (int i=0;i<arr.length;i++) 
		{
			arr[i]=i;
		}
		System.out.println(binSearch(arr, 23));
		
		
	}
	
}
