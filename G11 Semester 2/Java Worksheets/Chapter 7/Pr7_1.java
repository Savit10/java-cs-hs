public class Pr7_1 
{	
	public static void main (String[] args) 
	{
		double xx = 1;
		for (int i = 0; i<10; i++)
		{
			xx = xx * 3.732;
			int xy = (int)(xx * 100);
			double xz = (double)xy/100;
			System.out.println(xz);
		}
	}
}

