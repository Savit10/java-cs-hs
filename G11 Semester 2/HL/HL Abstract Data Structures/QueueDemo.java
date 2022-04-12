public class QueueDemo {
	
	public static void main (String[] args) {
		Queue newQueue = new Queue();
		newQueue.enqueue("H");
		System.out.println(newQueue.tail);
		newQueue.enqueue("e");
		System.out.println(newQueue.tail);
		newQueue.enqueue("l");
		System.out.println(newQueue.tail);
		newQueue.printQueue();
		newQueue.dequeue();
		Queue reverse = reverseQueue(newQueue);
		reverse.printQueue();
	}
		
}

