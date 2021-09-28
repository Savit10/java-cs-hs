public class Javach12
{
	public static void main(String args[])
	{
		
			int a = IBIO.inputInt("Enter a starting number: ");
			int d = IBIO.inputInt("Enter the increment: ");
			int step = IBIO.inputInt("Enter a step: ");
			for ( int i=0; i<=step; i++)
			{
				IBIO.output(a);
				a = a+d;
			}		
	}
}
