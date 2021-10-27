import com.Dinesh.csc106.ex12.Queue;

public class Clientapp {



		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Queue obj = new Queue();
			obj.enqueue("a");
			obj.enqueue("b");
			obj.enqueue("c");
			obj.enqueue("d");
			obj.dequeue();
			obj.peek();
			obj.display();
			System.out.println(obj);
		}

}
