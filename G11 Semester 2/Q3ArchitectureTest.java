public class Q3ArchitectureTest{
	public static int countWords(String s)
	{
		int result = 1;
		for(int i = 0; i<s.length(); i++)
		{
			if(s.charAt(i) == ' ')
			{
				result++;
			}
		}
		return result;
	}
	
	public static void main (String[] args) {
		System.out.println(countWords("This is the code to count the number of words"));
	}
}

