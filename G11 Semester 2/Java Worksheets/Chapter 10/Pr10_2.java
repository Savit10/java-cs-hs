public class Pr10_2 {
	
	public static void main (String[] args) {
		/* int binary = IBIO.inputInt("Enter a binary number: ");
		int denary = 0;
		int i = 0;
		while (binary >1)
		{
			int remainder = binary%10;
			if ( remainder != 0 || remainder != 1)
			{
				binary = IBIO.inputInt("Error - Enter a correct binary number: ");
			}
			denary = (denary*remainder) +(int)(Math.pow(2,i));
			binary = binary/10;
			i++;
		}
		System.out.print(denary); */	
				
		/* String binary = IBIO.input("Enter a binary number: ");
		int [] arr = b;
		for (int i = 0; i< binary.length(); i++)
		{
			
		int denary = 0;
		for (int i = 0; i < binary.length(); i ++)
		{
			int x = (int) (arr[i]);
			System.out.println("x is " x);
			if (x == 0)
			{
				denary *= 2;
			}
			else if ( x== 1)
			{
				denary = (denary * 2) + 1;
			}
			else
			{
				System.out.println("Error - incorrect number entered");
				break;
			}
		}
		System.out.println("The denary equivalent of " + binary + " is " + denary); */
		int binary = IBIO.inputInt("Enter a binary number: ");
		int remainder = 0; 
		int denary = 0;
		int i =0;
		do {
			remainder = binary % 10;
			denary = denary + (remainder * (int)(Math.pow(2,i)));
			binary /= 10;
			i++;
		} while (binary !=0);
		System.out.println(denary); // This program converts binary to decimal without validation routine //
		

		
			
	}
}

