public class Pr6_ProblemSolving
{	
	public static void main (String[] args) 
	{
		int num = IBIO.inputInt("enter number of lines ");
		for (int i = 1; i<=num; i++)
		{
			IBIO.output(stars(i));
		}
	}
	static String stars(int n)
	{ 
	  String xx = "";
	  for (int i = 0; i < n; i++)
		  xx = xx + "*";
	  return xx;
	} 
}

