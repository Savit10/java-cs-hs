public class NodeChar {
	char data;
	NodeChar next; //self-referential data structure, or basically just a reference variable that is null in default but if you make a new node and define the Node.next = newnode or smth like that then that next is basically stores the address 
	public NodeChar ()
	{
		
	}
	public NodeChar(char n)
	{
		data = n;
		next = null;
	}
	public boolean hasNext()
	{
		return next != null;
	}
	public static void main (String[] args) {
		
	}
}

