public class TestQ2 {
	
	public static void main (String[] args) {
		
			IBIO.output("Savit Agarwal");
			int base;
		do {
			int base = IBIO.inputInt("Enter the base: ");
			int exponent = IBIO.inputInt("Enter the exponent: ");
			double result = 1;
			while (base >10 || exponent >10)
			{
				base = IBIO.inputInt("Enter base <=10: ");
				exponent = IBIO.inputInt("Enter exponent <=10: " );
			}
			if (base==0)
			{
				System.exit(0);
			}
			if (exponent < 0)
			{
				exponent = -exponent;
				for (int i = 0; i<exponent; i++)
				{
					result *=base;
				}
				exponent = exponent*-1;
				IBIO.output ("  1 \n--- = \n" + base + "^" + -exponent);
				IBIO.output("  1 \n----- = " + (1/result) + "\n" + result);
			} 
			else 
			{
				for (int i = 0; i<exponent; i++)
				{
					result *=base;
				}
				IBIO.output (base + " to the power of " + exponent + " = " + result); 
			}
		} while (base != 0);
	}
}
