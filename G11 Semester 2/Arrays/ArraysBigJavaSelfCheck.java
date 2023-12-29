public class ArraysBigJavaSelfCheck {
	
	public static void main (String[] args) {
		int [] primes = {2, 3, 5, 7, 11};
		for (int i = 0; i < 2; i++)
		{
			primes[4 - i] = primes[i];
		} // contains { 2, 3, 5, 3, 2}
		for (int i = 0; i<5; i++)
		{
			primes[i]++;
		} // contains {3, 4, 5, 4, 3}
		int [] values = new int [10];
		values[0] = 10;
		values[values.length-1] = 10;
		String [] words = new String[10];
	}
}

