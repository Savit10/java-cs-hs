public class RecursionTracing1
{
	public static int sum(int n)
	{
		System.out.println("N is " + n);
		System.out.println("Sum = " + (n + sum(n-1)));
		if (n==1)
		{
			return 1;
		}
		else
		{
			return n + sum(n-1);
		}
		
	}	
	public static int result(int n)
	{
		System.out.println("N is " + n);
		if(n==1)
		{
			return 2;
		}
		else
		{
			return 2 * result(n-1);
		}
	}
	public static void main (String args[])
	{
		System.out.println(sum(5));
		System.out.println("========");
		System.out.println(result(5));
	}
}
	
