public class c1{
	public static void main (String[] args)
	{
		String ss = IBIO.input("enter a word: ");
		char [] xx = ss.toCharArray();
		String x = "";
		String y = ""; 
		for (int i = 0; i < ss.length(); i++)
		{
			System.out.print(xx[i]);
			x = xx[i] + x;
			
		}
		for (int i = (ss.length() - 1); i >= 0; i--)
		{
			System.out.print(xx[i]);
			y = xx[i+1] + y;
		}
		String reverse = x + y;
			
	}
}

