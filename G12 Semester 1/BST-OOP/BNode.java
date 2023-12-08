public class BNode
{
	public BNode left;
	public BNode right;
	public Student data;		// 'data' TYPE has to be changed

	public BNode(Student data)	// 'data' TYPE has to be changed
	{
		this.data  = data;
		this.left  = null;
		this.right = null;
	}
	
	public String toString()
	{
		return data.toString();
	}
	
	public void addRootNode(Student data)
	{
		BNode root = new BNode(data);
		print ("Building treeID with root value + " root.toString());
	}


}

