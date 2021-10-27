public class Program3_2
{
	public static void main (String[] args) 
	{
		int i = 1;
		int x = IBIO.inputInt("Enter a number greater than 1: ");
		if (x > 1)
		{
			do
			{
				i++;
			} while ( x % i != 0);
			
			if (x==i)
			{
				IBIO.output("Prime");
			}
			else
			{
				IBIO.output(x + " is divisible by " + i);
			}
		}
		else
		{
			IBIO.output("Good job, you can't follow instructions!");
			System.exit(1);
		}
	}
}
