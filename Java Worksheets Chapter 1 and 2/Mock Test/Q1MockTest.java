/*

This program will calculate the minimum, maximum, range, and average of a set of input
numbers. It will also check whether the maximum is a prime number.
  
*/

public class Q1MockTest	
{
	public static void main(String[] args)
	{
		IBIO.output("Savit Agarwal");
		int number = IBIO.inputInt("How many numbers to process?: ");
		if (number<3)
		{ IBIO.output("Input error");
			System.exit(1);
		}
		int min = 0;
		int max = 0;
		int sum = 0;
		for( int i=0; i<number; i++)
		{
			int x = IBIO.inputInt("Enter number: ");
			if (i==0)
			{
				min = x;
				max = x;
			}
			if(x<min)
			{
				min = x;
			}
			if (x>max)
			{
				max = x;
			}
			sum = sum + x;
		}	
		int range = max-min;
		int average = sum/number;
		IBIO.output("Minimum: " + min);
		IBIO.output("Maximum: " + max);
		IBIO.output("Range: " + range);
		IBIO.output("Average: " + average);
		int t=0;
		for(int factor=2; factor<max; factor++)
		{
			if(factor<max && max%factor==0)
			{
				t=1;
			}
			else 
			{
				if (factor>max)
				{
					t=2;
				}
			}
		}
		if (t==1)
		{
			IBIO.output("Not prime");
		}
		else
		{
			IBIO.output("Prime");
		}		
	}
}


/*
Savit Agarwal
How many numbers to process?: 5
Enter number: 3
Enter number: 4
Enter number: 5
Enter number: 6
Enter number: 7
Minimum: 3
Maximum: 7
Range: 4
Average: 5
Prime
*/
