public class Pr7_2
{	
	
	public static void main (String[] args) 
	{
		double xx = 1;
		String yy;
		for (int i = 0; i<10; i++)
		{
			String n = "";  // initializes and reinitializes the space during the loop //
			xx = xx * 3.732;
			yy = "" + xx; //casting the double into string //
			for (int t = 6; t > (yy.indexOf('.')); t --) // 6 is because the maximum number before the d.p has 6 numbers//
			{
				n = n + " ";
			}
			System.out.println(n + yy);
		}
	}
}

