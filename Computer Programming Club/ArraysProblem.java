public class ArraysProblem{
	
	public static void main (String[] args) {
		String [] array1 = {"a", "b", "c", "d", "e", "p"};
		String [] array2 = {"a", "g", "f", "w","f"};
		//problem: compare the first and the last elements of two arrays and output whether they're the same or not//
		// hint: you have to use a if statement and the "length" of an array and the index//
		if (array1[0].equals(array2[0]) && array1[array1.length-1].equals(array2[array2.length-1]))
		{
			System.out.println("They're the same elements");
		}
		else
		{
			System.out.println("They're not the same");
		}
	}
}

