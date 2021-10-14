public class Q1Test
{
	public static void main (String[] args) 
	{
		IBIO.output("Savit Agarwal"); //Q1
		int n = 0;
		for (int i=1; i<=20; i++) /*the number 20 can be bigger*/
		{
			n = IBIO.inputInt("Enter an integer between 1 and 20: "); 
			if (n<0 || n>20)
			{
				IBIO.output("Error-number out of range");
				//System.exit(1); removed due to question 9
			}
			else
			{
				break;
			}
		}
		long result = 1;  //Q5
		for (int i=n; i>=1; i--)
		{
			result = result*i;
		}
		
		if (n<=10)
		{
			IBIO.out(n + "! = ");    //Q6
			for(int t=n; t>1; t--)
			{
				IBIO.out(t + " x ");
			}
				IBIO.out("1 = " + result);
		}
		
		else
		{
			IBIO.output(n + "! = " + result); //Q7
		}
		int e = 0;
		for(e = 0; result>0; result=(result/10))
		{
			e = e + 1;
		}
		IBIO.output("Digits: " + e);
	}
}
