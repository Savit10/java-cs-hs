public class PasswordGuessing {
	
	public static void main (String[] args) {
		String p = IBIO.input("What is your password? ");
		String y = ""; 
		char e = 0;
		int t;
		// char[] alphabet = {'a', 'b', 'c', 'd','e', 'f', 'g', 'h','i', 'j', 'k', 'l','m', 'n', 'o', 'p','q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
		char [] alphabet = new char[26];
		int i = 0;
		for (char c = 'a'; c<= 'z'; c++) //char of a letter can work like an increment because they are stored as integers in unicode
		{
			alphabet[i] = c;
			i++;
		}
		for (t = 0; t<(p.length()); t++)
		{
			for (i = 0; i<(alphabet.length); i++)
			{
				char x = p.charAt(t);
				if (x == alphabet[i])
				{
					e = alphabet[i];
					break;
				}
			}
			y = y + e;
		}
		System.out.println("The password is " + y);
	}
}

