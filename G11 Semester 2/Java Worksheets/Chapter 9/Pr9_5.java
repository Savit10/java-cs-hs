public class Pr9_5 
{	
	public final static int SIZE = 1000;
	public static void main (String[] args) 
	{
		int [ ] num = new int[SIZE];
		for (int i = 0; i < SIZE; i++)
		{
			num[i] = random() + random();
		}
		for (int n = 2; n<=12; n++)
		{	
			System.out.print(pad(n)+ " ");
			for (int i = 0; i<SIZE; i++)
			{
				if (num[i] == n)
				{
					System.out.print("X");
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
	static String pad(int t)
	{
		String stuff = "" + t;
		while (stuff.length()<2)
		{
			stuff = " " + stuff;
		}
		return stuff;
	}
}

