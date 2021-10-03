public class Javach12
{
	public static void main(String args[])
	{
		
			int a = 3; /*IBIO.inputInt("Enter a starting number: ")*/
			int d = 2;  /*IBIO.inputInt("Enter the increment: ")*/
			int step = 4; /*IBIO.inputInt("Enter a step: ")*/
			for (int i=0; i<step; i++)
			{
				System.out.println(a); /*IBIO.output(a)*/
				a = a+d;
			}		
	}
}
