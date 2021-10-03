public class Pr14 
{
	public static void main (String args[])
	{
		int term = 1;
		for(int i=1; i<=100; i++)
		{
			System.out.println(term);
			term = term + i + 1;
		}
	}
}
