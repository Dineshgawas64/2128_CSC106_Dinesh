public class BubbleSort 
{
	public void sort(int array[]) 
	{
		 int n = array.length;  
	        int temp = 0;  
	         for(int i=0; i < n; i++)
	         {  
	            for(int j=1; j < (n-i); j++)
	            {  
	                if(array[j-1] > array[j])  //swap elements
	                {  
	                   temp = array[j-1];   
	                   array[j-1] = array[j];  
	                   array[j] = temp;  
	                }             
	            }  
	        }
	     print(array);
	} 
	
	
	public void print(int array[]) 
	{
		// array elements after performing bubble sort
        System.out.println("\n \n1. Array after performing Bubble Sort");  
        for(int i=0; i < array.length; i++)  
                System.out.print(array[i] + " ");  
	}
}

