public class MockTestQ2 {
	
	public static void main (String[] args) {
		IBIO.output("Savit Agarwal");
		int n = IBIO.inputInt("Enter a number: ");
		while (n<=0)
		{
			IBIO.output("Error - enter a positive number");
			n = IBIO.inputInt("Enter a number: ");
		}
		int term0 = 0;
		int term1 = 1;
		int term2 = 1;
		if (n>20)
		{
			for(int i=0; i<=n; i++)
			{
				term0 = term1;
				term1 = term2;
				term2 = term1 + term0;
			}
			IBIO.output("Term " + n + ":" + term2);
		}
		for (int i=0; i<=n; i++)
		{
			term0 = term1;
			term1 = term2;
			term2 = term1 + term0;
			IBIO.out(term2 + "; ");
		}	
	}
}
