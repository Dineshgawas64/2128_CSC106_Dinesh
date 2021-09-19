public class InsertionSort 
{
	public void ins_sort(int[] arr) 
	{
		for (int i = 1; i < arr.length; i++)
	   	{  
	             int key = arr[i];  
	             int j = i-1;  
	             while ( (j > -1) && ( arr [j] > key ) ) {  
	                 arr[j+1] = arr[j];  
	                 j--;  
	             }  
	             arr[j+1] = key;  
	     }
		print(arr);
	}
	
	
	// method to display
		public void print(int array[]) 
		{
			// array elements after performing insertion sort
	        System.out.println("\n \n3. Array after performing Insertion sort");  
	        for(int i=0; i < array.length; i++)  
	                System.out.print(array[i] + " ");  
		}

}

