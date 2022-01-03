public class Pr4_3 {
	public static void main (String[] args) {
	int num = 0;
	int sum = 0;
	int i;
	int t = 0;
	do{
		num = IBIO.inputInt("Enter a number less than 1000: ");
	} while (num>=1000);
	mainloop: for (i=1; i<=num; i++)
	{
		for (t=1; t<=num; t++)
		{
			sum = (t*t)+(i*i);
			if (sum == num)
			{
				break mainloop;
			}
		}
	}
	if (sum==num)
	{
		IBIO.output(i + " and " + t);
	}
	else
	{ 
		IBIO.output("Sum of pair of squares is impossible for this number");
	}	
}
}
