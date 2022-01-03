public class RecursiveMathChallenge {
	public static int power(int base, int exponent)
	{
		if (exponent == 0)
		{
			return 1;
		}
		else if (exponent == 1)
		{
			return base;
		}
		else
		{
			return base * power(base, exponent-1);
		}
	}
	public static int multi(int a, int b)
	{
		if (a == 0 || b == 0)
		{
			return 0;
		}
		else if (a == 1)
		{
			return b;
		}
		else if (b == 1)
		{
			return a;
		}
		else
		{
			return a + multi(a, b-1);
		}
	}
	
	public static void dectobin(int n)
	{
		if (n==0)
		{
			System.out.print(0);
			return;
		}
		dectobin(n/2);
		System.out.print(n%2);
	} 
	public static void main (String[] args) 
	{
		System.out.println(power(2,3));
		System.out.println(power(3,0));
		System.out.println(power(3,1));
		System.out.println(multi(3,4));
		System.out.println(multi(3,0));
		System.out.println(multi(0,5));
		System.out.println(multi(3,1));
		System.out.println(multi(1,6));
	}
}
