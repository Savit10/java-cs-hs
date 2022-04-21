/*
 * LinkedList.java
 * 
 * 
 */


public class LinkedList
{
	NodeString start;
	
	// this method creates an empty linked list
	public LinkedList() { }
	
	// this method creates a list
	// with its initial element
	public LinkedList(String data)
	{
		NodeString newNode = new NodeString(data);
		newNode.next = null;
		start = newNode;
	}
	
	public boolean isEmpty()
	{
		return start == null;
	}
	
	public void append(String data)
	{
		NodeString newNode = new NodeString(data);
		newNode.next = null;
		if( isEmpty() )
		{	
			start = newNode;
		} else {
			NodeString temp = start;
			while( temp.hasNext() ) // temp.next != null
			{	temp = temp.next;
			}
			temp.next = newNode;
		}
	}
	
	public void printList()
	{
		if( isEmpty() )
		{	System.out.println("List empty");
			return;
		}
		NodeString temp = start;
		System.out.print("Start -> ");
		while( temp != null )
		{
			System.out.print( temp.data + " <- ");
			temp = temp.next;
		}
		System.out.println( " NULL ");
	}
	public void deleteLast()
	{
		if( isEmpty() )
		{	System.out.println("List empty");
			return;
		}
		NodeString temp = start;
		while ((temp.next).hasNext())
		{
			temp = temp.next;
		}
		temp.next = null;
	}
	public void insert(int index, String data)
	{
		NodeString newNode = new NodeString(data);
		NodeString temp = start;
		if (index == 0)
		{
			newNode.next = start;
			start = newNode;
		}
		else
		{	
			for (int i = 0; i < index -1; i++)
			// can do with while (temp.hasNext() && i < index -1) and increment i inside loop
			{
				if (temp.hasNext())
				{
					temp = temp.next;
				}
			}
			newNode.next = temp.next;
			temp.next = newNode;
		}
	}
	public void delete(String data) // method is deleting element after the element wanted to get deleted
	{
		NodeString temp = start;
		NodeString newNode = new NodeString(data);
		if (data.equalsIgnoreCase(start.data))
		{
			start = start.next;
		}
		else
		{
			while (temp != null && (temp.next.data != newNode.data))
			{
				temp = temp.next;
			}
			if (temp.next.data.equals(newNode.data))
			{
				temp.next = (temp.next).next;
			}
		}
	}	
				
	/* Homework for next lesson:
	 * add a delete() method
	 * add to the main method a test deleting 6 strings,
	 * including one not in the list, and
	 * print the list each time you add a string to it
	 */
	
}

