public class Sort_main {
		public static void main(String[] args)
		{
	        int array[] = {89,42,10,56,75,91,30,40,22,3,7,96,2,48,61,55,0};
			
			// array elements before sorting
	        System.out.println("Array before performing sorting techniques");  
	        for(int i=0; i < array.length; i++) 
	                System.out.print(array[i] + " ");  
	        
	        
			// creating the objects
			BubbleSort bs = new BubbleSort();        // object for bubble sort
	       SelectionSort ss = new SelectionSort();  // object for selection sort
	       InsertionSort is = new InsertionSort();  // object for insertion sort
	        
	        // method call
	 		bs.sort(array);
	 		ss.Sel_sort(array);
	 		is.ins_sort(array);
			
		}
}
