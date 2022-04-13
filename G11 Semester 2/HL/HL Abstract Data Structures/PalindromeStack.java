import java.util.*;
public class PalindromeStack {
	
	public static void PalindromeStack(String s)
	{
		int t=0;
		char [] array = s.toCharArray();
		StackChar stack1 = new StackChar();
		for (int i = 0; i< array.length; i++)
		{
			stack1.push(array[i]);
		}
		while (!stack1.isEmpty())
		{
			if (stack1.pop() != array[t])
			{
				System.out.println(s + " is not a palindrome");
				break;
			}
			t++;
		}
		System.out.println(s + " is a palindrome");
	}
	
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string to check if its a palindrome? ");
		String x = sc.nextString();
		PalindromeStack(x);
	}
}

