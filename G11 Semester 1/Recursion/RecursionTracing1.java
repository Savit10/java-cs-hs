public class RecursionTracing1
{
	public static int sum(int n)
	{
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
		if(n==1)
		{
			return 2;
		}
		else
		{
			return 2 * result(n-1);
		}
	}
	
	public static int mystery(int n, int a, int d)
	{
		if (n==1)
			return a;
		else
			return d + mystery (n-1, a, d);
	}
	
	public static int f(int k, int n)
	{
		if (n==k)
		{
			return k;
		}
		else
		{
			if (n>k)
			{
				return f(k,n-k);
			}
			else
			{
				return f(k-n,n);
			}
		}
	}
	public static void main (String args[])
	{
		System.out.println(sum(5));
		System.out.println("========");
		System.out.println(result(5));
		System.out.println("========");
		System.out.println(mystery(3,2,6));
		System.out.println("========");
		System.out.println(f(6,8));
	}
}
	
