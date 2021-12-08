import com.Dinesh.csc106.ex12.Queue;

public class Clientapp {



		public static void main(String[] args) {
			// TODO Auto-generated method stub
		Queue q = new Queue();
		
		q.enqueue("a");
		q.enqueue("b");
		q.enqueue("c");
		
		System.out.println(q.getQueuelist());
		
		q.dequeue();
		
		System.out.println(q.getQueuelist());
		
		
			
		System.out.print("first element - ");  
		q.peek();
		
	//	System.out.print("number of elements - ");  
	//	q.count();
			
		}			

}
