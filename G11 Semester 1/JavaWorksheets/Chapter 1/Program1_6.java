/*This program asks the user for a number and outputs that many numbers of the Fibonnaci Sequence*/
public class Program1_6
{
	public static void main (String args[])
	{
		int n = IBIO.inputInt("How many numbers of the Fibonnaci Sequence to output?: ");
		int x = 0;
		int y = 1;
		int z = x+y;
		if(n>2)
		{
			IBIO.output(x);
			IBIO.output(y);
			for(int i=3; i<=n; i++)
			{
				IBIO.output(z);
				x=y;
				y=z;
				z=x+y;
			}
		}
	}
}
