public class Pr8_2{
	
	public static void main (String[] args) {
		for (int i = 1; i<200; i++)
		{
			for (int j = 1; j< 200; j++)
			{
				for (int k = 1; k<200; k++)
				{
					for (int l = 1; l<200; l++)
					{
						if (good(i,j) && good (i,k) && good(i,l) && good (j,k) && good(j,l) && good(k,l))
						{
							if (i!=j && j!=k && i!=k)
							{
								System.out.println(i + " " + j + " " + k + " " + l);
							}
						}
					}
				}
			}
		}
	}
	public static boolean good(int a, int b)
	{
		int x = a * b + 1;
		int y = (int)(Math.sqrt(x) + .5);
		return(y*y==x);
	}
}

