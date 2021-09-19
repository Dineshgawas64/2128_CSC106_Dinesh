public class SelectionSort 
{
	
	// method to sort
	public void Sel_sort(int[] array)
	{
		for(int i =0; i <array.length;i++) 
		{
			int mid_index = i;
			for (int j = i + 1; j < array.length; j++)
			{
				if (array[j] < array[mid_index]){
					mid_index = j;//searching for lowest index  
 	             }  
    	    }
			
			int smallernum = array[mid_index];   
 	        array[mid_index] = array[i];  
 	        array[i] = smallernum; 
 	     }
		print(array);
     }
	
	// method to display
	public void print(int array[]) 
	{
		// array elements after performing selection sort
        System.out.println("\n \n2. Array after performing Selection sort");  
        for(int i=0; i < array.length; i++)  
                System.out.print(array[i] + " ");  
	}
}
