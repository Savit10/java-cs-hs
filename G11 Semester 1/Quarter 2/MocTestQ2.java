public class MocTestQ2 {
	
	public static void main (String[] args) {
		IBIO.output("Savit Agarwal");
		int n = IBIO.inputInt("Calculate up to term: ");
		while (n<=1)
		{
			IBIO.output("Error - enter a positive number");
			n = IBIO.inputInt("Enter a positive number: ");
		}
		int term0 = 0;
		int term1 = 1;
		int term2 = term1 + term0;
		for (int i = 0; i<=n; i++)
		{
			if (i<=2)
			{
				IBIO.out(term0);
				IBIO.out(term1);
				IBIO.output(term2);
			}
			else
			{
				term0=term1;
				term1=term2;
				term2=term1 + term0;
				IBIO.out(term2);
			}
		}
	}
}

