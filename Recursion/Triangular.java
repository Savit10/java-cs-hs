public class Triangular {
	
	public static int triangularHL (int n) 
	{
		if (n==1)
		{
			return 1;
		}
		else 
		{
			return n + triangularHL(n-1);
		}
	}
	public static int triangularSL (int n)
	{
		int term = 1;
		for (int i=1; i<n; i++)
		{
			term = term + i + 1;
		}
		return(term);
	}
	public static void main (String[] args) 
	{
		System.out.println(triangularHL(4));
		System.out.println(triangularSL(4));
	}
}
