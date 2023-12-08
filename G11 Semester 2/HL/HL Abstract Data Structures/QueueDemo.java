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
		Stack reverse = reverseQueue(newQueue);
		reverse.printQueue();
	}
		
}

