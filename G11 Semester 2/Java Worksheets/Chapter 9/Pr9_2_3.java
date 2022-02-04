public class Pr9_2_3 
{
	public static void main (String[] args) 
	{
		int[ ] num = new int[100];
		for (int i = 0; i<100; i++)
		{
				num[i] = random();
		}
		for (int n = 1; n<=6; n++)
		{	for (int i = 0; i<100; i++)
			{
				if (num[i] == n)
				{
					System.out.print(n);
				}
			}
			System.out.println("");
		}
	}
	static int random()
	{
		double xx = Math.random() * 6;
		int yy = (int)(xx+1);
		return yy;
	}
}

