public class Pr10_1 {	
	public static void main (String[] args) 
	{
		String ss = IBIO.input("enter a word: ");
		char [] xx = ss.toCharArray();
		String x = "";
		String y = ""; 
		for (int i = 0; i < ss.length(); i++)
		{
			System.out.print(xx[i]);
			x = x + xx[i] ;
			
		}
		System.out.println("");
		for (int i = (ss.length() - 1); i >= 0; i--)
		{
			System.out.print(xx[i]);
			if( i > 0)
			{
				y = y + xx[i-1];
			}
		}
		System.out.println("");
		String reverse = x + y;
		System.out.print(reverse);
			
	}
}
