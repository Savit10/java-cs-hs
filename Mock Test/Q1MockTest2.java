public class Q1MockTest2
{
	public static void main(String[] args)
	{
		IBIO.output("Savit Agarwal");
		int number = IBIO.inputInt("How many numbers to process?: ");
		if (number<3)
		{
			IBIO.output("Input error");
			System.exit(1);
		}
		int minimum = 0;
		int maximum = 0;
		double sum = 0;
		for( int i=1; i<=number; i++)
		{
			int x = IBIO.inputInt("Enter a number: ");
			if (i==1)
			{
				minimum = x;
				maximum = x;
			}
			if (x<minimum)
			{
				minimum=x;
			}
			if (x>maximum)
			{
				maximum=x;
			}
			sum=sum+x;
		}
		int range = maximum-minimum;
		double average = sum/number;
		IBIO.output("Minimum: " + minimum);
		IBIO.output("Maximum: " + maximum);
		IBIO.output("Range: " + range);
		IBIO.output("Average: " + average);
	}
}
