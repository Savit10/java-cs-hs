/* Program that displays the first 20 powers of 2*/
public class Program1_5 
{
	public static void main (String args[])
	{
		
		for(int power = 1; power<=20; power++)
		{
			int number = 1;
			for(int i = 1; i<=power; i++)
			{
				number=number*2;
			}
			System.out.print("Number: " + number);   /*IBIO.out(number);*/
			System.out.println("\t Power: " + power);  /*IBIO.output(power)*/
		}
	}
}		
