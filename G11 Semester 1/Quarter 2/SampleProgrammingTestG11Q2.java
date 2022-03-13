public class SampleProgrammingTestG11Q2 
{	
	public static void main (String[] args) 
	{
		System.out.println("Savit Agarwal");
		do {
			int power = 1;
			int n = IBIO.inputInt("Enter a number less than 10:		");
			if (n>=1 && n<=9)
			{
				for (int i=1; i<=n; i++)
				{
					String square = (String)(i*i);
					for (int t = 0; t<(2-square.length); t++)
					{
						square = " " + square;
					}
					int power = power * n;
					String power2 = (String)(power);
					for (int v = 0; v < (9-power2.length); v++)
					{
						power2 = " " + power2;
					}
					System.out.print(i + "  " + square + "  " + power);
				}
			}
			else
			{
				System.out.println("Error: number not in range");
			}
		} while (n<1 || n>9);
	}
}

