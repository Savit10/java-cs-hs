/*Outputs a sequence which starts at 1 and adds the term number + 1, or adds 2, then 3... until 100*/

public class Program1_4 
{
	public static void main (String args[])
	{
		int term = 1;
		
		for(int i = 1; i<=100; i++)
		{
			System.out.println(term);
			term = term + i + 1;
		}
	}
}
