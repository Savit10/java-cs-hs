public class Program3_4 
{	
	public static void main (String[] args) 
	{
		int counter = 0;
		int n = IBIO.inputInt("Enter a number: ");
		do
		{
			if (n%2 == 0)
			{
				n = n/2;
			}
			else
			{
				n= (3*n) + 1;
			}
			counter = counter + 1;
		} while (n != 1 );
		IBIO.output("Steps: " + counter);
	}
}
