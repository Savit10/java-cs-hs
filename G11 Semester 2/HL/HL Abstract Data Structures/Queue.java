public class Queue {
	NodeString head;
	NodeString tail;
	public boolean isEmptyy()
	{
		return head == null;
	}
	public void enqueue(String n)
	{
		NodeString newNode = new NodeString(); // create a node to endqueue
		newNode.data = n;  // place the data in the new node
		if( isEmptyy() )
		{
			head = newNode;
			tail = newNode;
		} 
		else
		{
			tail.next = newNode;
			tail = newNode;
			
		}
	}
	public String dequeue()
	{
		if( !isEmptyy() )
		{	String n = head.data;
			head = head.next;
			return n;
		}
		return null;
	} 
	public void printQueue()
	{
		if(this.isEmptyy())
		{
			System.out.println("Queue is empty");
			return;
		}
		NodeString temp = head;
		System.out.print("Head--> ");
		while (temp != null)
		{
			System.out.print(temp.data);
			System.out.print(", ");
			temp = temp.next;
		}	
		System.out.println("<--Tail");
	}
	public Stack reverseQueue(Queue x)
	{
		while (!x.isEmptyy())
		{
			String y = x.dequeue();
			reverse.push(y);
		}
		return reverse;
	}
}

