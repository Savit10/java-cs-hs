public class Program3_3 
{	
	public static void main (String[] args) 
	{
		int sum = 0;
		int n = IBIO.inputInt("Enter a number: ");
		do 
		{
			int digit = n % 10;
			sum = sum + (digit*digit*digit);
			n = n/10;
		} while ( n!=0);  /* This is because since n is an integer, 
							if it's like 0.3, n would be considered 0 
							as the decimals are removed.*/
		IBIO.output(sum);
	}
}
