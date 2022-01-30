public class Pr6_3 
{	
	public static void main (String[] args) 
	{
		int num = IBIO.inputInt("Enter the number of stars per line: ");
		int times = IBIO.inputInt("Number of times: ");
		for (int n = 1; n<=times; n++) //iman's extra wiggly loop//
		{
			for (int i = 1; i<=(num+1); i++)
			{
				IBIO.output(blank(num-i) + stars(num));
			}
			for (int i = num; i>=1; i--)
			{
				IBIO.output(blank(num-i) + stars(num)); 
			}
		}
	}
	static String stars(int n)
	{
		String output = "";
		for (int i = 0; i<n; i++)
		{
			output = output + "* ";
		}
		return output;
	}

	static String blank(int n)
	{
		String space = "";
		for (int i = 0; i<=n; i++)
		{
			space = space + " ";
		}
		return space;
	}
}
