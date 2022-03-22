public class PalindromeStack {
	
	public static boolean PalindromeStack(String s)
	{
		char [] array = s.toCharArray();
		Stack stack1 = new Stack();
		for (int i = 0; i< array.length; i++)
		{
			stack1.push((String)(array[i]));
		}
		while (!stack1.isEmpty())
		{
			int t=0;
			if (stack1.pop() != array[t])
			{
				return false;
			}
			t++;
		}
		return true;
	}
	
	public static void main (String[] args) {
		System.out.println(PalindromeStack("RADAR"));
	}
}

