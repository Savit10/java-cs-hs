public class Program3_1 
{
	public static void main (String[] args) 
	{
		int x;
		do
		{
			x = IBIO.inputInt("Enter a even number between 0 and 100: ");
		} while (x > 0 && x < 100 && x % 2 == 0);
		IBIO.output("Thank You");
			
	}
}

