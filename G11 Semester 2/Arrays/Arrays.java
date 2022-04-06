public class Arrays {
	
	public static void main (String[] args) {
		int [] array = {1,2,3,4,5};
		int sum = 0;
		for (int i = 0; i<array.length; i++)
		{
			int x = array[i];
			sum = sum + x;
		}
		System.out.println(array.length);
		System.out.println(sum);
		double average = (sum/array.length);
		System.out.println(average);
	}
}

