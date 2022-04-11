import java.util.*;
public class isPalindrome {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String s = sc.nextLine();
		while(s.length()==1)
		{
			System.out.println("length of string is 1, error");
			System.out.println("Enter a string: ");
			s = sc.nextLine();
		}
		char [] array = s.toCharArray();
		int size = array.length;
		boolean t = true;
		for (int i = 0; i < (size/2); i++)
		{
			if (array[i] != array[size - i - 1])
			{
				t = false;
				break;
			}
		}
		if (t == false)
		{
			System.out.println("String is not a palindrome");
		}
		else
		{
			System.out.println("String is a palindrome");
		}	
	}
}
