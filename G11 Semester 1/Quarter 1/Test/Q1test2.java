public class Q1test2 
{
	public static void main (String[] args) 
	{
		IBIO.output("Savit agarwal"); //Q1
		int n = IBIO.inputInt("Enter an integer between 1 and 20: "); //Q2
		if (n<0 || n>20) // Q3 & Q4 & Q8
		{
			IBIO.output("Error - number out of range");
			main(null); // Q9
		}
		long result = 1; //Q5
		for (int i=n; i>1; i--)
		{
			result= result * i;
		}
		if (n>10) //Q7
		{
			IBIO.output(n + "! = " + result);
		}
		else //Q6
		{
			if (n==1)
			{
				IBIO.output("1! = 1");
			}
			else
			{	
				IBIO.out( n + "! = ");
				for(int t = n; t>1; t--)
				{
					IBIO.out(t + " x ");
				}
				IBIO.output("1 = " + result);
			}
		}
		int e = 0; //Q10
		for (e=0; result>0; result=(result/10))
		{
			e++;
		}
		IBIO.output("Digits: " + e);
	}
}
